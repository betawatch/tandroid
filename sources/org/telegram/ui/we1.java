package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class we1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ af1 a;

    public we1(af1 af1Var) {
        this.a = af1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        af1 af1Var = this.a;
        if (i10 == -1) {
            af1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = af1Var.e.getText() == null ? null : af1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) af1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(af1Var.e);
                return;
            }
            if (af1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(af1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            af1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = af1Var.getMessagesController().getInputPeer(af1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j3 = af1Var.b;
            if (j3 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j3;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = af1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ms0(this, obj, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = af1Var.e.getText() != null ? af1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) af1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(af1Var.e);
                return;
            }
            if (!af1Var.w.title.equals(obj2) || af1Var.w.icon_emoji_id != af1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = af1Var.getMessagesController().getInputPeer(af1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = af1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = af1Var.w.icon_emoji_id;
                long j11 = af1Var.b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new bi.c7(8));
            }
            if (af1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = af1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = af1Var.getMessagesController().getInputPeer(af1Var.a);
                    tL_messages_editForumTopic2.topic_id = af1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !af1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new bi.c7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = af1Var.w;
            long j12 = af1Var.b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (af1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            af1Var.getMessagesController().getTopicsController().onTopicEdited(af1Var.a, af1Var.w);
            af1Var.finishFragment();
        }
    }
}
