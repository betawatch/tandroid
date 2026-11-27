// default package

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qyb extends rf0 {
    public static final int[] w = new int[5];
    public zh6 a;
    public zh6 b;
    public LongSparseIntArray c;
    public LongSparseIntArray d;
    public zh6 e;
    public zh6 f;
    public LongSparseLongArray h;
    public LongSparseIntArray n;
    public LongSparseIntArray r;
    public zh6 s;

    public static long p(int i, long j) {
        return j + (i << 12);
    }

    public final void A(int i, long j, boolean z) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z;
        TLRPC.TL_forumTopic f = f(j, i);
        if (f != null) {
            boolean z2 = tL_messages_editForumTopic.hidden;
            f.hidden = z2;
            if (z2) {
                f.closed = true;
            }
            D(j2, f, 44);
            getMessagesStorage().c2(j2, f, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i, long j, long j2, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic f = f(j3, j2);
        if (f == null) {
            return -1;
        }
        if (z) {
            i += f.unread_poll_votes_count;
            f.unread_poll_votes_count = i;
            if (i < 0) {
                i = 0;
                f.unread_poll_votes_count = 0;
            }
        } else {
            f.unread_poll_votes_count = i;
        }
        y(j3, true);
        return i;
    }

    public final int C(int i, long j, long j2, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic f = f(j3, j2);
        if (f == null) {
            return -1;
        }
        if (z) {
            i += f.unread_reactions_count;
            f.unread_reactions_count = i;
            if (i < 0) {
                i = 0;
                f.unread_reactions_count = 0;
            }
        } else {
            f.unread_reactions_count = i;
        }
        y(j3, true);
        return i;
    }

    public final void D(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        long j2 = -j;
        TLRPC.TL_forumTopic f = f(j2, tL_forumTopic.id);
        if (f != null) {
            if ((i & 1) != 0) {
                f.title = tL_forumTopic.title;
            }
            if ((i & 2) != 0) {
                f.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i & 8) != 0) {
                f.closed = tL_forumTopic.closed;
            }
            if ((i & 4) != 0) {
                f.pinned = tL_forumTopic.pinned;
            }
            if ((i & 32) != 0) {
                f.hidden = tL_forumTopic.hidden;
            }
            y(j2, true);
        }
    }

    public final void E(ArrayList arrayList, long j) {
        if (j > 0) {
            return;
        }
        long j2 = -j;
        hl.c3(new gyb(this, j, arrayList, xc2.p0(getMessagesController().M0(Long.valueOf(j2))), j2, (byte) 0));
    }

    public final void a(long j, ArrayList arrayList, boolean z) {
        if (arrayList != null) {
            ArrayList l = l(j);
            byte b = 0;
            boolean z2 = true;
            if (l != null) {
                boolean z3 = false;
                for (int i = 0; i < l.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                    if (tL_forumTopic != null) {
                        int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                        boolean z4 = indexOf >= 0;
                        if (tL_forumTopic.pinned != z4 || (z4 && tL_forumTopic.pinnedOrder != indexOf)) {
                            tL_forumTopic.pinned = z4;
                            tL_forumTopic.pinnedOrder = indexOf;
                            getMessagesStorage().c2(j, tL_forumTopic, 4);
                            z3 = true;
                        }
                    }
                }
                z2 = z3;
            }
            if (z && z2) {
                hl.c3(new fyb(this, b));
            }
        }
    }

    public final void b() {
        hl.c3(new fyb(this, (byte) 1));
    }

    public final void c(int i, int i2, long j) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j2 = -j;
        tL_messages_deleteTopicHistory.peer = getMessagesController().j1(j2);
        tL_messages_deleteTopicHistory.top_msg_id = i;
        if (i2 == 0) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new xd7(messagesStorage, j2, i, (byte) 2));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new lyb(this, j, i));
    }

    public final void d(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j);
        zh6 zh6Var = (zh6) this.b.f(j);
        if (zh6Var != null && arrayList2 != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long intValue = ((Integer) arrayList.get(i)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) zh6Var.f(intValue);
                zh6Var.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j, true);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c(((Integer) arrayList.get(i2)).intValue(), 0, j);
        }
    }

    public final boolean e(long j) {
        return this.d.get(j, 0) == 1;
    }

    public final TLRPC.TL_forumTopic f(long j, long j2) {
        zh6 zh6Var = (zh6) this.b.f(j);
        if (zh6Var == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) zh6Var.f(j2);
        if (tL_forumTopic != null || !getMessagesController().B2(-j)) {
            return tL_forumTopic;
        }
        int i = ro4.a;
        return (TLRPC.TL_forumTopic) zh6Var.f((int) (j2 ^ (j2 >>> 32)));
    }

    public final ArrayList g(long j) {
        ArrayList l = l(j);
        ArrayList arrayList = new ArrayList();
        if (l != null) {
            for (int i = 0; i < l.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j) {
        ArrayList arrayList = (ArrayList) this.a.f(j);
        int[] iArr = w;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i);
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().p2(-j, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, r47 r47Var, TextPaint textPaint) {
        return j(chat, r47Var, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, r47 r47Var, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f;
        TLRPC.MessageReplyHeader messageReplyHeader = r47Var.k.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i = messageReplyHeader.reply_to_top_id;
        if (i == 0) {
            i = messageReplyHeader.reply_to_msg_id;
        }
        if (i == 0 || (f = f(chat.id, i)) == null) {
            return null;
        }
        return ro4.k(f, textPaint, drawableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j, long j2) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f = f(-j, j2);
        if (f == null || f.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().B2(j)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().j1(j2);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().j1(j);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().j1(j);
            tL_messages_getReplies2.msg_id = (int) j2;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new op6(this, f, j, j2, (byte) 3));
    }

    public final ArrayList l(long j) {
        return (ArrayList) this.a.f(j);
    }

    public final void m(final long j, final long j2, final o30 o30Var) {
        jf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new ue2((Object) messagesStorage, -j, (Object) new Consumer() { // from class: cyb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                qyb qybVar = qyb.this;
                qybVar.getClass();
                hl.c3(new hv4(qybVar, j, (ArrayList) obj, j2, o30Var));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$-CC.$default$andThen(this, consumer);
            }
        }, (byte) 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r0.c == 0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final int i, final long j, final boolean z) {
        TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics;
        zh6 zh6Var = this.s;
        LongSparseIntArray longSparseIntArray = this.c;
        int i2 = 0;
        if (longSparseIntArray.get(j, 0) != 0) {
            return;
        }
        if (f11.a) {
            cc4.b("load topics " + j + " fromCache=" + z + " loadType=" + i);
        }
        longSparseIntArray.put(j, 1);
        if (z) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new ue2((Object) messagesStorage, -j, (Object) new Consumer() { // from class: hyb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    final ArrayList arrayList = (ArrayList) obj;
                    final qyb qybVar = qyb.this;
                    final long j2 = j;
                    final boolean z2 = z;
                    final byte b = i;
                    hl.c3(new Runnable() { // from class: jyb
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z3 = f11.a;
                            long j3 = j2;
                            ArrayList arrayList2 = arrayList;
                            if (z3) {
                                c00.q(arrayList2 == null ? 0 : arrayList2.size(), ik8.o(j3, "loaded from cache ", " topics_count="));
                            }
                            qyb qybVar2 = qyb.this;
                            qybVar2.c.put(j3, 0);
                            qybVar2.u(j3, arrayList2, null, z2, b, -1);
                            qybVar2.y(j3, true);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            }, (byte) 5));
            return;
        }
        long j2 = -j;
        if (getMessagesController().B2(j2)) {
            TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getSavedDialogs.parent_peer = uc7.s1(this.currentAccount).j1(j2);
            tL_messages_getSavedDialogs.flags |= 2;
            oyb oybVar = (oyb) zh6Var.f(j);
            if (oybVar == null) {
                oybVar = new oyb();
            }
            long j3 = 0;
            if (i != 0 && i != 3) {
                if (i != 1) {
                    tL_messages_getForumTopics = tL_messages_getSavedDialogs;
                } else {
                    tL_messages_getSavedDialogs.limit = 100;
                    tL_messages_getSavedDialogs.offset_date = oybVar.b;
                    tL_messages_getSavedDialogs.offset_id = oybVar.a;
                    tL_messages_getSavedDialogs.offset_peer = uc7.s1(this.currentAccount).j1(oybVar.c);
                    tL_messages_getForumTopics = tL_messages_getSavedDialogs;
                    if (f11.a) {
                        StringBuilder sb = new StringBuilder("offset_date=");
                        sb.append(oybVar.b);
                        sb.append(" offset_id=");
                        sb.append(oybVar.a);
                        sb.append(" offset_topic=");
                        ik8.q(oybVar.c, sb);
                        tL_messages_getForumTopics = tL_messages_getSavedDialogs;
                    }
                }
            }
            ArrayList l = l(j);
            tL_messages_getSavedDialogs.limit = 20;
            tL_messages_getSavedDialogs.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
            tL_messages_getSavedDialogs.offset_date = 0;
            tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
            if (l != null) {
                int min = Math.min(l.size(), 20);
                if (l.size() >= min) {
                    long j4 = 0;
                    while (i2 < min) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i2);
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null && message.id == tL_forumTopic.top_message) {
                            long j5 = (message.flags & 32768) != 0 ? message.edit_date : message.date;
                            if (tL_forumTopic.pinned) {
                                j3 = 1;
                            }
                            j4 = ls6.r(ls6.r(ls6.r(ls6.r(j4, j3), Math.abs(wf3.n(tL_forumTopic.from_id))), tL_forumTopic.top_message), j5);
                            i2++;
                            j3 = 0;
                        }
                    }
                    j3 = j4;
                }
                tL_messages_getSavedDialogs.hash = j3;
                tL_messages_getForumTopics = tL_messages_getSavedDialogs;
            }
            j3 = 0;
            tL_messages_getSavedDialogs.hash = j3;
            tL_messages_getForumTopics = tL_messages_getSavedDialogs;
        } else {
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics2 = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics2.peer = getMessagesController().j1(j2);
            tL_messages_getForumTopics = tL_messages_getForumTopics2;
            if (i == 0) {
                tL_messages_getForumTopics2.limit = 20;
                tL_messages_getForumTopics = tL_messages_getForumTopics2;
            } else if (i == 1) {
                tL_messages_getForumTopics2.limit = 100;
                oyb oybVar2 = (oyb) zh6Var.f(j);
                if (oybVar2 == null) {
                    oybVar2 = new oyb();
                }
                tL_messages_getForumTopics2.offset_date = oybVar2.b;
                tL_messages_getForumTopics2.offset_id = oybVar2.a;
                tL_messages_getForumTopics2.offset_topic = (int) oybVar2.c;
                tL_messages_getForumTopics = tL_messages_getForumTopics2;
                if (f11.a) {
                    StringBuilder sb2 = new StringBuilder("offset_date=");
                    sb2.append(oybVar2.b);
                    sb2.append(" offset_id=");
                    sb2.append(oybVar2.a);
                    sb2.append(" offset_topic=");
                    ik8.q(oybVar2.c, sb2);
                    tL_messages_getForumTopics = tL_messages_getForumTopics2;
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new RequestDelegate() { // from class: iyb
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final zh6 zh6Var2 = new zh6();
                boolean z2 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                final qyb qybVar = qyb.this;
                final long j6 = j;
                final byte b = i;
                int i3 = 0;
                if (z2) {
                    final TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i3 < tL_messages_savedDialogs.messages.size()) {
                        zh6Var2.k(tL_messages_savedDialogs.messages.get(i3).id, tL_messages_savedDialogs.messages.get(i3));
                        i3++;
                    }
                    final byte b2 = 0;
                    hl.c3(new Runnable() { // from class: kyb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            TLRPC.messages_SavedDialogs messages_saveddialogs = tL_messages_savedDialogs;
                            switch (b3) {
                                case 0:
                                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs2 = (TLRPC.TL_messages_savedDialogs) messages_saveddialogs;
                                    qyb qybVar2 = qybVar;
                                    qybVar2.getMessagesStorage().j1(tL_messages_savedDialogs2.users, tL_messages_savedDialogs2.chats, true, true);
                                    qybVar2.getMessagesController().j4(tL_messages_savedDialogs2.users, false);
                                    qybVar2.getMessagesController().c4(tL_messages_savedDialogs2.chats, false);
                                    LongSparseIntArray longSparseIntArray2 = qybVar2.c;
                                    long j7 = j6;
                                    longSparseIntArray2.put(j7, 0);
                                    ArrayList m = ro4.m(tL_messages_savedDialogs2.dialogs);
                                    int size = tL_messages_savedDialogs2.dialogs.size();
                                    zh6 zh6Var3 = zh6Var2;
                                    byte b4 = b;
                                    qybVar2.u(j7, m, zh6Var3, false, b4, size);
                                    qybVar2.y(j7, true);
                                    qybVar2.getMessagesStorage().z1(qybVar2.getConnectionsManager().getCurrentTime(), -j7, (List) qybVar2.a.f(j7), true);
                                    qybVar2.getMessagesStorage().g1(tL_messages_savedDialogs2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogs2.dialogs.isEmpty() && b4 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) c00.g(1, tL_messages_savedDialogs2.dialogs);
                                        TLRPC.Message message2 = (TLRPC.Message) zh6Var3.f(tL_monoForumDialog.top_message);
                                        qybVar2.x(tL_monoForumDialog.top_message, message2 != null ? message2.date : 0, j7, wf3.n(tL_monoForumDialog.peer));
                                        break;
                                    } else if (qybVar2.l(j7) == null || qybVar2.l(j7).size() < tL_messages_savedDialogs2.dialogs.size()) {
                                        qybVar2.s.l(j7);
                                        qybVar2.o(j7);
                                        break;
                                    }
                                    break;
                                default:
                                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) messages_saveddialogs;
                                    qyb qybVar3 = qybVar;
                                    qybVar3.getMessagesStorage().j1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                                    qybVar3.getMessagesController().j4(tL_messages_savedDialogsSlice.users, false);
                                    qybVar3.getMessagesController().c4(tL_messages_savedDialogsSlice.chats, false);
                                    LongSparseIntArray longSparseIntArray3 = qybVar3.c;
                                    long j8 = j6;
                                    longSparseIntArray3.put(j8, 0);
                                    ArrayList m2 = ro4.m(tL_messages_savedDialogsSlice.dialogs);
                                    int i4 = tL_messages_savedDialogsSlice.count;
                                    zh6 zh6Var4 = zh6Var2;
                                    byte b5 = b;
                                    qybVar3.u(j8, m2, zh6Var4, false, b5, i4);
                                    qybVar3.y(j8, true);
                                    qybVar3.getMessagesStorage().z1(qybVar3.getConnectionsManager().getCurrentTime(), -j8, (List) qybVar3.a.f(j8), true);
                                    qybVar3.getMessagesStorage().g1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && b5 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) c00.g(1, tL_messages_savedDialogsSlice.dialogs);
                                        TLRPC.Message message3 = (TLRPC.Message) zh6Var4.f(tL_monoForumDialog2.top_message);
                                        qybVar3.x(tL_monoForumDialog2.top_message, message3 != null ? message3.date : 0, j8, wf3.n(tL_monoForumDialog2.peer));
                                        break;
                                    } else if (qybVar3.l(j8) == null || qybVar3.l(j8).size() < tL_messages_savedDialogsSlice.count) {
                                        qybVar3.s.l(j8);
                                        qybVar3.o(j8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    final TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i3 < tL_messages_savedDialogsSlice.messages.size()) {
                        zh6Var2.k(tL_messages_savedDialogsSlice.messages.get(i3).id, tL_messages_savedDialogsSlice.messages.get(i3));
                        i3++;
                    }
                    final byte b3 = 1;
                    hl.c3(new Runnable() { // from class: kyb
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            TLRPC.messages_SavedDialogs messages_saveddialogs = tL_messages_savedDialogsSlice;
                            switch (b32) {
                                case 0:
                                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs2 = (TLRPC.TL_messages_savedDialogs) messages_saveddialogs;
                                    qyb qybVar2 = qybVar;
                                    qybVar2.getMessagesStorage().j1(tL_messages_savedDialogs2.users, tL_messages_savedDialogs2.chats, true, true);
                                    qybVar2.getMessagesController().j4(tL_messages_savedDialogs2.users, false);
                                    qybVar2.getMessagesController().c4(tL_messages_savedDialogs2.chats, false);
                                    LongSparseIntArray longSparseIntArray2 = qybVar2.c;
                                    long j7 = j6;
                                    longSparseIntArray2.put(j7, 0);
                                    ArrayList m = ro4.m(tL_messages_savedDialogs2.dialogs);
                                    int size = tL_messages_savedDialogs2.dialogs.size();
                                    zh6 zh6Var3 = zh6Var2;
                                    byte b4 = b;
                                    qybVar2.u(j7, m, zh6Var3, false, b4, size);
                                    qybVar2.y(j7, true);
                                    qybVar2.getMessagesStorage().z1(qybVar2.getConnectionsManager().getCurrentTime(), -j7, (List) qybVar2.a.f(j7), true);
                                    qybVar2.getMessagesStorage().g1(tL_messages_savedDialogs2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogs2.dialogs.isEmpty() && b4 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) c00.g(1, tL_messages_savedDialogs2.dialogs);
                                        TLRPC.Message message2 = (TLRPC.Message) zh6Var3.f(tL_monoForumDialog.top_message);
                                        qybVar2.x(tL_monoForumDialog.top_message, message2 != null ? message2.date : 0, j7, wf3.n(tL_monoForumDialog.peer));
                                        break;
                                    } else if (qybVar2.l(j7) == null || qybVar2.l(j7).size() < tL_messages_savedDialogs2.dialogs.size()) {
                                        qybVar2.s.l(j7);
                                        qybVar2.o(j7);
                                        break;
                                    }
                                    break;
                                default:
                                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice2 = (TLRPC.TL_messages_savedDialogsSlice) messages_saveddialogs;
                                    qyb qybVar3 = qybVar;
                                    qybVar3.getMessagesStorage().j1(tL_messages_savedDialogsSlice2.users, tL_messages_savedDialogsSlice2.chats, true, true);
                                    qybVar3.getMessagesController().j4(tL_messages_savedDialogsSlice2.users, false);
                                    qybVar3.getMessagesController().c4(tL_messages_savedDialogsSlice2.chats, false);
                                    LongSparseIntArray longSparseIntArray3 = qybVar3.c;
                                    long j8 = j6;
                                    longSparseIntArray3.put(j8, 0);
                                    ArrayList m2 = ro4.m(tL_messages_savedDialogsSlice2.dialogs);
                                    int i4 = tL_messages_savedDialogsSlice2.count;
                                    zh6 zh6Var4 = zh6Var2;
                                    byte b5 = b;
                                    qybVar3.u(j8, m2, zh6Var4, false, b5, i4);
                                    qybVar3.y(j8, true);
                                    qybVar3.getMessagesStorage().z1(qybVar3.getConnectionsManager().getCurrentTime(), -j8, (List) qybVar3.a.f(j8), true);
                                    qybVar3.getMessagesStorage().g1(tL_messages_savedDialogsSlice2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogsSlice2.dialogs.isEmpty() && b5 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) c00.g(1, tL_messages_savedDialogsSlice2.dialogs);
                                        TLRPC.Message message3 = (TLRPC.Message) zh6Var4.f(tL_monoForumDialog2.top_message);
                                        qybVar3.x(tL_monoForumDialog2.top_message, message3 != null ? message3.date : 0, j8, wf3.n(tL_monoForumDialog2.peer));
                                        break;
                                    } else if (qybVar3.l(j8) == null || qybVar3.l(j8).size() < tL_messages_savedDialogsSlice2.count) {
                                        qybVar3.s.l(j8);
                                        qybVar3.o(j8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    hl.c3(new z5b(qybVar, j6, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, (byte) 5));
                    return;
                }
                if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
                    hl.c3(new eyb(qybVar, j6, (byte) 0));
                    return;
                }
                final TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                while (i3 < tL_messages_forumTopics.messages.size()) {
                    zh6Var2.k(tL_messages_forumTopics.messages.get(i3).id, tL_messages_forumTopics.messages.get(i3));
                    i3++;
                }
                hl.c3(new Runnable() { // from class: dyb
                    @Override // java.lang.Runnable
                    public final void run() {
                        qyb qybVar2 = qyb.this;
                        jf7 messagesStorage2 = qybVar2.getMessagesStorage();
                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = tL_messages_forumTopics;
                        messagesStorage2.j1(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
                        qybVar2.getMessagesController().j4(tL_messages_forumTopics2.users, false);
                        qybVar2.getMessagesController().c4(tL_messages_forumTopics2.chats, false);
                        LongSparseIntArray longSparseIntArray2 = qybVar2.c;
                        long j7 = j6;
                        longSparseIntArray2.put(j7, 0);
                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics3 = tL_messages_forumTopics;
                        ArrayList<Long> arrayList = tL_messages_forumTopics3.top_icons;
                        if (arrayList != null) {
                            qybVar2.f.k(j7, arrayList);
                            qybVar2.h.put(j7, System.currentTimeMillis());
                        }
                        ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics3.topics;
                        int i4 = tL_messages_forumTopics2.count;
                        zh6 zh6Var3 = zh6Var2;
                        byte b4 = b;
                        qybVar2.u(j7, arrayList2, zh6Var3, false, b4, i4);
                        qybVar2.y(j7, true);
                        qybVar2.getMessagesStorage().z1(qybVar2.getConnectionsManager().getCurrentTime(), -j7, (List) qybVar2.a.f(j7), true);
                        qybVar2.getMessagesStorage().g1(tL_messages_forumTopics3.messages, false, true, false, 0, false, 0, 0L);
                        if (!tL_messages_forumTopics3.topics.isEmpty() && b4 == 1) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) c00.g(1, tL_messages_forumTopics3.topics);
                            TLRPC.Message message2 = (TLRPC.Message) zh6Var3.f(tL_forumTopic2.top_message);
                            qybVar2.x(tL_forumTopic2.top_message, message2 != null ? message2.date : 0, j7, tL_forumTopic2.id);
                        } else if (qybVar2.l(j7) == null || qybVar2.l(j7).size() < tL_messages_forumTopics3.count) {
                            qybVar2.s.l(j7);
                            qybVar2.o(j7);
                        }
                    }
                });
            }
        });
    }

    public final void o(long j) {
        n(1, j, false);
    }

    public final void q(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        zh6 zh6Var = this.a;
        zh6 zh6Var2 = this.b;
        long j2 = -j;
        zh6 zh6Var3 = (zh6) zh6Var2.f(j2);
        if (f(j2, tL_forumTopic.id) != null) {
            return;
        }
        if (zh6Var3 == null) {
            zh6Var3 = new zh6();
            zh6Var2.k(j2, zh6Var3);
        }
        ArrayList arrayList = (ArrayList) zh6Var.f(j2);
        if (arrayList == null) {
            arrayList = qd4.s(zh6Var, j2);
        }
        zh6Var3.k(tL_forumTopic.id, tL_forumTopic);
        arrayList.add(tL_forumTopic);
        if (z) {
            getMessagesStorage().z1(getConnectionsManager().getCurrentTime(), j, Collections.singletonList(tL_forumTopic), false);
        }
        y(j2, true);
    }

    public final void r(long j, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = tL_updateEditForumTopic.topic_id;
        int i2 = tL_updateEditForumTopic.flags;
        if ((i2 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i |= 8;
        }
        if ((i2 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i |= 32;
        }
        if (i == 0) {
            return;
        }
        D(j, tL_forumTopic, i);
        getMessagesStorage().c2(j, tL_forumTopic, i);
    }

    public final void s(long j, long j2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(if7.a(-j, j2));
        hl.c3(new bcb((Object) this, (Object) arrayList, (byte) 13));
    }

    public final void t(long j, int i, boolean z, e eVar) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().j1(-j);
        tL_messages_updatePinnedForumTopic.topic_id = i;
        tL_messages_updatePinnedForumTopic.pinned = z;
        ArrayList g = g(j);
        ArrayList arrayList = new ArrayList(g);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        a(j, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new ft0((Object) this, (Object) eVar, j, (Object) g, (byte) 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0268, code lost:
    
        if (r29 != 3) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j, ArrayList arrayList, zh6 zh6Var, boolean z, int i, int i2) {
        zh6 zh6Var2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z2;
        ArrayList arrayList4;
        ?? r1;
        zh6 zh6Var3;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList5 = arrayList;
        zh6 zh6Var4 = zh6Var;
        LongSparseIntArray longSparseIntArray = this.d;
        zh6 zh6Var5 = this.b;
        zh6 zh6Var6 = this.a;
        String str2 = "topics_end_reached_";
        if (i == 3 && getMessagesController().B2(-j)) {
            getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
            zh6Var6.l(j);
            zh6Var5.l(j);
            longSparseIntArray.delete(j);
            this.s.l(j);
        }
        if (f11.a) {
            StringBuilder sb = new StringBuilder("processTopics=new_topics_size=");
            sb.append(arrayList5 == null ? 0 : arrayList5.size());
            sb.append(" fromCache=");
            sb.append(z);
            sb.append(" load_type=");
            sb.append(i);
            sb.append(" totalCount=");
            sb.append(i2);
            cc4.b(sb.toString());
        }
        ArrayList arrayList6 = (ArrayList) zh6Var6.f(j);
        zh6 zh6Var7 = (zh6) zh6Var5.f(j);
        if (arrayList6 == null) {
            arrayList6 = qd4.s(zh6Var6, j);
        }
        if (zh6Var7 == null) {
            zh6Var7 = new zh6();
            zh6Var5.k(j, zh6Var7);
        }
        if (arrayList5 != null) {
            int i6 = 0;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            z2 = false;
            while (i6 < arrayList5.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList5.get(i6);
                if (tL_forumTopic2 instanceof TLRPC.TL_forumTopicDeleted) {
                    ArrayList arrayList9 = arrayList7 == null ? new ArrayList() : arrayList7;
                    zh6Var3 = zh6Var6;
                    str = str2;
                    arrayList9.add(Long.valueOf(tL_forumTopic2.id));
                    arrayList7 = arrayList9;
                } else {
                    zh6Var3 = zh6Var6;
                    str = str2;
                    if (!zh6Var7.d(tL_forumTopic2.id)) {
                        if (zh6Var4 != null) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) zh6Var4.f(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) zh6Var4.f(tL_forumTopic2.id);
                        }
                        if (tL_forumTopic2.topMessage == null && !tL_forumTopic2.isShort) {
                            ArrayList arrayList10 = arrayList8 == null ? new ArrayList() : arrayList8;
                            arrayList10.add(tL_forumTopic2);
                            arrayList8 = arrayList10;
                        }
                        if (tL_forumTopic2.topicStartMessage == null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_forumTopic2.topicStartMessage = tL_message;
                            tL_message.message = "";
                            tL_message.id = tL_forumTopic2.id;
                            tL_message.peer_id = getMessagesController().y1(-j);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList6.add(tL_forumTopic2);
                        zh6Var7.k(tL_forumTopic2.id, tL_forumTopic2);
                        this.e.k(p(tL_forumTopic2.top_message, j), tL_forumTopic2);
                        i4 = i6;
                    } else if (!tL_forumTopic2.isShort && (tL_forumTopic = (TLRPC.TL_forumTopic) zh6Var7.f(tL_forumTopic2.id)) != null) {
                        boolean z3 = tL_forumTopic.closed;
                        boolean z4 = tL_forumTopic2.closed;
                        if (z3 != z4) {
                            tL_forumTopic.closed = z4;
                            getMessagesStorage().c2(-j, tL_forumTopic2, 8);
                            z2 = true;
                        }
                        if (!z) {
                            boolean z5 = tL_forumTopic.pinned;
                            boolean z6 = tL_forumTopic2.pinned;
                            if (z5 != z6) {
                                tL_forumTopic.pinned = z6;
                                z2 = true;
                            }
                        }
                        if (!z) {
                            if (TextUtils.equals(tL_forumTopic.title, tL_forumTopic2.title)) {
                                i3 = 0;
                            } else {
                                tL_forumTopic.title = tL_forumTopic2.title;
                                i3 = 1;
                            }
                            long j2 = tL_forumTopic.icon_emoji_id;
                            int i7 = i3;
                            i4 = i6;
                            long j3 = tL_forumTopic2.icon_emoji_id;
                            if (j2 == j3 && tL_forumTopic.icon_color == tL_forumTopic2.icon_color) {
                                i5 = i7;
                            } else {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.icon_color = tL_forumTopic2.icon_color;
                                i5 = i7 | 2;
                            }
                            boolean z7 = tL_forumTopic.hidden;
                            boolean z8 = tL_forumTopic2.hidden;
                            if (z7 != z8) {
                                tL_forumTopic.hidden = z8;
                                i5 |= 32;
                            }
                            if (i5 != 0) {
                                getMessagesStorage().c2(-j, tL_forumTopic2, i5);
                            } else {
                                i6 = i4 + 1;
                                arrayList5 = arrayList;
                                zh6Var4 = zh6Var;
                                zh6Var6 = zh6Var3;
                                str2 = str;
                            }
                        }
                    }
                    z2 = true;
                    i6 = i4 + 1;
                    arrayList5 = arrayList;
                    zh6Var4 = zh6Var;
                    zh6Var6 = zh6Var3;
                    str2 = str;
                }
                i4 = i6;
                i6 = i4 + 1;
                arrayList5 = arrayList;
                zh6Var4 = zh6Var;
                zh6Var6 = zh6Var3;
                str2 = str;
            }
            zh6Var2 = zh6Var6;
            arrayList2 = arrayList7;
            arrayList3 = arrayList8;
        } else {
            zh6Var2 = zh6Var6;
            arrayList2 = null;
            arrayList3 = null;
            z2 = false;
        }
        String str3 = str2;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList6.get(i9);
            if (tL_forumTopic3 != null && tL_forumTopic3.pinned) {
                int i10 = i8 + 1;
                if (tL_forumTopic3.pinnedOrder != i8) {
                    tL_forumTopic3.pinnedOrder = i8;
                    i8 = i10;
                    z2 = true;
                } else {
                    i8 = i10;
                }
            }
        }
        if (arrayList2 == null || i != 2) {
            arrayList4 = arrayList6;
        } else {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList6.size()) {
                        break;
                    }
                    if (((TLRPC.TL_forumTopic) arrayList6.get(i12)).id == ((Long) arrayList2.get(i11)).longValue()) {
                        arrayList6.remove(i12);
                        break;
                    }
                    i12++;
                }
            }
            jf7 messagesStorage = getMessagesStorage();
            arrayList4 = arrayList6;
            messagesStorage.a.c(new se7(messagesStorage, arrayList2, j, (byte) 5));
        }
        if (arrayList3 == null || i == 2) {
            if (i != 0 || z) {
                r1 = 1;
                r1 = 1;
                if (i != 1) {
                }
            } else {
                r1 = 1;
            }
            if (arrayList4.size() >= i2 && i2 >= 0 && !e(j)) {
                longSparseIntArray.put(j, r1);
                getUserConfig().j().edit().putBoolean(str3 + j, r1).apply();
                z2 = true;
            }
        } else {
            v(j, arrayList3, null);
        }
        if (zh6Var7.m() > arrayList4.size()) {
            cc4.d("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(zh6Var7.m());
            for (int i13 = 0; i13 < zh6Var7.m(); i13++) {
                hashSet.add(Long.valueOf(zh6Var7.j(i13)));
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
                if (((TLRPC.TL_forumTopic) obj) != null) {
                    hashSet.remove(Long.valueOf(r6.id));
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                zh6Var7.l(((Long) it.next()).longValue());
            }
            z2 = true;
        }
        if (z2) {
            y(j, false);
        }
        getNotificationCenter().k(jn7.t5, Long.valueOf(j), Boolean.TRUE);
        if ((i == 0 || (i == 0 && !z)) && z && ((ArrayList) zh6Var2.f(j)).isEmpty()) {
            hl.c3(new eyb(this, j, (byte) 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(long j, ArrayList arrayList, o30 o30Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j2 = -j;
        boolean B2 = getMessagesController().B2(j2);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (B2) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i < arrayList.size()) {
                long n = wf3.n(((TLRPC.TL_forumTopic) arrayList.get(i)).from_id);
                hashSet.add(Long.valueOf(n));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().j1(n));
                i++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().j1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i < arrayList.size()) {
                i = qd4.g(((TLRPC.TL_forumTopic) arrayList.get(i)).id, i, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().j1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new rs0((Object) this, B2, j, (Object) hashSet, (Object) o30Var, (byte) 6));
    }

    public final void w(ArrayList arrayList, long j) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().j1(-j);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(int i, int i2, long j, long j2) {
        oyb oybVar = new oyb();
        oybVar.a = i;
        oybVar.b = i2;
        oybVar.c = j2;
        this.s.k(j, oybVar);
    }

    public final void y(long j, boolean z) {
        ArrayList arrayList = (ArrayList) this.a.f(j);
        if (arrayList != null) {
            if (this.r.get(j, 0) > 0) {
                Collections.sort(arrayList, new fna((byte) 11));
            }
            if (z) {
                getNotificationCenter().k(jn7.t5, Long.valueOf(j), Boolean.TRUE);
            }
        }
    }

    public final void z(int i, long j, boolean z) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z;
        zh6 zh6Var = (zh6) this.b.f(j);
        if (zh6Var != null && (tL_forumTopic = (TLRPC.TL_forumTopic) zh6Var.f(i)) != null) {
            tL_forumTopic.closed = z;
            getMessagesStorage().c2(j2, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new myb());
    }
}
