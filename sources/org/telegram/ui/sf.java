package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements org.telegram.ui.Components.pk0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ sf(wn wnVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = messageObject;
    }

    @Override // org.telegram.ui.Components.pk0
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                wn wnVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", wnVar.j6);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                wnVar.J7(true);
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", wnVar2.j6);
                }
                wnVar2.presentFragment(new ProfileActivity(bundle2, null));
                wnVar2.J7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        wn wnVar = this.b;
        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(wnVar.getParentActivity(), 3, wnVar.ua)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wnVar.getMessagesController().getInputPeer(wnVar.j6);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new ng(wnVar, e2VarArr, wnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ea(wnVar, e2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
