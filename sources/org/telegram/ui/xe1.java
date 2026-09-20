package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xe1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ bf1 a;

    public xe1(bf1 bf1Var) {
        this.a = bf1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        bf1 bf1Var = this.a;
        if (i10 == -1) {
            bf1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = bf1Var.e.getText() == null ? null : bf1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) bf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(bf1Var.e);
                return;
            }
            if (bf1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(bf1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            bf1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j3 = bf1Var.b;
            if (j3 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j3;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = bf1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ns0(this, obj, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = bf1Var.e.getText() != null ? bf1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) bf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(bf1Var.e);
                return;
            }
            if (!bf1Var.w.title.equals(obj2) || bf1Var.w.icon_emoji_id != bf1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = bf1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = bf1Var.w.icon_emoji_id;
                long j11 = bf1Var.b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.t7(8));
            }
            if (bf1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = bf1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = bf1Var.getMessagesController().getInputPeer(bf1Var.a);
                    tL_messages_editForumTopic2.topic_id = bf1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !bf1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) bf1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.t7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = bf1Var.w;
            long j12 = bf1Var.b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (bf1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            bf1Var.getMessagesController().getTopicsController().onTopicEdited(bf1Var.a, bf1Var.w);
            bf1Var.finishFragment();
        }
    }
}
