// default package

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class t87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        kf7 kf7Var = (kf7) this.b;
        hp7 hp7Var = (hp7) this.c;
        long j = hp7Var.a;
        try {
            kf7Var.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = kf7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : hp7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = hp7Var.b;
                if (str == null) {
                    str = "";
                    hp7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, hp7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void b() {
        ak akVar = (ak) this.b;
        Context context = (Context) this.c;
        yv2 yv2Var = (yv2) akVar.b;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i != 5) {
            yv2Var.i(i);
        } else {
            zz.g(context, yv2Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:125|126|(3:128|129|(4:131|132|133|134)(1:136))(1:137)|135)|122|123) */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03a8, code lost:
    
        r15 = r6;
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0483, code lost:
    
        if (r5 == null) goto L234;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ed  */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [kf7] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        boolean z;
        byte b;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        int i;
        ?? r15;
        SQLiteDatabase sQLiteDatabase2;
        byte b2;
        byte b3;
        String str;
        ArrayList arrayList;
        int i2;
        byte b4;
        byte b5;
        NativeByteBuffer c;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        int i3 = 2;
        SQLiteCursor sQLiteCursor3 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r5 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor4 = null;
        ?? r5 = 0;
        byte b6 = 1;
        int i4 = 0;
        int i5 = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.b;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.c;
                uc7Var.j4(updates_channeldifference.users, false);
                uc7Var.c4(updates_channeldifference.chats, false);
                return;
            case 1:
                uc7 uc7Var2 = (uc7) this.b;
                TL_update.TL_updateChannel tL_updateChannel = (TL_update.TL_updateChannel) this.c;
                uc7Var2.getClass();
                uc7Var2.J0(tL_updateChannel.channel_id, 1, 0L, null);
                return;
            case 2:
                uc7 uc7Var3 = (uc7) this.b;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.c;
                uc7Var3.q(tL_help_promoData.pending_suggestions, tL_help_promoData.dismissed_suggestions, tL_help_promoData.custom_pending_suggestion);
                return;
            case 3:
                uc7 uc7Var4 = (uc7) this.b;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.c;
                uc7Var4.j4(tL_channels_sendAsPeers.users, false);
                uc7Var4.c4(tL_channels_sendAsPeers.chats, false);
                return;
            case 4:
                uc7 uc7Var5 = (uc7) this.b;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) this.c;
                uc7Var5.getClass();
                uc7Var5.j4(messages_sponsoredmessages.users, false);
                uc7Var5.c4(messages_sponsoredmessages.chats, false);
                return;
            case 5:
                uc7 uc7Var6 = (uc7) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                uc7Var6.j4(updates.users, false);
                uc7Var6.c4(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = updates.chats;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    uc7Var6.getNotificationCenter().k(30, new Object[0]);
                    return;
                } else {
                    uc7Var6.getNotificationCenter().k(29, Long.valueOf(updates.chats.get(0).id));
                    return;
                }
            case 6:
                pcc pccVar = (pcc) this.b;
                Runnable runnable = (Runnable) this.c;
                if (pccVar != null) {
                    pccVar.a(null);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                uc7 uc7Var7 = (uc7) this.b;
                ((ji7) this.c).a(uc7Var7.N4);
                uc7Var7.M4 = false;
                return;
            case 8:
                m82 m82Var = (m82) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (m82Var != null) {
                    m82Var.a(tL_error);
                    return;
                }
                return;
            case 9:
                ((oo2) this.b).a(0, (TLRPC.TL_error) this.c);
                return;
            case 10:
                pt2 pt2Var = (pt2) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (pt2Var != null) {
                    pt2Var.accept(user);
                    return;
                }
                return;
            case 11:
                uc7 uc7Var8 = (uc7) this.b;
                r47 r47Var = (r47) this.c;
                long B0 = r47.B0(r47Var.k);
                int e1 = r47Var.e1();
                zh6 zh6Var = uc7Var8.A0;
                ArrayList arrayList3 = (ArrayList) zh6Var.f(B0);
                if (arrayList3 == null) {
                    arrayList3 = qd4.s(zh6Var, B0);
                }
                if (arrayList3.contains(Integer.valueOf(e1))) {
                    return;
                }
                arrayList3.add(Integer.valueOf(e1));
                return;
            case 12:
                oc7 oc7Var = (oc7) this.b;
                TLObject tLObject = (TLObject) this.c;
                oc7Var.c = false;
                oc7Var.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    oc7Var.b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                jn7.f(oc7Var.a).k(jn7.X3, new Object[0]);
                return;
            case 13:
                kf7 kf7Var = (kf7) this.b;
                te2 te2Var = (te2) this.c;
                try {
                    try {
                        try {
                            try {
                                ArrayList arrayList4 = new ArrayList();
                                ?? r52 = 0;
                                ?? queryFinalized2 = kf7Var.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                                while (queryFinalized2.next()) {
                                    try {
                                        ?? byteBufferValue2 = queryFinalized2.byteBufferValue(r52);
                                        if (byteBufferValue2 != 0) {
                                            TLRPC.ChatTheme TLdeserialize = TLRPC.ChatTheme.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r52), r52);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize instanceof TLRPC.TL_chatThemeUniqueGift) {
                                                arrayList4.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize);
                                            }
                                        }
                                        r52 = 0;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        sQLiteCursor = queryFinalized2;
                                        z = true;
                                        kf7Var.p(e, z);
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLiteCursor = queryFinalized2;
                                        cc4.g(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        sQLiteCursor3 = null;
                                        hl.c3(new ge7(te2Var, false ? 1 : 0));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteCursor3 = queryFinalized2;
                                        if (sQLiteCursor3 != null) {
                                            sQLiteCursor3.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                queryFinalized2.dispose();
                                hl.c3(new t87(te2Var, arrayList4, (byte) 17));
                                return;
                            } catch (SQLiteException e3) {
                                e = e3;
                                sQLiteCursor = null;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            z = true;
                            sQLiteCursor = null;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        sQLiteCursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 14:
                kf7 kf7Var2 = (kf7) this.b;
                SQLiteDatabase sQLiteDatabase3 = (SQLiteDatabase) this.c;
                while (true) {
                    try {
                        Thread.sleep(50L);
                        boolean j = kf7Var2.j();
                        synchronized (kf7Var2.V) {
                            if (kf7Var2.W != sQLiteDatabase3) {
                                return;
                            }
                            if (!j) {
                                try {
                                    sQLiteDatabase3.interrupt();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
            case 15:
                ?? r1 = (kf7) this.b;
                sa saVar = (sa) this.c;
                try {
                    try {
                        r1.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i6 = 0;
                        i = 0;
                        while (i6 < i3) {
                            try {
                                str = strArr[i6];
                                arrayList = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                SQLiteCursor queryFinalized3 = r1.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i5]);
                                while (queryFinalized3.next()) {
                                    try {
                                        try {
                                            NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(i3);
                                            if (byteBufferValue3 != null) {
                                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                s37.b(tL_message, byteBufferValue3);
                                                byteBufferValue3.reuse();
                                                if (tL_message.voiceTranscriptionLocal) {
                                                    tL_message.voiceTranscription = r5;
                                                    tL_message.voiceTranscriptionWords = r5;
                                                    tL_message.voiceTranscriptionLocal = i5;
                                                    tL_message.voiceTranscriptionOpen = i5;
                                                    tL_message.voiceTranscriptionFinal = i5;
                                                    tL_message.voiceTranscriptionId = 0L;
                                                    long intValue = queryFinalized3.intValue(i5 == true ? 1 : 0);
                                                    long longValue = queryFinalized3.longValue(b6);
                                                    boolean z2 = i5 == true ? 1 : 0;
                                                    long[] jArr = new long[2];
                                                    jArr[z2 ? 1 : 0] = intValue;
                                                    jArr[b6] = longValue;
                                                    arrayList.add(jArr);
                                                    arrayList5.add(tL_message);
                                                    i5 = z2 ? 1 : 0;
                                                    i3 = 2;
                                                    r5 = 0;
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor2 = queryFinalized3;
                                            byte b7 = b6;
                                            i4 = i;
                                            b2 = b7;
                                            sQLitePreparedStatement = null;
                                            r15 = b2;
                                            try {
                                                r1.p(e, r15);
                                                sQLiteDatabase2 = r1.b;
                                                if (sQLiteDatabase2 != null) {
                                                    sQLiteDatabase2.commitTransaction();
                                                }
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                i = i4;
                                                hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                                return;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLiteDatabase = r1.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLiteCursor2 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteCursor2 = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = r1.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                i2 = i5 == true ? 1 : 0;
                                queryFinalized3.dispose();
                                SQLitePreparedStatement executeFast = r1.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                int i7 = i2;
                                while (i7 < arrayList.size()) {
                                    try {
                                        try {
                                            executeFast.requery();
                                            c = s37.c((TLRPC.Message) arrayList5.get(i7));
                                            if (c != null) {
                                                try {
                                                    executeFast.bindByteBuffer(b6, c);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    sQLitePreparedStatement = executeFast;
                                                    b5 = b6;
                                                    i4 = i;
                                                    sQLiteCursor2 = null;
                                                    r15 = b5;
                                                    r1.p(e, r15);
                                                    sQLiteDatabase2 = r1.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLiteCursor2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    i = i4;
                                                    hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                                    return;
                                                }
                                            } else {
                                                executeFast.bindNull(b6);
                                            }
                                            b4 = b6;
                                        } catch (Exception e8) {
                                            e = e8;
                                            b4 = b6;
                                        }
                                        try {
                                            executeFast.bindInteger(2, (int) ((long[]) arrayList.get(i7))[i2]);
                                            int i8 = i7;
                                            executeFast.bindLong(3, ((long[]) arrayList.get(i7))[b4 == true ? 1 : 0]);
                                            executeFast.step();
                                            if (c != null) {
                                                c.reuse();
                                            }
                                            i7 = i8 + 1;
                                            b6 = b4 == true ? 1 : 0;
                                        } catch (Exception e9) {
                                            e = e9;
                                            sQLitePreparedStatement = executeFast;
                                            b5 = b4;
                                            i4 = i;
                                            sQLiteCursor2 = null;
                                            r15 = b5;
                                            r1.p(e, r15);
                                            sQLiteDatabase2 = r1.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            i = i4;
                                            hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor2 = null;
                                        sQLiteDatabase = r1.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                b3 = b6;
                                executeFast.dispose();
                            } catch (Exception e10) {
                                e = e10;
                                b3 = b6;
                            }
                            try {
                                if (str.equals("messages_v2")) {
                                    i = arrayList.size();
                                }
                                i6++;
                                b6 = b3 == true ? 1 : 0;
                                i5 = i2;
                                i3 = 2;
                                r5 = 0;
                            } catch (Exception e11) {
                                e = e11;
                                i4 = i;
                                b = b3;
                                sQLiteCursor2 = null;
                                b2 = b;
                                sQLitePreparedStatement = null;
                                r15 = b2;
                                r1.p(e, r15);
                                sQLiteDatabase2 = r1.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                i = i4;
                                hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase4 = r1.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor2 = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    b = 1;
                }
                hl.c3(new hl3((Object) saVar, i, (byte) 29));
                return;
            case 16:
                kf7 kf7Var3 = (kf7) this.b;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) this.c;
                try {
                    try {
                        queryFinalized = kf7Var3.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        tL_chatFull = 0;
                    } else {
                        TLRPC.ChatFull TLdeserialize2 = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLdeserialize2.pinned_msg_id = queryFinalized.intValue(1);
                        TLdeserialize2.online_count = queryFinalized.intValue(2);
                        TLdeserialize2.inviterId = queryFinalized.longValue(3);
                        tL_chatFull = TLdeserialize2;
                    }
                    queryFinalized.dispose();
                    if (tL_chatFull instanceof TLRPC.TL_chatFull) {
                        tL_chatFull.participants = chatParticipants;
                        hl.c3(new ie7(kf7Var3, tL_chatFull, b6));
                        SQLitePreparedStatement executeFast2 = kf7Var3.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_chatFull.getObjectSize());
                        tL_chatFull.serializeToStream(nativeByteBuffer);
                        executeFast2.bindLong(1, tL_chatFull.id);
                        executeFast2.bindByteBuffer(2, nativeByteBuffer);
                        executeFast2.bindInteger(3, tL_chatFull.pinned_msg_id);
                        executeFast2.bindInteger(4, tL_chatFull.online_count);
                        executeFast2.bindLong(5, tL_chatFull.inviterId);
                        executeFast2.bindInteger(6, tL_chatFull.invitesCount);
                        executeFast2.bindInteger(7, tL_chatFull.participants_count);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor4 = queryFinalized;
                    kf7Var3.p(e, true);
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    return;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor4 = queryFinalized;
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th;
                }
                return;
            case 17:
                ((te2) this.b).a((ArrayList) this.c);
                return;
            case 18:
                ((kf7) this.b).getMessagesController().Y3((TLRPC.TL_updates) this.c, false);
                return;
            case 19:
                psb psbVar = (psb) this.b;
                ne7 ne7Var = (ne7) this.c;
                qsb.a(psbVar);
                ne7Var.run();
                return;
            case 20:
                ((kf7) this.b).D((ac7) this.c);
                return;
            case 21:
                kf7 kf7Var4 = (kf7) this.b;
                List<TLRPC.ChatTheme> list = (List) this.c;
                try {
                    try {
                        sQLitePreparedStatement3 = kf7Var4.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                        for (TLRPC.ChatTheme chatTheme : list) {
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                                tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement3.bindByteBuffer(2, nativeByteBuffer2);
                                nativeByteBuffer2.reuse();
                                sQLitePreparedStatement3.step();
                            }
                        }
                        sQLitePreparedStatement3.dispose();
                        return;
                    } catch (Throwable th10) {
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        throw th10;
                    }
                } catch (SQLiteException e15) {
                    kf7Var4.p(e15, true);
                    if (sQLitePreparedStatement3 == null) {
                        return;
                    }
                    sQLitePreparedStatement3.dispose();
                    return;
                } catch (Exception e16) {
                    cc4.g(e16, true);
                    if (sQLitePreparedStatement3 != null) {
                        sQLitePreparedStatement3.dispose();
                        return;
                    }
                    return;
                }
            case 22:
                ((wt1) this.b).a(((int[]) this.c)[0]);
                return;
            case 23:
                kf7 kf7Var5 = (kf7) this.b;
                String str2 = (String) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = kf7Var5.b.executeFast("DELETE FROM onchain_offer_intents WHERE slug = ?");
                        sQLitePreparedStatement2.bindString(1, str2);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th11) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th11;
                    }
                } catch (Exception e17) {
                    kf7Var5.p(e17, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 24:
                a();
                return;
            case 25:
                kf7 kf7Var6 = (kf7) this.b;
                HashMap hashMap = (HashMap) this.c;
                for (jf7 jf7Var : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(jf7Var);
                    num.getClass();
                    try {
                        SQLiteDatabase sQLiteDatabase5 = kf7Var6.b;
                        Locale locale = Locale.US;
                        long j2 = jf7Var.a;
                        long j3 = jf7Var.b;
                        sQLiteDatabase5.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j2 + " AND topic_id = " + j3 + "), " + num + ") WHERE did = " + j2 + " AND topic_id = " + j3).stepThis().dispose();
                    } catch (SQLiteException e18) {
                        kf7Var6.p(e18, true);
                    }
                }
                return;
            case 26:
                ((xa7) this.b).a(((int[]) this.c)[0]);
                return;
            case 27:
                yv2 yv2Var = (yv2) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new ak(yv2Var, (byte) 10), intentFilter);
                return;
            case 28:
                b();
                return;
            default:
                sl7 sl7Var = (sl7) this.b;
                String str3 = (String) this.c;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", ob6.a0(null, null, 2131748870, "https://telegram.org/dl"));
                sl7Var.getContext().startActivity(intent);
                return;
        }
    }
}
