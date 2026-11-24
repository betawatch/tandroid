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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pub extends pf0 {
    public static final int[] w = new int[5];
    public vf6 a;
    public vf6 b;
    public LongSparseIntArray c;
    public LongSparseIntArray d;
    public vf6 e;
    public vf6 f;
    public LongSparseLongArray h;
    public LongSparseIntArray n;
    public LongSparseIntArray r;
    public vf6 s;

    public static long p(int i, long j) {
        return j + (i << 12);
    }

    public final void A(int i, long j, boolean z) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().h1(j2);
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
        gl.d3(new fub(this, j, arrayList, hc2.p0(getMessagesController().K0(Long.valueOf(j2))), j2, (byte) 0));
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
                gl.d3(new jub(this, b));
            }
        }
    }

    public final void b() {
        gl.d3(new jub(this, (byte) 1));
    }

    public final void c(int i, int i2, long j) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j2 = -j;
        tL_messages_deleteTopicHistory.peer = getMessagesController().h1(j2);
        tL_messages_deleteTopicHistory.top_msg_id = i;
        if (i2 == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new sa7(messagesStorage, j2, i, (byte) 1));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new kub(this, j, i));
    }

    public final void d(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j);
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var != null && arrayList2 != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long intValue = ((Integer) arrayList.get(i)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(intValue);
                vf6Var.l(intValue);
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
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(j2);
        if (tL_forumTopic != null || !getMessagesController().x2(-j)) {
            return tL_forumTopic;
        }
        int i = mm4.a;
        return (TLRPC.TL_forumTopic) vf6Var.f((int) (j2 ^ (j2 >>> 32)));
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
                if (!getMessagesController().n2(-j, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, k27 k27Var, TextPaint textPaint) {
        return j(chat, k27Var, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, k27 k27Var, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f;
        TLRPC.MessageReplyHeader messageReplyHeader = k27Var.k.reply_to;
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
        return mm4.k(f, textPaint, drawableArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(long j, long j2) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f = f(-j, j2);
        if (f == null || f.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().x2(j)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().h1(j2);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().h1(j);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().h1(j);
            tL_messages_getReplies2.msg_id = (int) j2;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new pn6(this, f, j, j2, (byte) 3));
    }

    public final ArrayList l(long j) {
        return (ArrayList) this.a.f(j);
    }

    public final void m(final long j, final long j2, final n30 n30Var) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new de2((Object) messagesStorage, -j, (Object) new Consumer() { // from class: bub
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                pub pubVar = pub.this;
                pubVar.getClass();
                gl.d3(new dt4(pubVar, j, (ArrayList) obj, j2, n30Var));
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
        vf6 vf6Var = this.s;
        LongSparseIntArray longSparseIntArray = this.c;
        int i2 = 0;
        if (longSparseIntArray.get(j, 0) != 0) {
            return;
        }
        if (w01.a) {
            fa4.b("load topics " + j + " fromCache=" + z + " loadType=" + i);
        }
        longSparseIntArray.put(j, 1);
        if (z) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new de2((Object) messagesStorage, -j, (Object) new Consumer() { // from class: gub
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    final ArrayList arrayList = (ArrayList) obj;
                    final pub pubVar = pub.this;
                    final long j2 = j;
                    final boolean z2 = z;
                    final byte b = i;
                    gl.d3(new Runnable() { // from class: iub
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z3 = w01.a;
                            long j3 = j2;
                            ArrayList arrayList2 = arrayList;
                            if (z3) {
                                b00.p(arrayList2 == null ? 0 : arrayList2.size(), ug8.o(j3, "loaded from cache ", " topics_count="));
                            }
                            pub pubVar2 = pub.this;
                            pubVar2.c.put(j3, 0);
                            pubVar2.u(j3, arrayList2, null, z2, b, -1);
                            pubVar2.y(j3, true);
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
        if (getMessagesController().x2(j2)) {
            TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getSavedDialogs.parent_peer = na7.q1(this.currentAccount).h1(j2);
            tL_messages_getSavedDialogs.flags |= 2;
            nub nubVar = (nub) vf6Var.f(j);
            if (nubVar == null) {
                nubVar = new nub();
            }
            long j3 = 0;
            if (i != 0 && i != 3) {
                if (i != 1) {
                    tL_messages_getForumTopics = tL_messages_getSavedDialogs;
                } else {
                    tL_messages_getSavedDialogs.limit = 100;
                    tL_messages_getSavedDialogs.offset_date = nubVar.b;
                    tL_messages_getSavedDialogs.offset_id = nubVar.a;
                    tL_messages_getSavedDialogs.offset_peer = na7.q1(this.currentAccount).h1(nubVar.c);
                    tL_messages_getForumTopics = tL_messages_getSavedDialogs;
                    if (w01.a) {
                        StringBuilder sb = new StringBuilder("offset_date=");
                        sb.append(nubVar.b);
                        sb.append(" offset_id=");
                        sb.append(nubVar.a);
                        sb.append(" offset_topic=");
                        ug8.q(nubVar.c, sb);
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
                            j4 = hq6.r(hq6.r(hq6.r(hq6.r(j4, j3), Math.abs(cf3.n(tL_forumTopic.from_id))), tL_forumTopic.top_message), j5);
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
            tL_messages_getForumTopics2.peer = getMessagesController().h1(j2);
            tL_messages_getForumTopics = tL_messages_getForumTopics2;
            if (i == 0) {
                tL_messages_getForumTopics2.limit = 20;
                tL_messages_getForumTopics = tL_messages_getForumTopics2;
            } else if (i == 1) {
                tL_messages_getForumTopics2.limit = 100;
                nub nubVar2 = (nub) vf6Var.f(j);
                if (nubVar2 == null) {
                    nubVar2 = new nub();
                }
                tL_messages_getForumTopics2.offset_date = nubVar2.b;
                tL_messages_getForumTopics2.offset_id = nubVar2.a;
                tL_messages_getForumTopics2.offset_topic = (int) nubVar2.c;
                tL_messages_getForumTopics = tL_messages_getForumTopics2;
                if (w01.a) {
                    StringBuilder sb2 = new StringBuilder("offset_date=");
                    sb2.append(nubVar2.b);
                    sb2.append(" offset_id=");
                    sb2.append(nubVar2.a);
                    sb2.append(" offset_topic=");
                    ug8.q(nubVar2.c, sb2);
                    tL_messages_getForumTopics = tL_messages_getForumTopics2;
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new RequestDelegate() { // from class: hub
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final vf6 vf6Var2 = new vf6();
                boolean z2 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                final pub pubVar = pub.this;
                final long j6 = j;
                final byte b = i;
                int i3 = 0;
                if (z2) {
                    final TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i3 < tL_messages_savedDialogs.messages.size()) {
                        vf6Var2.k(tL_messages_savedDialogs.messages.get(i3), tL_messages_savedDialogs.messages.get(i3).id);
                        i3++;
                    }
                    final byte b2 = 0;
                    gl.d3(new Runnable() { // from class: cub
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            TLRPC.messages_SavedDialogs messages_saveddialogs = tL_messages_savedDialogs;
                            switch (b3) {
                                case 0:
                                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs2 = (TLRPC.TL_messages_savedDialogs) messages_saveddialogs;
                                    pub pubVar2 = pubVar;
                                    pubVar2.getMessagesStorage().j1(tL_messages_savedDialogs2.users, tL_messages_savedDialogs2.chats, true, true);
                                    pubVar2.getMessagesController().a4(tL_messages_savedDialogs2.users, false);
                                    pubVar2.getMessagesController().U3(tL_messages_savedDialogs2.chats, false);
                                    LongSparseIntArray longSparseIntArray2 = pubVar2.c;
                                    long j7 = j6;
                                    longSparseIntArray2.put(j7, 0);
                                    ArrayList m = mm4.m(tL_messages_savedDialogs2.dialogs);
                                    int size = tL_messages_savedDialogs2.dialogs.size();
                                    vf6 vf6Var3 = vf6Var2;
                                    byte b4 = b;
                                    pubVar2.u(j7, m, vf6Var3, false, b4, size);
                                    pubVar2.y(j7, true);
                                    pubVar2.getMessagesStorage().z1(pubVar2.getConnectionsManager().getCurrentTime(), -j7, (List) pubVar2.a.f(j7), true);
                                    pubVar2.getMessagesStorage().g1(tL_messages_savedDialogs2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogs2.dialogs.isEmpty() && b4 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) b00.f(1, tL_messages_savedDialogs2.dialogs);
                                        TLRPC.Message message2 = (TLRPC.Message) vf6Var3.f(tL_monoForumDialog.top_message);
                                        pubVar2.x(tL_monoForumDialog.top_message, message2 != null ? message2.date : 0, j7, cf3.n(tL_monoForumDialog.peer));
                                        break;
                                    } else if (pubVar2.l(j7) == null || pubVar2.l(j7).size() < tL_messages_savedDialogs2.dialogs.size()) {
                                        pubVar2.s.l(j7);
                                        pubVar2.o(j7);
                                        break;
                                    }
                                    break;
                                default:
                                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) messages_saveddialogs;
                                    pub pubVar3 = pubVar;
                                    pubVar3.getMessagesStorage().j1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
                                    pubVar3.getMessagesController().a4(tL_messages_savedDialogsSlice.users, false);
                                    pubVar3.getMessagesController().U3(tL_messages_savedDialogsSlice.chats, false);
                                    LongSparseIntArray longSparseIntArray3 = pubVar3.c;
                                    long j8 = j6;
                                    longSparseIntArray3.put(j8, 0);
                                    ArrayList m2 = mm4.m(tL_messages_savedDialogsSlice.dialogs);
                                    int i4 = tL_messages_savedDialogsSlice.count;
                                    vf6 vf6Var4 = vf6Var2;
                                    byte b5 = b;
                                    pubVar3.u(j8, m2, vf6Var4, false, b5, i4);
                                    pubVar3.y(j8, true);
                                    pubVar3.getMessagesStorage().z1(pubVar3.getConnectionsManager().getCurrentTime(), -j8, (List) pubVar3.a.f(j8), true);
                                    pubVar3.getMessagesStorage().g1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && b5 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) b00.f(1, tL_messages_savedDialogsSlice.dialogs);
                                        TLRPC.Message message3 = (TLRPC.Message) vf6Var4.f(tL_monoForumDialog2.top_message);
                                        pubVar3.x(tL_monoForumDialog2.top_message, message3 != null ? message3.date : 0, j8, cf3.n(tL_monoForumDialog2.peer));
                                        break;
                                    } else if (pubVar3.l(j8) == null || pubVar3.l(j8).size() < tL_messages_savedDialogsSlice.count) {
                                        pubVar3.s.l(j8);
                                        pubVar3.o(j8);
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
                        vf6Var2.k(tL_messages_savedDialogsSlice.messages.get(i3), tL_messages_savedDialogsSlice.messages.get(i3).id);
                        i3++;
                    }
                    final byte b3 = 1;
                    gl.d3(new Runnable() { // from class: cub
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            TLRPC.messages_SavedDialogs messages_saveddialogs = tL_messages_savedDialogsSlice;
                            switch (b32) {
                                case 0:
                                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs2 = (TLRPC.TL_messages_savedDialogs) messages_saveddialogs;
                                    pub pubVar2 = pubVar;
                                    pubVar2.getMessagesStorage().j1(tL_messages_savedDialogs2.users, tL_messages_savedDialogs2.chats, true, true);
                                    pubVar2.getMessagesController().a4(tL_messages_savedDialogs2.users, false);
                                    pubVar2.getMessagesController().U3(tL_messages_savedDialogs2.chats, false);
                                    LongSparseIntArray longSparseIntArray2 = pubVar2.c;
                                    long j7 = j6;
                                    longSparseIntArray2.put(j7, 0);
                                    ArrayList m = mm4.m(tL_messages_savedDialogs2.dialogs);
                                    int size = tL_messages_savedDialogs2.dialogs.size();
                                    vf6 vf6Var3 = vf6Var2;
                                    byte b4 = b;
                                    pubVar2.u(j7, m, vf6Var3, false, b4, size);
                                    pubVar2.y(j7, true);
                                    pubVar2.getMessagesStorage().z1(pubVar2.getConnectionsManager().getCurrentTime(), -j7, (List) pubVar2.a.f(j7), true);
                                    pubVar2.getMessagesStorage().g1(tL_messages_savedDialogs2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogs2.dialogs.isEmpty() && b4 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) b00.f(1, tL_messages_savedDialogs2.dialogs);
                                        TLRPC.Message message2 = (TLRPC.Message) vf6Var3.f(tL_monoForumDialog.top_message);
                                        pubVar2.x(tL_monoForumDialog.top_message, message2 != null ? message2.date : 0, j7, cf3.n(tL_monoForumDialog.peer));
                                        break;
                                    } else if (pubVar2.l(j7) == null || pubVar2.l(j7).size() < tL_messages_savedDialogs2.dialogs.size()) {
                                        pubVar2.s.l(j7);
                                        pubVar2.o(j7);
                                        break;
                                    }
                                    break;
                                default:
                                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice2 = (TLRPC.TL_messages_savedDialogsSlice) messages_saveddialogs;
                                    pub pubVar3 = pubVar;
                                    pubVar3.getMessagesStorage().j1(tL_messages_savedDialogsSlice2.users, tL_messages_savedDialogsSlice2.chats, true, true);
                                    pubVar3.getMessagesController().a4(tL_messages_savedDialogsSlice2.users, false);
                                    pubVar3.getMessagesController().U3(tL_messages_savedDialogsSlice2.chats, false);
                                    LongSparseIntArray longSparseIntArray3 = pubVar3.c;
                                    long j8 = j6;
                                    longSparseIntArray3.put(j8, 0);
                                    ArrayList m2 = mm4.m(tL_messages_savedDialogsSlice2.dialogs);
                                    int i4 = tL_messages_savedDialogsSlice2.count;
                                    vf6 vf6Var4 = vf6Var2;
                                    byte b5 = b;
                                    pubVar3.u(j8, m2, vf6Var4, false, b5, i4);
                                    pubVar3.y(j8, true);
                                    pubVar3.getMessagesStorage().z1(pubVar3.getConnectionsManager().getCurrentTime(), -j8, (List) pubVar3.a.f(j8), true);
                                    pubVar3.getMessagesStorage().g1(tL_messages_savedDialogsSlice2.messages, false, true, false, 0, false, 0, 0L);
                                    if (!tL_messages_savedDialogsSlice2.dialogs.isEmpty() && b5 == 1) {
                                        TLRPC.TL_monoForumDialog tL_monoForumDialog2 = (TLRPC.TL_monoForumDialog) b00.f(1, tL_messages_savedDialogsSlice2.dialogs);
                                        TLRPC.Message message3 = (TLRPC.Message) vf6Var4.f(tL_monoForumDialog2.top_message);
                                        pubVar3.x(tL_monoForumDialog2.top_message, message3 != null ? message3.date : 0, j8, cf3.n(tL_monoForumDialog2.peer));
                                        break;
                                    } else if (pubVar3.l(j8) == null || pubVar3.l(j8).size() < tL_messages_savedDialogsSlice2.count) {
                                        pubVar3.s.l(j8);
                                        pubVar3.o(j8);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    gl.d3(new d2b(pubVar, j6, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, (byte) 5));
                    return;
                }
                if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
                    gl.d3(new eub(pubVar, j6, (byte) 0));
                    return;
                }
                final TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                while (i3 < tL_messages_forumTopics.messages.size()) {
                    vf6Var2.k(tL_messages_forumTopics.messages.get(i3), tL_messages_forumTopics.messages.get(i3).id);
                    i3++;
                }
                gl.d3(new Runnable() { // from class: dub
                    @Override // java.lang.Runnable
                    public final void run() {
                        pub pubVar2 = pub.this;
                        ad7 messagesStorage2 = pubVar2.getMessagesStorage();
                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = tL_messages_forumTopics;
                        messagesStorage2.j1(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
                        pubVar2.getMessagesController().a4(tL_messages_forumTopics2.users, false);
                        pubVar2.getMessagesController().U3(tL_messages_forumTopics2.chats, false);
                        LongSparseIntArray longSparseIntArray2 = pubVar2.c;
                        long j7 = j6;
                        longSparseIntArray2.put(j7, 0);
                        TLRPC.TL_messages_forumTopics tL_messages_forumTopics3 = tL_messages_forumTopics;
                        ArrayList<Long> arrayList = tL_messages_forumTopics3.top_icons;
                        if (arrayList != null) {
                            pubVar2.f.k(arrayList, j7);
                            pubVar2.h.put(j7, System.currentTimeMillis());
                        }
                        ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics3.topics;
                        int i4 = tL_messages_forumTopics2.count;
                        vf6 vf6Var3 = vf6Var2;
                        byte b4 = b;
                        pubVar2.u(j7, arrayList2, vf6Var3, false, b4, i4);
                        pubVar2.y(j7, true);
                        pubVar2.getMessagesStorage().z1(pubVar2.getConnectionsManager().getCurrentTime(), -j7, (List) pubVar2.a.f(j7), true);
                        pubVar2.getMessagesStorage().g1(tL_messages_forumTopics3.messages, false, true, false, 0, false, 0, 0L);
                        if (!tL_messages_forumTopics3.topics.isEmpty() && b4 == 1) {
                            TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) b00.f(1, tL_messages_forumTopics3.topics);
                            TLRPC.Message message2 = (TLRPC.Message) vf6Var3.f(tL_forumTopic2.top_message);
                            pubVar2.x(tL_forumTopic2.top_message, message2 != null ? message2.date : 0, j7, tL_forumTopic2.id);
                        } else if (pubVar2.l(j7) == null || pubVar2.l(j7).size() < tL_messages_forumTopics3.count) {
                            pubVar2.s.l(j7);
                            pubVar2.o(j7);
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
        vf6 vf6Var = this.a;
        vf6 vf6Var2 = this.b;
        long j2 = -j;
        vf6 vf6Var3 = (vf6) vf6Var2.f(j2);
        if (f(j2, tL_forumTopic.id) != null) {
            return;
        }
        if (vf6Var3 == null) {
            vf6Var3 = new vf6();
            vf6Var2.k(vf6Var3, j2);
        }
        ArrayList arrayList = (ArrayList) vf6Var.f(j2);
        if (arrayList == null) {
            arrayList = tb4.s(vf6Var, j2);
        }
        vf6Var3.k(tL_forumTopic, tL_forumTopic.id);
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
        arrayList.add(zc7.a(-j, j2));
        gl.d3(new a5b((Object) this, (Object) arrayList, (byte) 16));
    }

    public final void t(long j, int i, boolean z, d dVar) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().h1(-j);
        tL_messages_updatePinnedForumTopic.topic_id = i;
        tL_messages_updatePinnedForumTopic.pinned = z;
        ArrayList g = g(j);
        ArrayList arrayList = new ArrayList(g);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        a(j, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new ws0((Object) this, (Object) dVar, j, (Object) g, (byte) 7));
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
    public final void u(long j, ArrayList arrayList, vf6 vf6Var, boolean z, int i, int i2) {
        vf6 vf6Var2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z2;
        ArrayList arrayList4;
        ?? r1;
        vf6 vf6Var3;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList5 = arrayList;
        vf6 vf6Var4 = vf6Var;
        LongSparseIntArray longSparseIntArray = this.d;
        vf6 vf6Var5 = this.b;
        vf6 vf6Var6 = this.a;
        String str2 = "topics_end_reached_";
        if (i == 3 && getMessagesController().x2(-j)) {
            getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
            vf6Var6.l(j);
            vf6Var5.l(j);
            longSparseIntArray.delete(j);
            this.s.l(j);
        }
        if (w01.a) {
            StringBuilder sb = new StringBuilder("processTopics=new_topics_size=");
            sb.append(arrayList5 == null ? 0 : arrayList5.size());
            sb.append(" fromCache=");
            sb.append(z);
            sb.append(" load_type=");
            sb.append(i);
            sb.append(" totalCount=");
            sb.append(i2);
            fa4.b(sb.toString());
        }
        ArrayList arrayList6 = (ArrayList) vf6Var6.f(j);
        vf6 vf6Var7 = (vf6) vf6Var5.f(j);
        if (arrayList6 == null) {
            arrayList6 = tb4.s(vf6Var6, j);
        }
        if (vf6Var7 == null) {
            vf6Var7 = new vf6();
            vf6Var5.k(vf6Var7, j);
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
                    vf6Var3 = vf6Var6;
                    str = str2;
                    arrayList9.add(Long.valueOf(tL_forumTopic2.id));
                    arrayList7 = arrayList9;
                } else {
                    vf6Var3 = vf6Var6;
                    str = str2;
                    if (!vf6Var7.d(tL_forumTopic2.id)) {
                        if (vf6Var4 != null) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) vf6Var4.f(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) vf6Var4.f(tL_forumTopic2.id);
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
                            tL_message.peer_id = getMessagesController().w1(-j);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList6.add(tL_forumTopic2);
                        vf6Var7.k(tL_forumTopic2, tL_forumTopic2.id);
                        this.e.k(tL_forumTopic2, p(tL_forumTopic2.top_message, j));
                        i4 = i6;
                    } else if (!tL_forumTopic2.isShort && (tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var7.f(tL_forumTopic2.id)) != null) {
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
                                vf6Var4 = vf6Var;
                                vf6Var6 = vf6Var3;
                                str2 = str;
                            }
                        }
                    }
                    z2 = true;
                    i6 = i4 + 1;
                    arrayList5 = arrayList;
                    vf6Var4 = vf6Var;
                    vf6Var6 = vf6Var3;
                    str2 = str;
                }
                i4 = i6;
                i6 = i4 + 1;
                arrayList5 = arrayList;
                vf6Var4 = vf6Var;
                vf6Var6 = vf6Var3;
                str2 = str;
            }
            vf6Var2 = vf6Var6;
            arrayList2 = arrayList7;
            arrayList3 = arrayList8;
        } else {
            vf6Var2 = vf6Var6;
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
            ad7 messagesStorage = getMessagesStorage();
            arrayList4 = arrayList6;
            messagesStorage.a.c(new jc7(messagesStorage, arrayList2, j, (byte) 6));
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
        if (vf6Var7.m() > arrayList4.size()) {
            fa4.d("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(vf6Var7.m());
            for (int i13 = 0; i13 < vf6Var7.m(); i13++) {
                hashSet.add(Long.valueOf(vf6Var7.j(i13)));
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
                vf6Var7.l(((Long) it.next()).longValue());
            }
            z2 = true;
        }
        if (z2) {
            y(j, false);
        }
        getNotificationCenter().k(kk7.s5, Long.valueOf(j), Boolean.TRUE);
        if ((i == 0 || (i == 0 && !z)) && z && ((ArrayList) vf6Var2.f(j)).isEmpty()) {
            gl.d3(new eub(this, j, (byte) 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(long j, ArrayList arrayList, n30 n30Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j2 = -j;
        boolean x2 = getMessagesController().x2(j2);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (x2) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i < arrayList.size()) {
                long n = cf3.n(((TLRPC.TL_forumTopic) arrayList.get(i)).from_id);
                hashSet.add(Long.valueOf(n));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().h1(n));
                i++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().h1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i < arrayList.size()) {
                i = tb4.g(((TLRPC.TL_forumTopic) arrayList.get(i)).id, i, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().h1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new js0((Object) this, x2, j, (Object) hashSet, (Object) n30Var, (byte) 5));
    }

    public final void w(ArrayList arrayList, long j) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().h1(-j);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(int i, int i2, long j, long j2) {
        nub nubVar = new nub();
        nubVar.a = i;
        nubVar.b = i2;
        nubVar.c = j2;
        this.s.k(nubVar, j);
    }

    public final void y(long j, boolean z) {
        ArrayList arrayList = (ArrayList) this.a.f(j);
        if (arrayList != null) {
            if (this.r.get(j, 0) > 0) {
                Collections.sort(arrayList, new pva((byte) 8));
            }
            if (z) {
                getNotificationCenter().k(kk7.s5, Long.valueOf(j), Boolean.TRUE);
            }
        }
    }

    public final void z(int i, long j, boolean z) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().h1(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z;
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var != null && (tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(i)) != null) {
            tL_forumTopic.closed = z;
            getMessagesStorage().c2(j2, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new lub());
    }
}
