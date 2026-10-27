package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ud1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yd1 a;

    public ud1(yd1 yd1Var) {
        this.a = yd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        yd1 yd1Var = this.a;
        if (i10 == -1) {
            yd1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = yd1Var.e.getText() == null ? null : yd1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) yd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(yd1Var.e);
                return;
            }
            if (yd1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(yd1Var.getParentActivity(), 3, null);
            e2Var.r(500L);
            yd1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = yd1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = yd1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new cs0(this, obj, e2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = yd1Var.e.getText() != null ? yd1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) yd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(yd1Var.e);
                return;
            }
            if (!yd1Var.w.title.equals(obj2) || yd1Var.w.icon_emoji_id != yd1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = yd1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = yd1Var.w.icon_emoji_id;
                long j12 = yd1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new di.d6(8));
            }
            if (yd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = yd1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = yd1Var.getMessagesController().getInputPeer(yd1Var.a);
                    tL_messages_editForumTopic2.topic_id = yd1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !yd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new di.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = yd1Var.w;
            long j13 = yd1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (yd1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            yd1Var.getMessagesController().getTopicsController().onTopicEdited(yd1Var.a, yd1Var.w);
            yd1Var.finishFragment();
        }
    }
}
