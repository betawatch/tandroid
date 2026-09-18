package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ve1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ze1 a;

    public ve1(ze1 ze1Var) {
        this.a = ze1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        ze1 ze1Var = this.a;
        if (i10 == -1) {
            ze1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = ze1Var.e.getText() == null ? null : ze1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ze1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ze1Var.e);
                return;
            }
            if (ze1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ze1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            ze1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j3 = ze1Var.b;
            if (j3 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j3;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = ze1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ns0(this, obj, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = ze1Var.e.getText() != null ? ze1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) ze1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ze1Var.e);
                return;
            }
            if (!ze1Var.w.title.equals(obj2) || ze1Var.w.icon_emoji_id != ze1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = ze1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = ze1Var.w.icon_emoji_id;
                long j11 = ze1Var.b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.t7(8));
            }
            if (ze1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ze1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ze1Var.getMessagesController().getInputPeer(ze1Var.a);
                    tL_messages_editForumTopic2.topic_id = ze1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !ze1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.t7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ze1Var.w;
            long j12 = ze1Var.b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (ze1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            ze1Var.getMessagesController().getTopicsController().onTopicEdited(ze1Var.a, ze1Var.w);
            ze1Var.finishFragment();
        }
    }
}
