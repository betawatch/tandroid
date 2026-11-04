package org.telegram.ui;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v20 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.m60 {
    public final /* synthetic */ c30 a;

    public /* synthetic */ v20(c30 c30Var) {
        this.a = c30Var;
    }

    @Override // org.telegram.ui.Components.m60
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        x30 x30Var = this.a.b;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        org.telegram.messenger.c cVar = x30Var.l1;
        if (r3Var == null) {
            return;
        }
        boolean z13 = inputPeer instanceof TLRPC.TL_inputPeerUser;
        TLObject a22 = z13 ? org.telegram.messenger.hp.s1(cVar.a).a2(Long.valueOf(inputPeer.user_id)) : inputPeer instanceof TLRPC.TL_inputPeerChat ? org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(inputPeer.chat_id)) : org.telegram.messenger.hp.s1(cVar.a).M0(Long.valueOf(inputPeer.channel_id));
        if (!x30Var.S2.j()) {
            if (VoIPService.getSharedInstance() == null || !z10) {
                return;
            }
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            x30Var.t2 = a22;
            return;
        }
        x30Var.m1().k(0L, 37, a22, x30Var.R2, null, null);
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            x30Var.s2 = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        } else if (z13) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            x30Var.s2 = tL_peerUser;
            tL_peerUser.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            x30Var.s2 = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        }
        x30Var.Q2 = inputPeer;
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(cVar.a).N0(x30Var.k1());
        if (N0 != null) {
            N0.groupcall_default_join_as = x30Var.s2;
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags |= 32768;
            } else {
                N0.flags |= 67108864;
            }
        }
        TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
        savedefaultgroupcalljoinas.peer = org.telegram.messenger.hp.l1(x30Var.R2);
        savedefaultgroupcalljoinas.join_as = inputPeer;
        ConnectionsManager.getInstance(cVar.a).sendRequest(savedefaultgroupcalljoinas, new ei.u5(9));
        x30Var.L1();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        c30 c30Var = this.a;
        x30 x30Var = c30Var.b;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        org.telegram.messenger.c cVar = x30Var.l1;
        if (r3Var.j()) {
            int i10 = cVar.a;
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i10).N0(x30Var.k1());
            if (N0 != null) {
                N0.flags &= -2097153;
                N0.call = null;
                org.telegram.messenger.hs.f(i10).k(org.telegram.messenger.hs.w2, Long.valueOf(x30Var.k1()), Long.valueOf(x30Var.S2.b.id), Boolean.FALSE);
            }
            TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
            org.telegram.messenger.r3 r3Var2 = x30Var.S2;
            discardgroupcall.call = r3Var2.g(r3Var2.a);
            ConnectionsManager.getInstance(i10).sendRequest(discardgroupcall, new l(c30Var, 9));
        } else if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(1);
        }
        x30Var.dismiss();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.v2, new Object[0]);
    }
}
