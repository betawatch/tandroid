// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.webrtc.CameraEnumerator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class y09 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y09(r9b r9bVar, TLRPC.Chat chat, jf7 jf7Var, long j) {
        this.a = (byte) 14;
        this.d = r9bVar;
        this.e = chat;
        this.b = jf7Var;
        this.c = j;
    }

    private final void a() {
        qyb qybVar = (qyb) this.d;
        TLObject tLObject = (TLObject) this.b;
        d0c d0cVar = (d0c) this.e;
        qybVar.getClass();
        ArrayList arrayList = new ArrayList();
        pyb pybVar = null;
        int i = 0;
        if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            zh6 zh6Var = new zh6();
            for (int i2 = 0; i2 < tL_messages_forumTopics.messages.size(); i2++) {
                zh6Var.k(tL_messages_forumTopics.messages.get(i2).id, tL_messages_forumTopics.messages.get(i2));
            }
            qybVar.getMessagesController().j4(tL_messages_forumTopics.users, false);
            qybVar.getMessagesController().c4(tL_messages_forumTopics.chats, false);
            ArrayList<TLRPC.TL_forumTopic> arrayList2 = tL_messages_forumTopics.topics;
            long j = this.c;
            qybVar.u(j, arrayList2, zh6Var, false, 2, -1);
            qybVar.getMessagesStorage().z1(qybVar.getConnectionsManager().getCurrentTime(), -j, (List) qybVar.a.f(j), true);
            qybVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
            ArrayList<TLRPC.TL_forumTopic> arrayList3 = tL_messages_forumTopics.topics;
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                TLRPC.TL_forumTopic tL_forumTopic = arrayList3.get(i3);
                i3++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                TLRPC.TL_forumTopic f = qybVar.f(j, tL_forumTopic2.id);
                if (f != null) {
                    tL_forumTopic2 = f;
                }
                arrayList.add(tL_forumTopic2);
            }
            int i4 = tL_messages_forumTopics.count;
            if (!tL_messages_forumTopics.topics.isEmpty()) {
                TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) c00.g(1, tL_messages_forumTopics.topics);
                TLRPC.Message message = (TLRPC.Message) zh6Var.f(tL_forumTopic3.top_message);
                pybVar = new pyb();
                if (tL_messages_forumTopics.order_by_create_date) {
                    i = tL_forumTopic3.date;
                } else if (message != null) {
                    i = message.date;
                }
                pybVar.a = i;
                pybVar.b = tL_forumTopic3.top_message;
                pybVar.c = tL_forumTopic3.id;
            }
            i = i4;
        }
        d0cVar.a(arrayList, pybVar, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0658, code lost:
    
        if (r17 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x065a, code lost:
    
        r17.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x065d, code lost:
    
        hl.c3(new z87((java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r15, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r45, (byte) 23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x066f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x062d, code lost:
    
        if (r17 != null) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x083e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        r47 r47Var;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        mt9 mt9Var;
        int i;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor3;
        SQLiteCursor sQLiteCursor4;
        ArrayList arrayList3;
        lt9 lt9Var;
        boolean z;
        SQLiteCursor sQLiteCursor5;
        ArrayList arrayList4;
        mt9 mt9Var2;
        long j;
        SQLiteCursor queryFinalized;
        long j2;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList5;
        byte b = this.a;
        SQLiteCursor sQLiteCursor6 = null;
        r8 = null;
        TL_stories.StoryItem storyItem = null;
        r8 = null;
        r8 = null;
        TL_stories.StoryItem storyItem2 = null;
        long j3 = this.c;
        int i3 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                b19 b19Var = (b19) obj3;
                jf7 jf7Var = (jf7) obj2;
                a19 a19Var = (a19) obj;
                try {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sQLiteCursor = jf7Var.b.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(a19Var.a));
                        try {
                            if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                r47Var = null;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.send_state = sQLiteCursor.intValue(1);
                                TLdeserialize.readAttachPath(byteBufferValue, j3);
                                byteBufferValue.reuse();
                                TLdeserialize.id = sQLiteCursor.intValue(2);
                                TLdeserialize.date = sQLiteCursor.intValue(3);
                                TLdeserialize.flags |= TLObject.FLAG_30;
                                TLdeserialize.quick_reply_shortcut_id = sQLiteCursor.intValue(4);
                                TLdeserialize.ttl = sQLiteCursor.intValue(5);
                                jf7.d(TLdeserialize, arrayList6, arrayList7, null);
                                r47Var = new r47(b19Var.a, TLdeserialize, false, true);
                            }
                            sQLiteCursor.dispose();
                            r47 r47Var2 = r47Var;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            if (!arrayList7.isEmpty()) {
                                jf7Var.P(TextUtils.join(",", arrayList7), arrayList9);
                            }
                            if (!arrayList6.isEmpty()) {
                                jf7Var.k0(arrayList6, arrayList8, false);
                            }
                            hl.c3(new cp7((Object) b19Var, (Object) arrayList8, (Object) arrayList9, (Object) a19Var, (Object) r47Var2, (byte) 15));
                        } catch (Exception e) {
                            e = e;
                            cc4.g(e, true);
                            if (sQLiteCursor == null) {
                                return;
                            }
                            sQLiteCursor.dispose();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteCursor6 != null) {
                            sQLiteCursor6.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor6 = null;
                    if (sQLiteCursor6 != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 1:
                nt9 nt9Var = (nt9) obj3;
                jf7 jf7Var2 = (jf7) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = jf7Var2.b;
                ArrayList arrayList11 = new ArrayList();
                zh6 zh6Var = new zh6();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                int i4 = 0;
                SQLiteCursor sQLiteCursor7 = null;
                while (i4 < arrayList10.size()) {
                    try {
                        try {
                            mt9Var = (mt9) arrayList10.get(i4);
                            i = i4;
                            arrayList = arrayList16;
                            arrayList2 = arrayList10;
                        } catch (Exception e3) {
                            e = e3;
                        }
                        try {
                            sQLiteCursor2 = sQLiteCursor7;
                            try {
                                try {
                                    sQLiteCursor7 = sQLiteDatabase.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", Long.valueOf(j3), Long.valueOf(mt9Var.a));
                                    if (sQLiteCursor7.next()) {
                                        sQLiteCursor7.intValue(0);
                                        NativeByteBuffer byteBufferValue2 = sQLiteCursor7.byteBufferValue(1);
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(true), true);
                                        jf7.d(TLdeserialize2, arrayList12, arrayList13, arrayList14);
                                        zh6Var.k(mt9Var.a, TLdeserialize2);
                                    } else {
                                        arrayList11.add(Long.valueOf(mt9Var.a));
                                    }
                                    sQLiteCursor7.dispose();
                                    i4 = i + 1;
                                    arrayList10 = arrayList2;
                                    arrayList16 = arrayList;
                                } catch (Exception e4) {
                                    e = e4;
                                    arrayList16 = arrayList;
                                    sQLiteCursor7 = sQLiteCursor2;
                                    cc4.g(e, true);
                                    if (sQLiteCursor7 != null) {
                                        sQLiteCursor7.dispose();
                                    }
                                    hl.c3(new z87((Object) nt9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) zh6Var, (byte) 24));
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor7 = sQLiteCursor2;
                                if (sQLiteCursor7 != null) {
                                    sQLiteCursor7.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            arrayList16 = arrayList;
                            cc4.g(e, true);
                            if (sQLiteCursor7 != null) {
                            }
                            hl.c3(new z87((Object) nt9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) zh6Var, (byte) 24));
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                sQLiteCursor2 = sQLiteCursor7;
                arrayList = arrayList16;
                if (!arrayList12.isEmpty()) {
                    jf7Var2.k0(arrayList12, arrayList15, false);
                }
                if (arrayList13.isEmpty()) {
                    arrayList16 = arrayList;
                } else {
                    arrayList16 = arrayList;
                    try {
                        jf7Var2.P(TextUtils.join(",", arrayList13), arrayList16);
                    } catch (Exception e6) {
                        e = e6;
                        sQLiteCursor7 = sQLiteCursor2;
                        cc4.g(e, true);
                        if (sQLiteCursor7 != null) {
                        }
                        hl.c3(new z87((Object) nt9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) zh6Var, (byte) 24));
                        return;
                    }
                }
                if (!arrayList14.isEmpty()) {
                    jf7Var2.K(TextUtils.join(",", arrayList14), arrayList17);
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                hl.c3(new z87((Object) nt9Var, (Object) arrayList15, (Object) arrayList16, (Object) arrayList17, (Object) arrayList11, (Object) zh6Var, (byte) 24));
                return;
            case 2:
                nt9 nt9Var2 = (nt9) obj3;
                jf7 jf7Var3 = (jf7) obj2;
                lt9 lt9Var2 = (lt9) obj;
                SQLiteDatabase sQLiteDatabase2 = jf7Var3.b;
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = new ArrayList();
                ArrayList arrayList24 = new ArrayList();
                try {
                    try {
                        lt9Var = lt9Var2;
                    } catch (Exception e7) {
                        e = e7;
                        arrayList3 = arrayList22;
                        lt9Var = lt9Var2;
                    }
                    try {
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
                        sQLiteCursor4 = null;
                        while (queryFinalized2.next()) {
                            try {
                                try {
                                    try {
                                        mt9Var2 = new mt9();
                                        j = j3;
                                        mt9Var2.a = queryFinalized2.longValue(0);
                                        mt9Var2.j = queryFinalized2.intValue(1);
                                        mt9Var2.c = queryFinalized2.intValue(2);
                                        mt9Var2.k = queryFinalized2.intValue(3);
                                        mt9Var2.i = (queryFinalized2.intValue(4) & 1) != 0;
                                        mt9Var2.b = mt9Var2.k != 999;
                                        mt9Var2.e = queryFinalized2.intValue(7);
                                        mt9Var2.f = queryFinalized2.longValue(8);
                                        mt9Var2.g = queryFinalized2.longValue(9);
                                        mt9Var2.h = queryFinalized2.longValue(10);
                                        long j4 = mt9Var2.a;
                                        if (j4 < 0) {
                                            try {
                                                arrayList20.add(Long.valueOf(-j4));
                                            } catch (Throwable th5) {
                                                th = th5;
                                                sQLiteCursor3 = queryFinalized2;
                                                if (sQLiteCursor3 != null) {
                                                    sQLiteCursor3.dispose();
                                                }
                                                if (sQLiteCursor4 != null) {
                                                    sQLiteCursor4.dispose();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            arrayList19.add(Long.valueOf(j4));
                                        }
                                        arrayList4 = arrayList22;
                                        try {
                                            sQLiteCursor5 = queryFinalized2;
                                            try {
                                                try {
                                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j), Integer.valueOf(mt9Var2.c), Long.valueOf(mt9Var2.a));
                                                } catch (Exception e8) {
                                                    e = e8;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            sQLiteCursor5 = queryFinalized2;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLiteCursor5 = queryFinalized2;
                                        arrayList4 = arrayList22;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    sQLiteCursor5 = queryFinalized2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor5 = queryFinalized2;
                                arrayList3 = arrayList22;
                            }
                            try {
                                if (queryFinalized.next()) {
                                    NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(0);
                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(true), true);
                                    jf7.d(TLdeserialize3, arrayList19, arrayList20, arrayList21);
                                    mt9Var2.d = new r47(nt9Var2.a, TLdeserialize3, null, null, null, null, null, false, false, 0L, false, false, true, 0);
                                }
                                queryFinalized.dispose();
                                arrayList18.add(mt9Var2);
                                sQLiteCursor4 = queryFinalized;
                                arrayList22 = arrayList4;
                                j3 = j;
                                queryFinalized2 = sQLiteCursor5;
                            } catch (Exception e12) {
                                e = e12;
                                sQLiteCursor4 = queryFinalized;
                                arrayList3 = arrayList4;
                                z = true;
                                cc4.g(e, z);
                                if (sQLiteCursor5 != null) {
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteCursor4 = queryFinalized;
                                sQLiteCursor3 = sQLiteCursor5;
                                if (sQLiteCursor3 != null) {
                                }
                                if (sQLiteCursor4 != null) {
                                }
                                throw th;
                            }
                        }
                        sQLiteCursor5 = queryFinalized2;
                        arrayList4 = arrayList22;
                        if (!arrayList19.isEmpty()) {
                            arrayList3 = arrayList4;
                            try {
                                jf7Var3.k0(arrayList19, arrayList3, false);
                            } catch (Exception e13) {
                                e = e13;
                                z = true;
                                cc4.g(e, z);
                                if (sQLiteCursor5 != null) {
                                    sQLiteCursor5.dispose();
                                    break;
                                }
                            }
                        } else {
                            arrayList3 = arrayList4;
                        }
                        if (!arrayList20.isEmpty()) {
                            jf7Var3.P(TextUtils.join(",", arrayList20), arrayList23);
                        }
                        if (!arrayList21.isEmpty()) {
                            jf7Var3.K(TextUtils.join(",", arrayList21), arrayList24);
                        }
                        sQLiteCursor5.dispose();
                        break;
                    } catch (Exception e14) {
                        e = e14;
                        arrayList3 = arrayList22;
                        z = true;
                        sQLiteCursor4 = null;
                        sQLiteCursor5 = null;
                        cc4.g(e, z);
                        if (sQLiteCursor5 != null) {
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor3 = null;
                    sQLiteCursor4 = null;
                }
                break;
            case 3:
                wua wuaVar = (wua) obj3;
                pcc pccVar = (pcc) obj;
                if (((jxa) obj2).e) {
                    wuaVar.l1(j3, pccVar);
                    return;
                }
                v21 Q = wuaVar.j().Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, "NO_BALANCE"));
                Q.u = true;
                Q.j();
                return;
            case 4:
                af2 e15 = af2.e(((wua) obj3).a);
                dpb dpbVar = new dpb(null, ((TL_stars.TL_starGiftUnique) obj2).slug);
                long j5 = this.c;
                e15.q(j5, dpbVar, null, true);
                ((uj3) obj).presentFragment(zu1.ha(j5), true);
                return;
            case 5:
                wua wuaVar2 = (wua) obj3;
                ((boolean[]) obj2)[0] = true;
                wuaVar2.f2.setLoading(false);
                wuaVar2.l1(j3, (pcc) obj);
                return;
            case 6:
                ((jxa) obj2).c0((r47) obj, ((lva) obj3).a, this.c, true, true, null);
                return;
            case 7:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                d31 b0 = d31.b0((zu1) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String M0 = ob6.M0(2131744766, null);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = hl.S2(ob6.G((int) j3, "StarsGiftCompletedText", new Object[0]));
                }
                b0.s(document, M0, spannableStringBuilder).k(true);
                return;
            case 8:
                ((jxa) obj3).g0((LaunchActivity) obj2, j3, (String) obj);
                return;
            case 9:
                jxa jxaVar = (jxa) obj3;
                TLObject tLObject = (TLObject) obj2;
                pcc pccVar2 = (pcc) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    pccVar2.a(null);
                    return;
                }
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                jxaVar.M.put(Long.valueOf(j3), stargiftupgradepreview);
                pccVar2.a(stargiftupgradepreview);
                return;
            case 10:
                c6b c6bVar = (c6b) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList25 = c6bVar.h;
                ArrayList arrayList26 = c6bVar.g;
                int i5 = c6bVar.a;
                StringBuilder sb = new StringBuilder("StoriesController update stories for dialog ");
                long j6 = this.c;
                sb.append(j6);
                cc4.b(sb.toString());
                c6bVar.q0(j6, Collections.singletonList(tL_updateStory.story), false);
                c6bVar.o0(j6, Collections.singletonList(tL_updateStory.story), true);
                zh6 zh6Var2 = c6bVar.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) zh6Var2.f(j6);
                ArrayList arrayList27 = new ArrayList();
                int i6 = c6bVar.u;
                TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                if (peerStories != null) {
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        j2 = j6;
                        ip7.l0.c(new yo7(ip7.n(i5), j6, storyItem3.id, (byte) 0));
                    } else {
                        j2 = j6;
                    }
                    int i7 = 0;
                    while (true) {
                        if (i7 >= peerStories.stories.size()) {
                            z3 = false;
                        } else if (peerStories.stories.get(i7).id == storyItem3.id) {
                            boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemDeleted;
                            ArrayList<TL_stories.StoryItem> arrayList28 = peerStories.stories;
                            if (z5) {
                                arrayList28.remove(i7);
                                c00.q(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                                z3 = true;
                                z4 = true;
                            } else {
                                TL_stories.StoryItem storyItem4 = arrayList28.get(i7);
                                storyItem3 = c6b.e(storyItem4, storyItem3);
                                arrayList27.add(storyItem3);
                                peerStories.stories.set(i7, storyItem3);
                                if (storyItem3.attachPath == null) {
                                    storyItem3.attachPath = storyItem4.attachPath;
                                }
                                if (storyItem3.firstFramePath == null) {
                                    storyItem3.firstFramePath = storyItem4.firstFramePath;
                                }
                                c00.q(storyItem3.id, new StringBuilder("StoriesController update story id="));
                                z3 = true;
                            }
                        } else {
                            i7++;
                        }
                    }
                    z4 = false;
                    if (z3) {
                        z2 = false;
                    } else {
                        if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            cc4.b("StoriesController can't add new story DELETED");
                            return;
                        }
                        if (t6b.w(i5, storyItem3)) {
                            cc4.b("StoriesController can't add new story isExpired");
                            return;
                        }
                        if (j2 > 0 && (user == null || (!user.self && !c6bVar.N(user)))) {
                            cc4.b("StoriesController can't add new story user is not contact");
                            return;
                        }
                        arrayList27.add(storyItem3);
                        peerStories.stories.add(storyItem3);
                        cc4.b("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                        c6bVar.Y(j2, storyItem3);
                        c6bVar.f(peerStories);
                        z2 = true;
                        z4 = true;
                    }
                    if (z4) {
                        if (!peerStories.stories.isEmpty() || c6bVar.L(j2)) {
                            Collections.sort(peerStories.stories, c6b.X);
                        } else {
                            arrayList26.remove(peerStories);
                            arrayList25.remove(peerStories);
                            zh6Var2.l(wf3.n(peerStories.peer));
                            c6bVar.u--;
                        }
                    }
                    if (i6 != c6bVar.u) {
                        c6bVar.l.edit().putInt("total_stores", c6bVar.u).apply();
                    }
                    c6bVar.u(arrayList26);
                    c6bVar.u(arrayList25);
                    if (z2) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            i2 = 0;
                            jn7.f(i5).k(jn7.z5, Long.valueOf(j2), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i2 = 0;
                        }
                        jn7.f(i5).k(jn7.y5, new Object[i2]);
                    }
                    uc7.s1(i5).B();
                    return;
                }
                j2 = j6;
                if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                    cc4.b("StoriesController can't add user " + j2 + " with new story DELETED");
                    return;
                }
                if (t6b.w(i5, storyItem3)) {
                    cc4.b("StoriesController can't add user " + j2 + " with new story isExpired");
                    return;
                }
                if (j2 > 0 && (user == null || (!user.self && !c6bVar.N(user)))) {
                    cc4.b("StoriesController can't add user cause is not contact");
                    return;
                }
                TL_stories.PeerStories tL_peerStories = new TL_stories.TL_peerStories();
                tL_peerStories.peer = tL_updateStory.peer;
                tL_peerStories.stories.add(tL_updateStory.story);
                c00.q(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                long n = wf3.n(tL_peerStories.peer);
                c6bVar.d0(n, tL_peerStories);
                if (n != yac.h(yac.t0).n) {
                    TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(n));
                    c6bVar.f(tL_peerStories);
                    if (X1 != null && !X1.stories_hidden) {
                        c6bVar.Z(tL_peerStories);
                    }
                }
                cc4.b("StoriesController applyNewStories " + n);
                c6bVar.q0(n, tL_peerStories.stories, false);
                c6bVar.u = c6bVar.u + 1;
                c6bVar.Q(j2);
                z2 = true;
                if (i6 != c6bVar.u) {
                }
                c6bVar.u(arrayList26);
                c6bVar.u(arrayList25);
                if (z2) {
                }
                uc7.s1(i5).B();
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                wz5 wz5Var = (wz5) obj;
                c6b c6bVar2 = ((l5b) obj3).c;
                int i8 = c6bVar2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    uc7.s1(i8).j4(tL_stories_peerStories.users, false);
                    uc7.s1(i8).c4(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        while (true) {
                            if (i3 < peerStories2.stories.size()) {
                                if (!(peerStories2.stories.get(i3).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i3++;
                                } else {
                                    zh6 zh6Var3 = c6bVar2.E;
                                    storyItem2 = peerStories2.stories.get(i3);
                                    zh6Var3.k(j3, storyItem2);
                                }
                            }
                        }
                    }
                }
                wz5Var.a(storyItem2);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) obj2;
                pcc pccVar3 = (pcc) obj;
                c6b c6bVar3 = ((m5b) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    uc7.s1(c6bVar3.a).j4(tL_stories_stories.users, false);
                    uc7.s1(c6bVar3.a).c4(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        zh6 zh6Var4 = c6bVar3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        zh6Var4.k(j3, storyItem);
                    }
                }
                pccVar3.a(storyItem);
                return;
            case 13:
                long j7 = this.c;
                hl.d3(new z5b((s6b) obj3, (View) obj2, j7, (byte) 3), 500L);
                ((q6b) obj).f(j7);
                return;
            case 14:
                r9b r9bVar = (r9b) obj3;
                boolean T = xc2.T((TLRPC.Chat) obj);
                long j8 = this.c;
                TLRPC.ChatFull D0 = ((jf7) obj2).D0(j8, T, true, true);
                if (D0 == null || (chatParticipants = D0.participants) == null || ((arrayList5 = chatParticipants.participants) != null && arrayList5.size() < D0.participants_count - 1)) {
                    hl.c3(new dp2((fn7) r9bVar, T, j8, (byte) 3));
                    return;
                } else {
                    hl.c3(new z5b(r9bVar, j8, D0, (byte) 4));
                    return;
                }
            case 15:
                a();
                return;
            case 16:
                l1c l1cVar = (l1c) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ((fu5) obj2).u();
                TLRPC.User X12 = uc7.s1(l1cVar.e).X1(Long.valueOf(j3));
                if (X12 != null) {
                    zu1 zu1Var = l1cVar.s;
                    jj.q(zu1Var, -1, X12, chat, true, new i02((Object) l1cVar, j3, (byte) 13), zu1Var.getResourceProvider());
                    return;
                }
                return;
            case 17:
                l1c l1cVar2 = (l1c) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                l1cVar2.l0.removeAll((HashSet) obj2);
                l1cVar2.n();
                int size = arrayList29.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj4 = arrayList29.get(i9);
                    i9++;
                    long intValue = ((Integer) obj4).intValue();
                    if (j3 == intValue) {
                        l1cVar2.k(intValue, false);
                        return;
                    }
                }
                return;
            default:
                ((VideoCapturerDevice) obj3).lambda$init$3((CameraEnumerator) obj2, (String) obj, j3);
                return;
        }
    }

    public /* synthetic */ y09(Object obj, long j, TLObject tLObject, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = tLObject;
        this.e = obj2;
    }

    public /* synthetic */ y09(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = j;
        this.e = obj3;
    }

    public /* synthetic */ y09(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j;
    }
}
