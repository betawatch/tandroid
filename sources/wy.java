// default package

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wy(z3a z3aVar, k27 k27Var, TLRPC.Message message, long j, int i) {
        this.a = (byte) 11;
        this.d = z3aVar;
        this.e = k27Var;
        this.f = message;
        this.b = j;
        this.c = i;
    }

    private final void a() {
        SQLitePreparedStatement executeFast;
        boolean z;
        ad7 ad7Var = (ad7) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i = this.c;
        long j = this.b;
        vf6 vf6Var = ad7Var.K;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ad7Var.b.beginTransaction();
                executeFast = ad7Var.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (arrayList != null) {
                int size = arrayList.size();
                z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i2);
                    long n = cf3.n(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, n);
                    executeFast.step();
                    vf6Var.l(n);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long m = cf3.m(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, m);
                    executeFast.step();
                    vf6Var.l(m);
                }
            } else {
                executeFast.requery();
                executeFast.bindInteger(1, i);
                boolean z2 = i == 1;
                executeFast.bindInteger(2, 0);
                executeFast.bindLong(3, j);
                executeFast.step();
                z = z2;
            }
            executeFast.dispose();
            ad7Var.b.commitTransaction();
            if (!z) {
                ad7Var.k(1);
            }
            ad7Var.q1(false);
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            ad7Var.n(e, true);
            SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private final void b() {
        u41 u41Var = (u41) this.d;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.e;
        fx0[] fx0VarArr = (fx0[]) this.f;
        u41Var.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        int i = this.c;
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new tg((Object) u41Var, (Object) fx0VarArr, i, this.b, (byte) 6));
    }

    private final void c() {
        TL_stories.StoryItem storyItem;
        g2b g2bVar = (g2b) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        int i = g2bVar.a;
        HashSet hashSet = g2bVar.t;
        int i2 = this.c;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            na7.q1(i).a4(tL_stories_stories.users, false);
            na7.q1(i).U3(tL_stories_stories.chats, false);
            for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                if (tL_stories_stories.stories.get(i3).id == i2) {
                    storyItem = tL_stories_stories.stories.get(i3);
                    break;
                }
            }
        }
        storyItem = null;
        g2bVar.W.remove(str);
        long j = this.b;
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = na7.q1(i).w1(j);
            tL_updateStory.story = storyItem;
            g2bVar.b0(tL_updateStory);
            return;
        }
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (str2.endsWith(":" + j + ":" + i2)) {
                hashSet.remove(str2);
                break;
            }
        }
        hashSet.add(str);
        g2bVar.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
    }

    private final void d() {
        hgb hgbVar = (hgb) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        vf6 vf6Var = hgbVar.l;
        vf6 vf6Var2 = hgbVar.k;
        vf6 vf6Var3 = hgbVar.j;
        if (this.c == hgbVar.c) {
            long j = this.b;
            vf6Var3.k(arrayList, j);
            vf6Var2.k(arrayList2, j);
            ArrayList arrayList3 = (ArrayList) vf6Var.f(j);
            vf6Var.l(j);
            if (j == hgbVar.d) {
                mv6 mv6Var = hgbVar.b;
                if (j != 0) {
                    ArrayList arrayList4 = (ArrayList) vf6Var3.f(j);
                    ArrayList arrayList5 = (ArrayList) vf6Var2.f(j);
                    if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                        mv6Var.o0(arrayList5);
                        zu6 zu6Var = (zu6) mv6Var.b;
                        if (cf3.D(j)) {
                            TLRPC.User user = (TLRPC.User) hgbVar.h.f(j);
                            zu6Var.a.setQueueTitle(user != null ? qu2.m(0, user.first_name, user.last_name) : "DELETED USER");
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-j);
                            zu6Var.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                        }
                        k27 k27Var = (k27) arrayList4.get(0);
                        pj4 pj4Var = new pj4((byte) 15);
                        pj4Var.X((long) (k27Var.L0() * 1000.0d));
                        pj4Var.Y("android.media.metadata.ARTIST", k27Var.w1(true));
                        pj4Var.Y("android.media.metadata.TITLE", k27Var.y1(true));
                        mv6Var.m0(new MediaMetadataCompat((Bundle) pj4Var.b));
                    }
                }
            }
            if (arrayList3 != null) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    ((Runnable) arrayList3.get(i)).run();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x042d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteCursor sQLiteCursor;
        boolean z;
        int i;
        SQLiteCursor queryFinalized;
        boolean z2;
        switch (this.a) {
            case 0:
                new h1a((Context) this.d, this.c, ((gt4) this.e).d, null, this.b, (av4) this.f, false, false).show();
                return;
            case 1:
                wp0 wp0Var = (wp0) this.d;
                long[] jArr = (long[]) this.e;
                long j = this.b;
                int i2 = this.c;
                Runnable runnable = (Runnable) this.f;
                for (long j2 : jArr) {
                    ad7 messagesStorage = wp0Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.H(new yb7(messagesStorage, i2, j, j2, (byte) 4));
                }
                gl.d3(runnable);
                return;
            case 2:
                ct0 ct0Var = (ct0) this.d;
                bt0 bt0Var = (bt0) this.e;
                int i3 = this.c;
                TLObject tLObject = (TLObject) this.f;
                long j3 = this.b;
                int i4 = ct0Var.a;
                boolean[] zArr = bt0Var.d;
                boolean[] zArr2 = bt0Var.b;
                ArrayList[] arrayListArr = bt0Var.a;
                zArr[i3] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    na7.q1(i4).a4(starsStatus.users, false);
                    na7.q1(i4).U3(starsStatus.chats, false);
                    arrayListArr[i3].addAll(starsStatus.history);
                    zArr2[i3] = !arrayListArr[i3].isEmpty() || zArr2[i3];
                    boolean[] zArr3 = bt0Var.e;
                    boolean z3 = (starsStatus.flags & 1) == 0;
                    zArr3[i3] = z3;
                    bt0Var.c[i3] = z3 ? null : starsStatus.next_offset;
                    kk7.f(i4).k(kk7.E3, Long.valueOf(j3));
                    return;
                }
                return;
            case 3:
                gb2 gb2Var = (gb2) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i5 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                long j4 = this.b;
                pb0[] pb0VarArr = gb2Var.l7;
                if (user != null) {
                    pb0VarArr[i5].q(user);
                    gb2Var.k7[i5].U(user, gb2Var.l7[i5], null);
                    return;
                } else if (chat == null) {
                    pb0VarArr[i5].j(j4, "", "", null);
                    return;
                } else {
                    pb0VarArr[i5].p(chat);
                    gb2Var.k7[i5].U(chat, gb2Var.l7[i5], null);
                    return;
                }
            case 4:
                nu9 nu9Var = (nu9) this.d;
                int i6 = this.c;
                long j5 = this.b;
                d dVar = (d) this.e;
                uy5 uy5Var = (uy5) this.f;
                nu9Var.a(Boolean.TRUE);
                u21.Y().Q(R.raw.contact_check, 36, k96.M0(2131749333, null)).j();
                uz4.a(i6, j5, System.currentTimeMillis() + 180000, 0, new go2(nu9Var, dVar, i6, uy5Var));
                return;
            case 5:
                byte b = 5;
                byte b2 = 4;
                hq6 hq6Var = (hq6) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i7 = this.c;
                p8c p8cVar = (p8c) this.f;
                long j6 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_allStickers) {
                    hq6Var.s1(i7, (TLRPC.TL_messages_allStickers) tLObject2, new mn0(p8cVar, b2));
                    return;
                } else {
                    hq6Var.A1(i7, null, false, (int) (System.currentTimeMillis() / 1000), j6, new mn0(p8cVar, b));
                    return;
                }
            case 6:
                ad7 ad7Var = (ad7) this.d;
                int i8 = this.c;
                long j7 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str = (String) this.f;
                try {
                    ad7Var.b.beginTransaction();
                    TLRPC.TL_message c0 = ad7Var.c0(i8, j7);
                    c0.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                    c0.voiceTranscriptionRated = message.voiceTranscriptionRated;
                    c0.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                    c0.voiceTranscriptionForce = message.voiceTranscriptionForce;
                    c0.voiceTranscriptionId = message.voiceTranscriptionId;
                    c0.voiceTranscription = str;
                    c0.voiceTranscriptionLocal = message.voiceTranscriptionLocal;
                    c0.voiceTranscriptionWords = message.voiceTranscriptionWords;
                    int i9 = 0;
                    while (i9 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                        SQLitePreparedStatement executeFast = i9 == 0 ? sQLiteDatabase2.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase2.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                        try {
                            executeFast.requery();
                            NativeByteBuffer c = l17.c(c0);
                            if (c != null) {
                                executeFast.bindByteBuffer(1, c);
                            } else {
                                executeFast.bindNull(1);
                            }
                            executeFast.bindInteger(2, i8);
                            executeFast.bindLong(3, j7);
                            executeFast.step();
                            executeFast.dispose();
                            ad7Var.b.commitTransaction();
                            if (c != null) {
                                c.reuse();
                            }
                            i9++;
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            try {
                                ad7Var.n(e, true);
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = ad7Var.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            sQLiteDatabase = ad7Var.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    e = e2;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                }
            case 7:
                ad7 ad7Var2 = (ad7) this.d;
                long j8 = this.b;
                int i10 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) this.e;
                r57 r57Var = (r57) this.f;
                long j9 = -j8;
                try {
                    try {
                        i = 0;
                        queryFinalized = ad7Var2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j9, new Object[0]);
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                try {
                    if (queryFinalized.next()) {
                        i = queryFinalized.intValue(0);
                        z2 = false;
                    } else {
                        z2 = i10 != 0;
                    }
                    queryFinalized.dispose();
                    ad7Var2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM topics WHERE did = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j9).stepThis().dispose();
                    ad7Var2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j9).stepThis().dispose();
                    hq6 mediaDataController = ad7Var2.getMediaDataController();
                    mediaDataController.getClass();
                    gl.d3(new ko6(mediaDataController, j9, (byte) 0));
                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    tL_messages_dialogs.chats.addAll(tL_updates_channelDifferenceTooLong.chats);
                    tL_messages_dialogs.users.addAll(tL_updates_channelDifferenceTooLong.users);
                    tL_messages_dialogs.messages.addAll(tL_updates_channelDifferenceTooLong.messages);
                    TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
                    dialog.id = j9;
                    z = true;
                    try {
                        dialog.flags = 1;
                        dialog.notify_settings = null;
                        dialog.pinned = i != 0;
                        dialog.pinnedNum = i;
                        tL_messages_dialogs.dialogs.add(dialog);
                        ad7Var2.b1(tL_messages_dialogs, 0);
                        try {
                            ad7Var2.O1(j9, j8, new ArrayList(), null);
                        } catch (Exception e4) {
                            e = e4;
                            z = true;
                            ad7Var2 = ad7Var2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                    try {
                        gl.d3(new go6((Object) ad7Var2, j9, (Object) tL_updates_channelDifferenceTooLong, (byte) 17));
                        if (z2) {
                            if (i10 == 1) {
                                ad7Var2.getMessagesController().C(j8, true);
                            } else {
                                ad7Var2.getMessagesController().z0(j8, false);
                            }
                        }
                        if (i10 != 1) {
                            pub pubVar = ad7Var2.getMessagesController().g4;
                            pubVar.getClass();
                            z = true;
                            gl.d3(new ko2((Object) pubVar, j8, z, (byte) 4));
                        }
                    } catch (Exception e6) {
                        e = e6;
                        z = true;
                        sQLiteCursor = null;
                        try {
                            ad7Var2.n(e, z);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            r57Var.run();
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    z = true;
                    sQLiteCursor = queryFinalized;
                    ad7Var2.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    r57Var.run();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                r57Var.run();
                return;
            case 8:
                a();
                return;
            case 9:
                t7a t7aVar = (t7a) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                long j10 = this.b;
                String str2 = (String) this.f;
                int i11 = this.c;
                t7aVar.run();
                cq7.s(tL_starGiftUnique, j10 != 0 ? k96.a0(null, null, 2131749656, str2, cf3.r(i11, j10)) : k96.a0(null, null, 2131749657, str2));
                return;
            case 10:
                nna nnaVar = (nna) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.e;
                String str3 = (String) this.f;
                int i12 = this.c;
                long j11 = this.b;
                nnaVar.run();
                cq7.s(tL_starGiftUnique2, k96.a0(null, null, 2131749651, str3));
                String str4 = tL_starGiftUnique2.slug;
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                gl.e3(new iv1(i12, 0, j11, str4, true), cq7.a[0]);
                return;
            case 11:
                z3a z3aVar = (z3a) this.d;
                k27 k27Var = (k27) this.e;
                TLRPC.Message message2 = (TLRPC.Message) this.f;
                long j12 = this.b;
                int i13 = this.c;
                int e1 = k27Var.e1();
                k27Var.k = message2;
                k27Var.M1 = true;
                kk7 notificationCenter = z3aVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(e1);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j12);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                z3aVar.getNotificationCenter().k(22, Integer.valueOf(e1), Integer.valueOf(message2.id), message2, Long.valueOf(j12), 0L, 0, bool);
                z3aVar.c0(i13);
                z3aVar.h0(i13, false);
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case 14:
                d();
                return;
            default:
                z zVar = (z) this.d;
                long j13 = this.b;
                int i14 = this.c;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                if (zVar.A) {
                    hwc.a.execute(new sma(zVar, j13, (byte) 10));
                    return;
                }
                zVar.v = j13;
                int i15 = zVar.M;
                if (i15 != i14 && i15 > 0) {
                    zVar.c.m(j13, i15 / zVar.l);
                }
                if (!zVar.H.equals(str5)) {
                    zVar.c.i(j13, zVar.H.getBytes(StandardCharsets.UTF_8));
                }
                if (zVar.k != null && !zVar.k.equals(str6)) {
                    zVar.c.h(j13, zVar.k.getBytes(StandardCharsets.UTF_8));
                }
                zVar.I = true;
                zVar.c.l(j13, zVar.L);
                zVar.e();
                return;
        }
    }

    public /* synthetic */ wy(wp0 wp0Var, long[] jArr, long j, int i, Runnable runnable) {
        this.a = (byte) 1;
        this.d = wp0Var;
        this.e = jArr;
        this.b = j;
        this.c = i;
        this.f = runnable;
    }

    public /* synthetic */ wy(t7a t7aVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, String str, int i) {
        this.a = (byte) 9;
        this.d = t7aVar;
        this.e = tL_starGiftUnique;
        this.b = j;
        this.f = str;
        this.c = i;
    }

    public /* synthetic */ wy(Context context, int i, gt4 gt4Var, long j, av4 av4Var) {
        this.a = (byte) 0;
        this.d = context;
        this.c = i;
        this.e = gt4Var;
        this.b = j;
        this.f = av4Var;
    }

    public /* synthetic */ wy(Object obj, int i, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = j;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ wy(Object obj, long j, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = i;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ wy(Object obj, Object obj2, int i, Object obj3, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = i;
        this.f = obj3;
        this.b = j;
    }

    public /* synthetic */ wy(Object obj, Object obj2, Serializable serializable, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = serializable;
        this.c = i;
        this.b = j;
    }
}
