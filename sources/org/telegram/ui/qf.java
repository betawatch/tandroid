package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ qf(qn qnVar, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = messageObject;
    }

    @Override // org.telegram.ui.Components.dj0
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                qn qnVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", qnVar.P5);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                qnVar.A7(true);
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", qnVar2.P5);
                }
                qnVar2.presentFragment(new ProfileActivity(bundle2, null));
                qnVar2.A7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        qn qnVar = this.b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, qnVar.aa)};
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
        tL_messages_editMessage.peer = qnVar.getMessagesController().getInputPeer(qnVar.P5);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new lg(qnVar, c2VarArr, qnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new y9(qnVar, c2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
