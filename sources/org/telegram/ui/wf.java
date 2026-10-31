package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements org.telegram.ui.Components.ui0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.messenger.jj c;

    public /* synthetic */ wf(un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = jjVar;
    }

    @Override // org.telegram.ui.Components.ui0
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                un unVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", unVar.j6);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                unVar.I7(true);
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", unVar2.j6);
                }
                unVar2.presentFragment(new ProfileActivity(bundle2, null));
                unVar2.I7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        un unVar = this.b;
        org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, unVar.getParentActivity(), unVar.xa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.jj jjVar = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) jjVar.k.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = unVar.getMessagesController().i1(unVar.j6);
        tL_messages_editMessage.id = jjVar.f1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.i0.h3(new og(unVar, x1VarArr, unVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(unVar, x1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
