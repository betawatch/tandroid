// default package

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class r77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r77(kf7 kf7Var, int i, long j, TLObject tLObject, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.d = i;
        this.c = j;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        boolean z;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j;
        ArrayList<TLRPC.ReactionCount> arrayList;
        ?? r2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        NativeByteBuffer byteBufferValue;
        r77 r77Var = this;
        kf7 kf7Var = (kf7) r77Var.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) r77Var.e;
        try {
            long e = kf7Var.getUserConfig().e();
            kf7Var.b.beginTransaction();
            long j2 = 0;
            int i = 0;
            TLRPC.TL_messageReactions tL_messageReactions2 = null;
            while (true) {
                sQLiteDatabase2 = kf7Var.b;
                j = r77Var.c;
                if (i >= 2) {
                    break;
                }
                int i2 = r77Var.d;
                if (i == 0) {
                    Locale locale = Locale.US;
                    r2 = 0;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + i2 + " AND uid = " + j, new Object[0]);
                } else {
                    Locale locale2 = Locale.US;
                    r2 = 0;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i2 + " AND uid = " + j, new Object[0]);
                }
                try {
                    if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r2)) == 0) {
                        sQLiteCursor3 = sQLiteCursor2;
                    } else {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r2), r2);
                        if (TLdeserialize != null) {
                            sQLiteCursor3 = sQLiteCursor2;
                            try {
                                TLdeserialize.readAttachPath(byteBufferValue, kf7Var.getUserConfig().n);
                                byteBufferValue.reuse();
                                if (tL_messageReactions2 == null) {
                                    TLRPC.TL_messageReactions tL_messageReactions3 = TLdeserialize.reactions;
                                    j2 = r47.Q1(e, TLdeserialize);
                                    tL_messageReactions2 = tL_messageReactions3;
                                }
                                r47.e6(TLdeserialize, tL_messageReactions);
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                                SQLitePreparedStatement executeFast = i == 0 ? sQLiteDatabase3.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase3.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                r47.p5(TLdeserialize);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindByteBuffer(1, nativeByteBuffer);
                                executeFast.bindInteger(2, i2);
                                executeFast.bindLong(3, j);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                executeFast.dispose();
                                if (e == j) {
                                    kf7Var.b.executeFast("DELETE FROM tag_message_id WHERE mid = " + TLdeserialize.id).stepThis().dispose();
                                    SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("REPLACE INTO tag_message_id VALUES(?, ?, ?, ?)");
                                    kf7Var.f(executeFast2, TLdeserialize);
                                    executeFast2.dispose();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteCursor = sQLiteCursor3;
                                z = true;
                                try {
                                    kf7Var.p(e, z);
                                    SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
                                    if (sQLiteDatabase4 != null) {
                                        sQLiteDatabase4.commitTransaction();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase = kf7Var.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursor3;
                                sQLiteDatabase = kf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } else {
                            sQLiteCursor3 = sQLiteCursor2;
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor3.dispose();
                    i++;
                    r77Var = this;
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor3 = sQLiteCursor2;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor3 = sQLiteCursor2;
                }
            }
            sQLiteDatabase2.commitTransaction();
            if (j == e && tL_messageReactions2 != null && (arrayList = tL_messageReactions2.results) != null && (!arrayList.isEmpty() || tL_messageReactions == null || !tL_messageReactions.results.isEmpty())) {
                hl.c3(new ba7((Object) kf7Var, (Object) tL_messageReactions2, (Object) tL_messageReactions, j2, (byte) 20));
            }
            SQLiteDatabase sQLiteDatabase5 = kf7Var.b;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.commitTransaction();
            }
        } catch (Exception e4) {
            e = e4;
            z = true;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    private final void b() {
        TLRPC.Chat Q;
        TLRPC.User j0;
        r7a r7aVar = (r7a) this.b;
        byte[] bArr = (byte[]) this.e;
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        sb.append(j);
        sb.append("_");
        int i = this.d;
        sb.append(i);
        sb.append("_");
        sb.append(Utilities.f(bArr));
        sb.append("_0");
        String sb2 = sb.toString();
        r7aVar.r.put(sb2, Boolean.TRUE);
        HashMap hashMap = r7aVar.s;
        List list = (List) hashMap.get(j + "_" + i);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(j + "_" + i, list);
        }
        list.add(sb2);
        if (!wf3.D(j)) {
            long j2 = -j;
            if (r7aVar.getMessagesController().M0(Long.valueOf(j2)) == null && (Q = r7aVar.getMessagesStorage().Q(j2)) != null) {
                r7aVar.getMessagesController().a4(Q, true);
            }
        } else if (r7aVar.getMessagesController().X1(Long.valueOf(j)) == null && (j0 = r7aVar.getMessagesStorage().j0(j)) != null) {
            r7aVar.getMessagesController().i4(j0, true, false);
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = r7aVar.getMessagesController().j1(j);
        tL_messages_getBotCallbackAnswer.msg_id = i;
        tL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = bArr;
        }
        r7aVar.getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new qn8((Object) r7aVar, (Object) sb2, (Object) list, (byte) 10), 2);
        r7aVar.getMessagesController().r3(j, i, i, 0, false, 0L, 0, true, 0);
    }

    private final void c() {
        dkb dkbVar = (dkb) this.b;
        kf7 kf7Var = (kf7) this.e;
        long j = this.c;
        int i = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j + " AND +mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, yac.h(i).n);
                    byteBufferValue.reuse();
                    if (r47.K3(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j;
                        r47 r47Var = new r47(i, TLdeserialize, false, true);
                        arrayList.add(r47Var);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j + "_" + arrayList.size(), r47Var.y1(true), r47Var.w1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        hl.c3(new wy((Object) dkbVar, i, j, (Object) arrayList, (Object) arrayList2, (byte) 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v94, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long[] jArr;
        final long j;
        final long j2;
        long j3;
        rp0 rp0Var;
        int i2;
        long[] jArr2;
        long j4;
        long j5;
        long j6;
        rp0 rp0Var2;
        int i3;
        wp0 wp0Var;
        SQLiteCursor queryFinalized;
        TLRPC.Chat chat;
        NativeByteBuffer byteBufferValue;
        boolean isEmpty;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement sQLitePreparedStatement = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte b = 2;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        long j7 = this.c;
        int i4 = this.d;
        int i5 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (sQLitePreparedStatement) {
            case 0:
                TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) obj;
                final wp0 b2 = wp0.b(((uc7) obj2).currentAccount);
                zm9 zm9Var = b2.a;
                long j8 = tL_sendMessageTextDraftAction.random_id;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_sendMessageTextDraftAction.text;
                boolean z = tL_sendMessageTextDraftAction.can_stop;
                boolean z2 = tL_sendMessageTextDraftAction.keep_on_stop;
                StringBuilder sb = new StringBuilder("[BotForum] onDraftNewDraft ");
                long j9 = this.c;
                sb.append(j9);
                sb.append(" ");
                int i6 = this.d;
                sb.append(i6);
                sb.append(" ");
                sb.append(j8);
                cc4.b(sb.toString());
                long j10 = i6;
                LongSparseArray H0 = b2.b.H0(j9, j10);
                if ((H0 == null ? null : H0.get(j8)) != null) {
                    cc4.b("[BotForum] onDraftNewDraft ignore " + j9 + " " + i6 + " " + j8);
                    return;
                }
                LongSparseArray H02 = zm9Var.H0(j9, j10);
                if (H02 == null || H02.size() <= 0) {
                    i = i6;
                    jArr = null;
                } else {
                    long[] jArr3 = new long[H02.size()];
                    int size = H02.size();
                    i = i6;
                    for (int i7 = 0; i7 < size; i7++) {
                        jArr3[i7] = H02.keyAt(i7);
                    }
                    jArr = jArr3;
                }
                LongSparseArray H03 = zm9Var.H0(j9, j10);
                rp0 rp0Var3 = (rp0) (H03 == null ? null : H03.get(j8));
                if (rp0Var3 == null) {
                    rp0 rp0Var4 = new rp0(j8, b2.getUserConfig().i());
                    j = j8;
                    zm9Var.N0(j9, j10, j, rp0Var4);
                    j3 = j10;
                    j2 = j9;
                    rp0Var = rp0Var4;
                } else {
                    j = j8;
                    j2 = j9;
                    j3 = j10;
                    rp0Var = rp0Var3;
                }
                rp0Var.d = z2;
                rp0Var.c = z;
                if (jArr != null) {
                    int length = jArr.length;
                    int i8 = 0;
                    while (i8 < length) {
                        long j11 = jArr[i8];
                        if (j11 == j) {
                            i2 = i;
                        } else {
                            Runnable runnable = ((rp0) H02.get(j11)).f;
                            if (runnable != null) {
                                hl.r(runnable);
                            }
                            int i9 = i;
                            long j12 = j2;
                            b2.e(j12, i9, j11);
                            j2 = j12;
                            i2 = i9;
                        }
                        i8++;
                        i = i2;
                    }
                }
                final int i10 = i;
                Runnable runnable2 = rp0Var.f;
                if (runnable2 != null) {
                    hl.r(runnable2);
                }
                final byte b3 = 1;
                long j13 = j2;
                rp0Var.f = new Runnable() { // from class: op0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b3) {
                            case 0:
                                b2.e(j2, i10, j);
                                break;
                            default:
                                b2.e(j2, i10, j);
                                break;
                        }
                    }
                };
                rp0Var.g = tL_textWithEntities;
                int i11 = rp0Var.b;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.dialog_id = j13;
                tL_message.peer_id = b2.getMessagesController().y1(j13);
                tL_message.from_id = b2.getMessagesController().y1(j13);
                tL_message.local_id = i11;
                tL_message.id = i11;
                tL_message.random_id = j;
                tL_message.message = tL_textWithEntities.text;
                tL_message.entities = tL_textWithEntities.entities;
                tL_message.flags |= 128;
                tL_message.date = b2.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                tL_message.flags |= 16;
                tL_messageReplyHeader.forum_topic = true;
                tL_messageReplyHeader.reply_to_top_id = i10;
                tL_messageReplyHeader.flags |= 2;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.flags |= 512;
                r47 r47Var = new r47(b2.currentAccount, tL_message, false, true);
                r47Var.Y1 = true;
                r47Var.S1 = false;
                rp0Var.h = r47Var;
                hl.d3(rp0Var.f, b2.getAppGlobalConfig().B.g(timeUnit));
                b2.getNotificationCenter().k(jn7.N5, new tp0(j13, j3, rp0Var.h));
                return;
            case 1:
                TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction = (TLRPC.TL_sendMessageRichMessageDraftAction) obj;
                wp0 b4 = wp0.b(((uc7) obj2).currentAccount);
                zm9 zm9Var2 = b4.a;
                long j14 = tL_sendMessageRichMessageDraftAction.random_id;
                TL_iv.RichMessage richMessage = tL_sendMessageRichMessageDraftAction.rich_message;
                boolean z3 = tL_sendMessageRichMessageDraftAction.can_stop;
                boolean z4 = tL_sendMessageRichMessageDraftAction.keep_on_stop;
                StringBuilder sb2 = new StringBuilder("[BotForum] onDraftNewDraft (rich_message) ");
                long j15 = this.c;
                sb2.append(j15);
                sb2.append(" ");
                int i12 = this.d;
                sb2.append(i12);
                sb2.append(" ");
                sb2.append(j14);
                cc4.b(sb2.toString());
                long j16 = i12;
                LongSparseArray H04 = b4.b.H0(j15, j16);
                if ((H04 == null ? null : H04.get(j14)) != null) {
                    cc4.b("[BotForum] onDraftNewDraft (rich_message) ignore " + j15 + " " + i12 + " " + j14);
                    return;
                }
                LongSparseArray H05 = zm9Var2.H0(j15, j16);
                if (H05 == null || H05.size() <= 0) {
                    jArr2 = null;
                } else {
                    jArr2 = new long[H05.size()];
                    int size2 = H05.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        jArr2[i13] = H05.keyAt(i13);
                    }
                }
                LongSparseArray H06 = zm9Var2.H0(j15, j16);
                rp0 rp0Var5 = (rp0) (H06 == null ? null : H06.get(j14));
                if (rp0Var5 == null) {
                    rp0 rp0Var6 = new rp0(j14, b4.getUserConfig().i());
                    j4 = j15;
                    zm9Var2.N0(j4, j16, j14, rp0Var6);
                    j6 = j16;
                    j5 = j14;
                    rp0Var2 = rp0Var6;
                } else {
                    j4 = j15;
                    j5 = j14;
                    j6 = j16;
                    rp0Var2 = rp0Var5;
                }
                rp0Var2.d = z4;
                rp0Var2.c = z3;
                if (jArr2 != null) {
                    int length2 = jArr2.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        long j17 = jArr2[i14];
                        if (j17 == j5) {
                            i3 = i12;
                            wp0Var = b4;
                        } else {
                            Runnable runnable3 = ((rp0) H05.get(j17)).f;
                            if (runnable3 != null) {
                                hl.r(runnable3);
                            }
                            i3 = i12;
                            wp0Var = b4;
                            wp0Var.e(j4, i3, j17);
                        }
                        i14++;
                        b4 = wp0Var;
                        i12 = i3;
                    }
                }
                final int i15 = i12;
                final wp0 wp0Var2 = b4;
                Runnable runnable4 = rp0Var2.f;
                if (runnable4 != null) {
                    hl.r(runnable4);
                }
                final long j18 = j4;
                final byte b5 = 0;
                final long j19 = j5;
                rp0Var2.f = new Runnable() { // from class: op0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b5) {
                            case 0:
                                wp0Var2.e(j18, i15, j19);
                                break;
                            default:
                                wp0Var2.e(j18, i15, j19);
                                break;
                        }
                    }
                };
                int i16 = rp0Var2.b;
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.dialog_id = j18;
                tL_message2.peer_id = wp0Var2.getMessagesController().y1(j18);
                tL_message2.from_id = wp0Var2.getMessagesController().y1(j18);
                tL_message2.local_id = i16;
                tL_message2.id = i16;
                tL_message2.random_id = j5;
                tL_message2.message = "";
                tL_message2.flags |= TLObject.FLAG_13;
                tL_message2.rich_message = richMessage;
                tL_message2.date = wp0Var2.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message2.reply_to = tL_messageReplyHeader2;
                tL_message2.flags |= 16;
                tL_messageReplyHeader2.forum_topic = true;
                tL_messageReplyHeader2.reply_to_top_id = i15;
                tL_messageReplyHeader2.flags |= 2;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.flags |= 512;
                r47 r47Var2 = new r47(wp0Var2.currentAccount, tL_message2, false, true);
                r47Var2.Y1 = true;
                r47Var2.S1 = false;
                rp0Var2.h = r47Var2;
                hl.d3(rp0Var2.f, wp0Var2.getAppGlobalConfig().B.g(timeUnit));
                wp0Var2.getNotificationCenter().k(jn7.N5, new tp0(j18, j6, rp0Var2.h));
                return;
            case 2:
                o oVar = (o) obj2;
                TLObject tLObject = (TLObject) obj;
                if (oVar.I0 != 0) {
                    oVar.I0 = 0;
                    oVar.Z(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        uc7.s1(i4).j4(tL_contacts_resolvedPeer.users, false);
                        kf7.a0(i4).n1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (tL_contacts_resolvedPeer.users.isEmpty()) {
                            return;
                        }
                        oVar.N(j7, tL_contacts_resolvedPeer.users.get(0));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                d01 d01Var = (d01) obj2;
                byte[] bArr = (byte[]) obj;
                if (d01Var.u) {
                    return;
                }
                d01Var.f.put(Long.valueOf(j7), new a01(i4, bArr));
                if (j7 == d01Var.m) {
                    d01Var.m = -1L;
                }
                if (d01Var.t || d01Var.u) {
                    return;
                }
                d01Var.t = true;
                d01Var.c.postDelayed(new b01(d01Var, b), 16L);
                return;
            case 4:
                ((p) obj2).a(Float.valueOf(((int[]) obj)[0] / i4), Boolean.valueOf(System.currentTimeMillis() - j7 > 250));
                return;
            case 5:
                ryc rycVar = (ryc) obj;
                t35 t35Var = ((s35) obj2).c;
                if (!t35Var.c(rycVar, i4)) {
                    t35Var.d("closing stale connected websocket; attempt=" + i4);
                    rycVar.c();
                    return;
                }
                t35Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j7) + " ms");
                q35 q35Var = t35Var.o;
                try {
                    JSONArray put = new JSONArray().put(t35Var.b);
                    StringBuilder sb3 = new StringBuilder("wallet-");
                    int i17 = t35Var.g + 1;
                    t35Var.g = i17;
                    sb3.append(i17);
                    t35Var.f = sb3.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", t35Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    hl.r(q35Var);
                    hl.d3(q35Var, 30000L);
                    t35Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    t35Var.f("could not encode subscription");
                    return;
                }
            case 6:
                a55 a55Var = (a55) obj2;
                a55Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j20 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j20);
                a55Var.f.sendRequestTyped(tonconnectgetpending, new ic(r13 ? (byte) 1 : (byte) 0), new p45(a55Var, (g45) obj, j20, this.d, (byte) 0));
                return;
            case 7:
                ls6 ls6Var = (ls6) obj2;
                TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) obj;
                try {
                    if (tL_attachMenuBots != null) {
                        ls6Var.getMessagesStorage().b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                        SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                        tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindLong(2, j7);
                        executeFast.bindInteger(3, i4);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = ls6Var.getMessagesStorage().b.executeFast("UPDATE attach_menu_bots SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i4);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 8:
                ls6 ls6Var2 = (ls6) obj2;
                if (((ArrayList) obj) != null && j7 != 0) {
                    ls6Var2.Y[i4] = j7;
                }
                ls6Var2.b1(i4, false, false);
                return;
            case 9:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                uc7Var.B4 = uc7Var.getConnectionsManager().getCurrentTime();
                TLRPC.Dialog dialog = uc7Var.q2;
                long j21 = this.c;
                if (dialog != null && j21 != dialog.id) {
                    uc7Var.u4();
                }
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7Var.R.f(j21);
                uc7Var.q2 = dialog2;
                if (dialog2 != null) {
                    uc7Var.n2 = false;
                    uc7Var.h5(null);
                    uc7Var.getNotificationCenter().k(3, Boolean.TRUE);
                    return;
                }
                zh6 zh6Var = new zh6();
                zh6 zh6Var2 = new zh6();
                for (int i18 = 0; i18 < tL_help_promoData.users.size(); i18++) {
                    TLRPC.User user = tL_help_promoData.users.get(i18);
                    zh6Var.k(user.id, user);
                }
                for (int i19 = 0; i19 < tL_help_promoData.chats.size(); i19++) {
                    TLRPC.Chat chat2 = tL_help_promoData.chats.get(i19);
                    zh6Var2.k(chat2.id, chat2);
                }
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.Peer peer = tL_help_promoData.peer;
                if (peer == null) {
                    TLRPC.Dialog dialog3 = uc7Var.q2;
                    if (dialog3 != null) {
                        long j22 = dialog3.id;
                        if (j22 < 0) {
                            TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(-j22));
                            if (xc2.r0(M0) || M0.restricted) {
                                uc7Var.q4(uc7Var.q2);
                            }
                        } else {
                            uc7Var.q4(dialog3);
                        }
                        uc7Var.q2 = null;
                        uc7Var.h5(null);
                        uc7Var.getNotificationCenter().k(3, new Object[0]);
                        return;
                    }
                    return;
                }
                if (peer.user_id != 0) {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_inputDialogPeer.peer = tL_inputPeerUser;
                    long j23 = tL_help_promoData.peer.user_id;
                    tL_inputPeerUser.user_id = j23;
                    TLRPC.User user2 = (TLRPC.User) zh6Var.f(j23);
                    if (user2 != null) {
                        tL_inputDialogPeer.peer.access_hash = user2.access_hash;
                    }
                } else if (peer.chat_id != 0) {
                    TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputDialogPeer.peer = tL_inputPeerChat;
                    long j24 = tL_help_promoData.peer.chat_id;
                    tL_inputPeerChat.chat_id = j24;
                    TLRPC.Chat chat3 = (TLRPC.Chat) zh6Var2.f(j24);
                    if (chat3 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat3.access_hash;
                    }
                } else {
                    TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputDialogPeer.peer = tL_inputPeerChannel;
                    long j25 = tL_help_promoData.peer.channel_id;
                    tL_inputPeerChannel.channel_id = j25;
                    TLRPC.Chat chat4 = (TLRPC.Chat) zh6Var2.f(j25);
                    if (chat4 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat4.access_hash;
                    }
                }
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                uc7Var.o2 = uc7Var.getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new gg((Object) uc7Var, this.d, (Object) tL_help_promoData, j21, (byte) 5));
                return;
            case 10:
                ((kf7) obj2).getMessagesController().h4.D(j7, (TLRPC.TL_forumTopic) obj, i4);
                return;
            case 11:
                kf7 kf7Var = (kf7) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                try {
                    try {
                        kf7Var.b.beginTransaction();
                        TLRPC.TL_message e0 = kf7Var.e0(i4, j7);
                        e0.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e0.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e0.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e0.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e0.voiceTranscriptionId = message.voiceTranscriptionId;
                        while (true) {
                            SQLiteDatabase sQLiteDatabase2 = kf7Var.b;
                            if (i5 >= 2) {
                                sQLiteDatabase2.commitTransaction();
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast3 = i5 == 0 ? sQLiteDatabase2.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase2.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast3.requery();
                                NativeByteBuffer c = s37.c(e0);
                                if (c != null) {
                                    executeFast3.bindByteBuffer(1, c);
                                } else {
                                    executeFast3.bindNull(1);
                                }
                                executeFast3.bindInteger(2, i4);
                                executeFast3.bindLong(3, j7);
                                executeFast3.step();
                                executeFast3.dispose();
                                if (c != null) {
                                    c.reuse();
                                }
                                i5++;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement2 = executeFast3;
                                kf7Var.p(e, true);
                                SQLiteDatabase sQLiteDatabase4 = kf7Var.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLitePreparedStatement4 = executeFast3;
                                SQLiteDatabase sQLiteDatabase5 = kf7Var.b;
                                if (sQLiteDatabase5 != null) {
                                    sQLiteDatabase5.commitTransaction();
                                }
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            case 12:
                kf7 kf7Var2 = (kf7) obj2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase6 = kf7Var2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase6.queryFinalized("SELECT data FROM chats WHERE uid = " + j7, new Object[0]);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                            chat = null;
                        } else {
                            chat = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        queryFinalized.dispose();
                    } catch (Exception e4) {
                        e = e4;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = 0;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        if (sQLitePreparedStatement != 0) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = 0;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = 0;
                }
                if (chat != null) {
                    if (chat.default_banned_rights == null || i4 >= chat.version) {
                        chat.default_banned_rights = tL_chatBannedRights;
                        chat.flags |= 262144;
                        chat.version = i4;
                        sQLitePreparedStatement = kf7Var2.b.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
                        try {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(chat.getObjectSize());
                            chat.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement.bindLong(2, chat.id);
                            sQLitePreparedStatement.step();
                            nativeByteBuffer2.reuse();
                            sQLitePreparedStatement.dispose();
                        } catch (Exception e6) {
                            e = e6;
                            kf7Var2.p(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != 0) {
                                sQLitePreparedStatement.dispose();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                kf7 kf7Var3 = (kf7) obj2;
                String str = (String) obj;
                try {
                    try {
                        isEmpty = str.isEmpty();
                        sQLiteDatabase = kf7Var3.b;
                    } catch (Throwable th6) {
                        if (0 != 0) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th6;
                    }
                } catch (Exception e7) {
                    kf7Var3.p(e7, true);
                    if (0 == 0) {
                        return;
                    }
                }
                if (isEmpty) {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM widget_state WHERE uid = " + j7 + " AND mid = " + i4).stepThis().dispose();
                    return;
                }
                sQLitePreparedStatement3 = sQLiteDatabase.executeFast("REPLACE INTO widget_state VALUES(?, ?, ?)");
                sQLitePreparedStatement3.bindLong(1, j7);
                sQLitePreparedStatement3.bindInteger(2, i4);
                sQLitePreparedStatement3.bindString(3, str);
                sQLitePreparedStatement3.step();
                sQLitePreparedStatement3.dispose();
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                vs7.b.add(Long.valueOf(j7));
                vs7.j(j7, 60000L);
                vs7.d.put(vs7.a(i4, j7), Long.valueOf(SystemClock.elapsedRealtime() + 600000));
                vs7.c();
                v21 Q = vs7.h().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749531, (String) obj));
                Q.u = true;
                Q.j();
                return;
            case 16:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj2).getMessagesController().O1().a(i4, j7, (ArrayList) obj);
                return;
            case 17:
                b();
                return;
            case 18:
                ((c51) obj2).setLoading(false);
                nx0 nx0Var = ((nx0[]) obj)[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                }
                jxa.v(i4, false).P();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(zu1.ha(j7));
                    return;
                }
                return;
            case 19:
                c();
                return;
            case 20:
                a5c a5cVar = (a5c) obj2;
                r47 r47Var3 = (r47) obj;
                r47Var3.k.originalLanguage = "und";
                a5cVar.getMessagesStorage().Z1(j7, r47Var3.k);
                a5cVar.w.remove(Integer.valueOf(i4));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (vnb) obj, (Context) obj2);
                String M02 = ob6.M0(2131742723, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                idVar.U = hl.R2(ob6.V(null, null, 2131742721, c.C(i4).q(j7, true)));
                c00.u(null, 2131742713, alertDialog$Builder, null);
                return;
        }
    }

    public /* synthetic */ r77(Object obj, long j, int i, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = i;
        this.e = obj2;
    }

    public /* synthetic */ r77(Object obj, long j, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.e = obj2;
        this.d = i;
    }

    public /* synthetic */ r77(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.d = i;
        this.c = j;
    }

    public /* synthetic */ r77(Object obj, Object obj2, long j, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = i;
    }
}
