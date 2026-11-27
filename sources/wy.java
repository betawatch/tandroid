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
import org.telegram.ui.ActionBar.e;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wy(r7a r7aVar, r47 r47Var, TLRPC.Message message, long j, int i) {
        this.a = (byte) 11;
        this.d = r7aVar;
        this.e = r47Var;
        this.f = message;
        this.b = j;
        this.c = i;
    }

    private final void a() {
        SQLitePreparedStatement executeFast;
        boolean z;
        kf7 kf7Var = (kf7) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        int i = this.c;
        long j = this.b;
        zh6 zh6Var = kf7Var.K;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                kf7Var.b.beginTransaction();
                executeFast = kf7Var.b.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
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
                    long n = wf3.n(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, n);
                    executeFast.step();
                    zh6Var.l(n);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z = false;
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i3);
                    long m = wf3.m(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, m);
                    executeFast.step();
                    zh6Var.l(m);
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
            kf7Var.b.commitTransaction();
            if (!z) {
                kf7Var.m(1);
            }
            kf7Var.u1(false);
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = executeFast;
            kf7Var.p(e, true);
            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
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
        c51 c51Var = (c51) this.d;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.e;
        nx0[] nx0VarArr = (nx0[]) this.f;
        c51Var.setLoading(true);
        TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
        tL_fulfillStarsSubscription.subscription_id = starsSubscription.id;
        tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
        int i = this.c;
        ConnectionsManager.getInstance(i).sendRequest(tL_fulfillStarsSubscription, new gg((Object) c51Var, (Object) nx0VarArr, i, this.b, (byte) 6));
    }

    private final void c() {
        TL_stories.StoryItem storyItem;
        c6b c6bVar = (c6b) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        int i = c6bVar.a;
        HashSet hashSet = c6bVar.t;
        int i2 = this.c;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            uc7.s1(i).j4(tL_stories_stories.users, false);
            uc7.s1(i).c4(tL_stories_stories.chats, false);
            for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                if (tL_stories_stories.stories.get(i3).id == i2) {
                    storyItem = tL_stories_stories.stories.get(i3);
                    break;
                }
            }
        }
        storyItem = null;
        c6bVar.W.remove(str);
        long j = this.b;
        if (storyItem != null) {
            storyItem.dialogId = j;
            TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
            tL_updateStory.peer = uc7.s1(i).y1(j);
            tL_updateStory.story = storyItem;
            c6bVar.b0(tL_updateStory);
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
        c6bVar.l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
    }

    private final void d() {
        dkb dkbVar = (dkb) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        zh6 zh6Var = dkbVar.l;
        zh6 zh6Var2 = dkbVar.k;
        zh6 zh6Var3 = dkbVar.j;
        if (this.c == dkbVar.c) {
            long j = this.b;
            zh6Var3.k(j, arrayList);
            zh6Var2.k(j, arrayList2);
            ArrayList arrayList3 = (ArrayList) zh6Var.f(j);
            zh6Var.l(j);
            if (j == dkbVar.d) {
                rx6 rx6Var = dkbVar.b;
                if (j != 0) {
                    ArrayList arrayList4 = (ArrayList) zh6Var3.f(j);
                    ArrayList arrayList5 = (ArrayList) zh6Var2.f(j);
                    if (arrayList4 != null && !arrayList4.isEmpty() && arrayList5 != null) {
                        rx6Var.t0(arrayList5);
                        ex6 ex6Var = (ex6) rx6Var.b;
                        if (wf3.D(j)) {
                            TLRPC.User user = (TLRPC.User) dkbVar.h.f(j);
                            ex6Var.a.setQueueTitle(user != null ? lv2.m(0, user.first_name, user.last_name) : "DELETED USER");
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-j);
                            ex6Var.a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                        }
                        r47 r47Var = (r47) arrayList4.get(0);
                        v34 v34Var = new v34((byte) 16);
                        v34Var.R((long) (r47Var.L0() * 1000.0d));
                        v34Var.S("android.media.metadata.ARTIST", r47Var.w1(true));
                        v34Var.S("android.media.metadata.TITLE", r47Var.y1(true));
                        rx6Var.r0(new MediaMetadataCompat((Bundle) v34Var.b));
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
                new a5a((Context) this.d, this.c, ((kv4) this.e).d, null, this.b, (ex4) this.f, false, false).show();
                return;
            case 1:
                wp0 wp0Var = (wp0) this.d;
                long[] jArr = (long[]) this.e;
                long j = this.b;
                int i2 = this.c;
                Runnable runnable = (Runnable) this.f;
                for (long j2 : jArr) {
                    kf7 messagesStorage = wp0Var.getMessagesStorage();
                    messagesStorage.getClass();
                    messagesStorage.J(new ae7(messagesStorage, i2, j, j2, (byte) 4));
                }
                hl.c3(runnable);
                return;
            case 2:
                kt0 kt0Var = (kt0) this.d;
                jt0 jt0Var = (jt0) this.e;
                int i3 = this.c;
                TLObject tLObject = (TLObject) this.f;
                long j3 = this.b;
                int i4 = kt0Var.a;
                boolean[] zArr = jt0Var.d;
                boolean[] zArr2 = jt0Var.b;
                ArrayList[] arrayListArr = jt0Var.a;
                zArr[i3] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    uc7.s1(i4).j4(starsStatus.users, false);
                    uc7.s1(i4).c4(starsStatus.chats, false);
                    arrayListArr[i3].addAll(starsStatus.history);
                    zArr2[i3] = !arrayListArr[i3].isEmpty() || zArr2[i3];
                    boolean[] zArr3 = jt0Var.e;
                    boolean z3 = (starsStatus.flags & 1) == 0;
                    zArr3[i3] = z3;
                    jt0Var.c[i3] = z3 ? null : starsStatus.next_offset;
                    jn7.f(i4).k(jn7.F3, Long.valueOf(j3));
                    return;
                }
                return;
            case 3:
                wb2 wb2Var = (wb2) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i5 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                long j4 = this.b;
                rb0[] rb0VarArr = wb2Var.l7;
                if (user != null) {
                    rb0VarArr[i5].q(user);
                    wb2Var.k7[i5].U(user, wb2Var.l7[i5], null);
                    return;
                } else if (chat == null) {
                    rb0VarArr[i5].j(j4, "", "", null);
                    return;
                } else {
                    rb0VarArr[i5].p(chat);
                    wb2Var.k7[i5].U(chat, wb2Var.l7[i5], null);
                    return;
                }
            case 4:
                vra vraVar = (vra) this.d;
                int i6 = this.c;
                long j5 = this.b;
                e eVar = (e) this.e;
                v06 v06Var = (v06) this.f;
                vraVar.a(Boolean.TRUE);
                d31.Y().Q(R.raw.contact_check, 36, ob6.M0(2131749279, null)).j();
                z15.a(i6, j5, System.currentTimeMillis() + 180000, 0, new zo2(vraVar, eVar, i6, v06Var));
                return;
            case 5:
                byte b = 5;
                byte b2 = 4;
                ls6 ls6Var = (ls6) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i7 = this.c;
                pcc pccVar = (pcc) this.f;
                long j6 = this.b;
                if (tLObject2 instanceof TLRPC.TL_messages_allStickers) {
                    ls6Var.s1(i7, (TLRPC.TL_messages_allStickers) tLObject2, new jn0(pccVar, b2));
                    return;
                } else {
                    ls6Var.A1(i7, null, false, (int) (System.currentTimeMillis() / 1000), j6, new jn0(pccVar, b));
                    return;
                }
            case 6:
                kf7 kf7Var = (kf7) this.d;
                int i8 = this.c;
                long j7 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str = (String) this.f;
                try {
                    kf7Var.b.beginTransaction();
                    TLRPC.TL_message e0 = kf7Var.e0(i8, j7);
                    e0.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                    e0.voiceTranscriptionRated = message.voiceTranscriptionRated;
                    e0.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                    e0.voiceTranscriptionForce = message.voiceTranscriptionForce;
                    e0.voiceTranscriptionId = message.voiceTranscriptionId;
                    e0.voiceTranscription = str;
                    e0.voiceTranscriptionLocal = message.voiceTranscriptionLocal;
                    e0.voiceTranscriptionWords = message.voiceTranscriptionWords;
                    int i9 = 0;
                    while (i9 < 2) {
                        SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                        SQLitePreparedStatement executeFast = i9 == 0 ? sQLiteDatabase2.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase2.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                        try {
                            executeFast.requery();
                            NativeByteBuffer c = s37.c(e0);
                            if (c != null) {
                                executeFast.bindByteBuffer(1, c);
                            } else {
                                executeFast.bindNull(1);
                            }
                            executeFast.bindInteger(2, i8);
                            executeFast.bindLong(3, j7);
                            executeFast.step();
                            executeFast.dispose();
                            kf7Var.b.commitTransaction();
                            if (c != null) {
                                c.reuse();
                            }
                            i9++;
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            try {
                                kf7Var.p(e, true);
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
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
                                sQLiteDatabase = kf7Var.b;
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
                            sQLiteDatabase = kf7Var.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
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
                kf7 kf7Var2 = (kf7) this.d;
                long j8 = this.b;
                int i10 = this.c;
                TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong = (TLRPC.TL_updates_channelDifferenceTooLong) this.e;
                t77 t77Var = (t77) this.f;
                long j9 = -j8;
                try {
                    try {
                        i = 0;
                        queryFinalized = kf7Var2.b.queryFinalized("SELECT pinned FROM dialogs WHERE did = " + j9, new Object[0]);
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
                    kf7Var2.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("UPDATE media_counts_v2 SET old = 1 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM messages_holes WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM topics WHERE did = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM media_topics WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j9).stepThis().dispose();
                    kf7Var2.b.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j9).stepThis().dispose();
                    ls6 mediaDataController = kf7Var2.getMediaDataController();
                    mediaDataController.getClass();
                    hl.c3(new lq6(mediaDataController, j9, (byte) 0));
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
                        kf7Var2.f1(tL_messages_dialogs, 0);
                        try {
                            kf7Var2.T1(j9, j8, new ArrayList(), null);
                        } catch (Exception e4) {
                            e = e4;
                            z = true;
                            kf7Var2 = kf7Var2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                    try {
                        hl.c3(new cq6((Object) kf7Var2, j9, (Object) tL_updates_channelDifferenceTooLong, (byte) 18));
                        if (z2) {
                            if (i10 == 1) {
                                kf7Var2.getMessagesController().E(j8, true);
                            } else {
                                kf7Var2.getMessagesController().B0(j8, false);
                            }
                        }
                        if (i10 != 1) {
                            qyb qybVar = kf7Var2.getMessagesController().h4;
                            qybVar.getClass();
                            z = true;
                            hl.c3(new dp2((Object) qybVar, j8, z, (byte) 4));
                        }
                    } catch (Exception e6) {
                        e = e6;
                        z = true;
                        sQLiteCursor = null;
                        try {
                            kf7Var2.p(e, z);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            t77Var.run();
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
                    kf7Var2.p(e, z);
                    if (sQLiteCursor != null) {
                    }
                    t77Var.run();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                t77Var.run();
                return;
            case 8:
                a();
                return;
            case 9:
                wra wraVar = (wra) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                long j10 = this.b;
                String str2 = (String) this.f;
                int i11 = this.c;
                wraVar.run();
                it7.v(tL_starGiftUnique, j10 != 0 ? ob6.a0(null, null, 2131749618, str2, wf3.r(i11, j10)) : ob6.a0(null, null, 2131749619, str2));
                return;
            case 10:
                jra jraVar = (jra) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.e;
                String str3 = (String) this.f;
                int i12 = this.c;
                long j11 = this.b;
                jraVar.run();
                it7.v(tL_starGiftUnique2, ob6.a0(null, null, 2131749613, str3));
                String str4 = tL_starGiftUnique2.slug;
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                hl.d3(new tv1(i12, 0, j11, str4, true), it7.b[0]);
                return;
            case 11:
                r7a r7aVar = (r7a) this.d;
                r47 r47Var = (r47) this.e;
                TLRPC.Message message2 = (TLRPC.Message) this.f;
                long j12 = this.b;
                int i13 = this.c;
                int e1 = r47Var.e1();
                r47Var.k = message2;
                r47Var.M1 = true;
                jn7 notificationCenter = r7aVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(e1);
                Integer valueOf2 = Integer.valueOf(message2.id);
                Long valueOf3 = Long.valueOf(j12);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message2, valueOf3, 0L, 0, bool);
                r7aVar.getNotificationCenter().k(22, Integer.valueOf(e1), Integer.valueOf(message2.id), message2, Long.valueOf(j12), 0L, 0, bool);
                r7aVar.c0(i13);
                r7aVar.h0(i13, false);
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
                    w0d.a.execute(new pqa(zVar, j13, (byte) 9));
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

    public /* synthetic */ wy(wra wraVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, String str, int i) {
        this.a = (byte) 9;
        this.d = wraVar;
        this.e = tL_starGiftUnique;
        this.b = j;
        this.f = str;
        this.c = i;
    }

    public /* synthetic */ wy(Context context, int i, kv4 kv4Var, long j, ex4 ex4Var) {
        this.a = (byte) 0;
        this.d = context;
        this.c = i;
        this.e = kv4Var;
        this.b = j;
        this.f = ex4Var;
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
