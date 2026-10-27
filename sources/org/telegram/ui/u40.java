package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u40 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.s80 {
    public final /* synthetic */ a50 a;

    public /* synthetic */ u40(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // org.telegram.ui.Components.s80
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        x50 x50Var = this.a.b;
        ChatObject.Call call = x50Var.a1;
        AccountInstance accountInstance = x50Var.d;
        if (call == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject user = z13 ? accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
        if (!x50Var.a1.isScheduled()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            x50Var.B0 = user;
            return;
        }
        x50Var.k1().k(0L, 37, user, x50Var.Z0, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            x50Var.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            x50Var.A0 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            x50Var.A0 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        x50Var.Y0 = inputPeer;
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(x50Var.i1());
        if (chatFull != null) {
            chatFull.groupcall_default_join_as = x50Var.A0;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.flags |= 32768;
            } else {
                chatFull.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(x50Var.Z0);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new di.d6(8));
        x50Var.J1();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        a50 a50Var = this.a;
        x50 x50Var = a50Var.b;
        ChatObject.Call call = x50Var.a1;
        AccountInstance accountInstance = x50Var.d;
        if (call.isScheduled()) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(x50Var.i1());
            if (chatFull != null) {
                chatFull.flags &= -2097153;
                chatFull.call = null;
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(x50Var.i1()), Long.valueOf(x50Var.a1.call.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            discardgroupcall.call = x50Var.a1.getInputGroupCall();
            accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new l(a50Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        x50Var.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }
}
