// default package

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class svb extends c6 {
    public final /* synthetic */ wvb a;

    public svb(wvb wvbVar) {
        this.a = wvbVar;
    }

    @Override // c6
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        wvb wvbVar = this.a;
        if (i == -1) {
            wvbVar.finishFragment();
            return;
        }
        if (i == 1) {
            String obj = wvbVar.e.getText() == null ? null : wvbVar.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) wvbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                gm.z3(wvbVar.e);
                return;
            }
            if (wvbVar.r) {
                return;
            }
            he heVar = new he(3, null, wvbVar.getParentActivity());
            heVar.q(500L);
            wvbVar.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = wvbVar.getMessagesController().i1(wvbVar.a);
            tL_messages_createForumTopic.title = obj;
            long j = wvbVar.b;
            if (j != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
            tL_messages_createForumTopic.icon_color = wvbVar.F;
            tL_messages_createForumTopic.flags |= 1;
            i4 = ((d) wvbVar).currentAccount;
            ConnectionsManager.getInstance(i4).sendRequest(tL_messages_createForumTopic, new fm8((Object) this, (Object) obj, heVar, (byte) 25));
            return;
        }
        if (i == 2) {
            String obj2 = wvbVar.e.getText() != null ? wvbVar.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) wvbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                gm.z3(wvbVar.e);
                return;
            }
            if (!wvbVar.x.title.equals(obj2) || wvbVar.x.icon_emoji_id != wvbVar.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = wvbVar.getMessagesController().i1(wvbVar.a);
                TLRPC.TL_forumTopic tL_forumTopic = wvbVar.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j2 = wvbVar.x.icon_emoji_id;
                long j3 = wvbVar.b;
                if (j2 != j3) {
                    tL_messages_editForumTopic.icon_emoji_id = j3;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i2 = ((d) wvbVar).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editForumTopic, new nf2((byte) 0));
            }
            if (wvbVar.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = wvbVar.x;
                if (tL_forumTopic2.id == 1 && (!r10.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = wvbVar.getMessagesController().i1(wvbVar.a);
                    tL_messages_editForumTopic2.topic_id = wvbVar.x.id;
                    tL_messages_editForumTopic2.hidden = !wvbVar.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i3 = ((d) wvbVar).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editForumTopic2, new nf2((byte) 0));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = wvbVar.x;
            long j4 = wvbVar.b;
            tL_forumTopic3.icon_emoji_id = j4;
            int i5 = tL_forumTopic3.flags;
            if (j4 != 0) {
                tL_forumTopic3.flags = i5 | 1;
            } else {
                tL_forumTopic3.flags = i5 & (-2);
            }
            tL_forumTopic3.title = obj2;
            if (wvbVar.d != null) {
                tL_forumTopic3.hidden = !r11.d.h;
            }
            qwb qwbVar = wvbVar.getMessagesController().g4;
            long j5 = wvbVar.a;
            qwbVar.getMessagesStorage().c2(j5, wvbVar.x, 35);
            qwbVar.y(-j5, true);
            wvbVar.finishFragment();
        }
    }
}
