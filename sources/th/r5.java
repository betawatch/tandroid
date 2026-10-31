package th;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.k00;
import org.telegram.messenger.l00;
import org.telegram.messenger.li;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r5 {
    public int a;
    public hs b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024d A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(r5 r5Var, j4 j4Var) {
        boolean z10;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        int i10;
        int i11;
        int i12;
        TLRPC.Peer peer;
        hs hsVar = r5Var.b;
        SQLiteDatabase sQLiteDatabase2 = hsVar.b;
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i13 = r5Var.a;
        ConnectionsManager.getInstance(i13).getCurrentTime();
        boolean z11 = true;
        try {
            int i14 = 0;
            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (queryFinalized.next()) {
                    try {
                        long longValue = queryFinalized.longValue(0);
                        longSparseIntArray.put(longValue, queryFinalized.intValue(1));
                        if (longValue > 0) {
                            arrayList2.add(Long.valueOf(longValue));
                        } else {
                            arrayList3.add(Long.valueOf(longValue));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        sQLiteCursor = queryFinalized;
                        try {
                            f8.g(th, z10);
                            org.telegram.messenger.i0.g3(new sg.v(j4Var, 15));
                            return;
                        } finally {
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                        }
                    }
                }
                queryFinalized.dispose();
                int i15 = 0;
                while (i15 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i15);
                    int valueAt = longSparseIntArray.valueAt(i15);
                    Locale locale = Locale.US;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + keyAt, new Object[i14]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        ?? r82 = z11;
                        while (sQLiteCursor2.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(i14);
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor2.byteBufferValue(r82);
                            if (byteBufferValue != 0) {
                                sQLiteDatabase = sQLiteDatabase2;
                                TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                                TLdeserialize.dialogId = keyAt;
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                    hs.c(peer, arrayList2, arrayList3);
                                }
                                int i16 = 0;
                                while (i16 < TLdeserialize.media_areas.size()) {
                                    if (TLdeserialize.media_areas.get(i16) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i11 = i13;
                                        i12 = i16;
                                        long j10 = ((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i16)).channel_id;
                                        if (!arrayList3.contains(Long.valueOf(j10))) {
                                            arrayList3.add(Long.valueOf(j10));
                                        }
                                    } else {
                                        i11 = i13;
                                        i12 = i16;
                                    }
                                    i16 = i12 + 1;
                                    i13 = i11;
                                }
                                i10 = i13;
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    hs.c(peer2, arrayList2, arrayList3);
                                }
                                n6.a(TLdeserialize, byteBufferValue2);
                                arrayList4.add(TLdeserialize);
                                byteBufferValue.reuse();
                            } else {
                                sQLiteDatabase = sQLiteDatabase2;
                                i10 = i13;
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            i13 = i10;
                            r82 = 1;
                            i14 = 0;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
                        int i17 = i13;
                        sQLiteCursor2.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = valueAt;
                        tL_peerStories.peer = vp.r1(i17).y1(keyAt);
                        arrayList.add(tL_peerStories);
                        i15++;
                        longSparseIntArray = longSparseIntArray3;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        i13 = i17;
                        z11 = true;
                        i14 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = true;
                        sQLiteCursor = sQLiteCursor2;
                        f8.g(th, z10);
                        org.telegram.messenger.i0.g3(new sg.v(j4Var, 15));
                        return;
                    }
                }
                int i18 = i13;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = hsVar.l0(arrayList2);
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                try {
                    hsVar.Q(TextUtils.join(",", arrayList3), arrayList5);
                } catch (Exception e) {
                    arrayList5.clear();
                    hsVar.o(e, true);
                }
                tL_stories_allStories.chats = arrayList5;
                int i19 = 0;
                while (i19 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i19);
                    long o10 = org.telegram.messenger.o5.o(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList6 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
                    SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                    int i20 = 0;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i20 < arrayList6.size()) {
                        TL_stories.StoryItem storyItem = arrayList6.get(i20);
                        if (currentTime > arrayList6.get(i20).expire_date) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                                arrayList7 = new ArrayList();
                            }
                            arrayList8.add(Integer.valueOf(storyItem.id));
                            arrayList7.add(storyItem);
                            arrayList6.remove(i20);
                            i20--;
                        }
                        i20++;
                    }
                    if (arrayList7 != null) {
                        String join = TextUtils.join(", ", arrayList8);
                        try {
                            Locale locale2 = Locale.US;
                            sQLiteDatabase4.executeFast("DELETE FROM stories WHERE dialog_id = " + o10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                        } catch (SQLiteException e7) {
                            f8.g(e7, true);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i19);
                        i19--;
                    }
                    Collections.sort(peerStories.stories, e5.X);
                    i19++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$-CC.comparingInt(new bi.t6(22)));
                org.telegram.messenger.i0.g3(new o0(17, j4Var, tL_stories_allStories));
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor2 = queryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            z10 = true;
            sQLiteCursor = null;
        }
    }

    public static void b(int i10, long j10, jj jjVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = jjVar.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = c(i10, j10, storyItem);
        }
        int i11 = jjVar.D;
        if (i11 == 23 || i11 == 24) {
            x0 x0Var = new x0();
            x0Var.user_id = org.telegram.messenger.o5.o(jjVar.k.media.peer);
            TLRPC.MessageMedia messageMedia = jjVar.k.media;
            x0Var.peer = messageMedia.peer;
            x0Var.id = messageMedia.id;
            x0Var.storyItem = c(i10, j10, storyItem);
            TLRPC.Message message2 = jjVar.k;
            x0Var.via_mention = message2.media.via_mention;
            message2.media = x0Var;
        }
        TLRPC.MessageMedia messageMedia2 = jjVar.k.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i12 = 0; i12 < jjVar.k.media.webpage.attributes.size(); i12++) {
            TLRPC.WebPageAttribute webPageAttribute = jjVar.k.media.webpage.attributes.get(i12);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.id == storyItem.id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i10, j10, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = storyItem.expire_date;
        boolean z10 = false;
        if (i11 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i11) {
            z10 = true;
        }
        if (storyItem.pinned || !z10 || j10 == 0 || j10 == d20.i(i10).n) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.id = storyItem.id;
        return tL_storyItemDeleted;
    }

    public static int e(jj jjVar) {
        TLRPC.WebPage webPage;
        int i10 = jjVar.D;
        if (i10 == 23 || i10 == 24) {
            return jjVar.k.media.id;
        }
        TLRPC.MessageMedia messageMedia = jjVar.k.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < jjVar.k.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = jjVar.k.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                }
            }
        }
        return jjVar.k.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i10, boolean z10, l00 l00Var) {
        r5 r5Var = this;
        l00 l00Var2 = l00Var;
        int i11 = r5Var.a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        k00 d = l00.d(l00Var2, "fillMessagesWithStories: applying stories for existing array");
        int i12 = 0;
        while (i12 < hVar.m()) {
            long j10 = hVar.j(i12);
            ArrayList arrayList2 = (ArrayList) hVar.n(i12);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                jj jjVar = (jj) arrayList2.get(i13);
                TL_stories.StoryItem f7 = r5Var.f(e(jjVar), j10);
                if (f7 != null && !(f7 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i11, j10, jjVar, f7);
                    arrayList.add(jjVar);
                    arrayList2.remove(i13);
                    i13--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.c;
                        Object obj = objArr[i12];
                        Object obj2 = a0.i.a;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            hVar.a = true;
                        }
                        i12--;
                    }
                }
                i13++;
            }
            i12++;
        }
        l00.a(d);
        if (z10) {
            r5Var.j(arrayList);
        }
        if (hVar.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {hVar.m()};
        int i14 = 0;
        while (i14 < hVar.m()) {
            long j11 = hVar.j(i14);
            ArrayList arrayList3 = (ArrayList) hVar.n(i14);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = vp.r1(i11).i1(j11);
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                tL_stories_getStoriesByID.id.add(Integer.valueOf(e((jj) arrayList3.get(i15))));
            }
            StringBuilder s10 = a1.g.s(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            s10.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new li(r5Var, l00.d(l00Var2, s10.toString()), arrayList3, j11, z10, l00Var2, iArr, runnable));
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, i10);
            }
            i14++;
            r5Var = this;
            l00Var2 = l00Var;
        }
    }

    public final TL_stories.StoryItem f(int i10, long j10) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    n6.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            f8.g(e, true);
            return storyItem;
        }
    }

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i10);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        f8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = n6.b(storyItem);
                        if (b10 != null) {
                            executeFast.bindByteBuffer(4, b10);
                        } else {
                            executeFast.bindNull(4);
                        }
                        if (b10 != null) {
                            b10.reuse();
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                f8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = n6.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void i(int i10, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i11 = this.a;
        hs hsVar = this.b;
        if (j10 > 0) {
            TLRPC.UserFull a2 = vp.r1(i11).a2(j10);
            if (a2 != null && (peerStories2 = a2.stories) != null) {
                peerStories2.max_read_id = i10;
                hsVar.j2(a2, false);
            }
        } else {
            TLRPC.ChatFull M0 = vp.r1(i11).M0(-j10);
            if (M0 != null && (peerStories = M0.stories) != null) {
                peerStories.max_read_id = i10;
                hsVar.N1(M0, false);
            }
        }
        hsVar.a.c(new o5(this, j10, i10, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        hs hsVar = this.b;
        int i10 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = hsVar.b;
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            int i11 = 0;
            while (i11 < list.size()) {
                jj jjVar = (jj) list.get(i11);
                int i12 = 0;
                while (i12 < 2) {
                    if (jjVar.k.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i12 == 0 ? executeFast : executeFast2;
                        if (sQLitePreparedStatement2 == null) {
                            sQLitePreparedStatement = executeFast;
                        } else {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(jjVar.k.replyStory.getObjectSize());
                            jjVar.k.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(i10, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(2, jjVar.f1());
                            sQLitePreparedStatement = executeFast;
                            sQLitePreparedStatement2.bindLong(3, jj.B0(jjVar.k));
                            sQLitePreparedStatement2.step();
                        }
                    } else {
                        sQLitePreparedStatement = executeFast;
                        SQLitePreparedStatement sQLitePreparedStatement3 = i12 == 0 ? executeFast3 : executeFast4;
                        if (sQLitePreparedStatement3 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(jjVar.k.getObjectSize());
                            jjVar.k.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement3.requery();
                            sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement3.bindInteger(2, jjVar.f1());
                            sQLitePreparedStatement3.bindLong(3, jj.B0(jjVar.k));
                            sQLitePreparedStatement3.step();
                        }
                    }
                    i12++;
                    executeFast = sQLitePreparedStatement;
                    i10 = 1;
                }
                i11++;
                i10 = 1;
            }
            executeFast.dispose();
            executeFast2.dispose();
            executeFast3.dispose();
            executeFast4.dispose();
        } catch (Throwable th2) {
            hsVar.o(th2, true);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.b.a.c(new p5(this, j10, storyItem, 0));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            f8.d("StoriesStorage: try write deleted story");
        }
        if (w5.w(this.a, storyItem)) {
            f8.d("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = n6.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
