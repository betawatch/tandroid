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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        jf7 jf7Var = (jf7) this.b;
        HashMap hashMap = (HashMap) this.c;
        for (if7 if7Var : hashMap.keySet()) {
            Integer num = (Integer) hashMap.get(if7Var);
            num.getClass();
            try {
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                long j = if7Var.a;
                long j2 = if7Var.b;
                sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j + " AND topic_id = " + j2 + "), " + num + ") WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
            } catch (SQLiteException e) {
                jf7Var.n(e, true);
            }
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

    private final void c() {
        rl7 rl7Var = (rl7) this.b;
        String str = (String) this.c;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:+" + str));
        intent.putExtra("sms_body", ob6.a0(null, null, 2131748870, "https://telegram.org/dl"));
        rl7Var.getContext().startActivity(intent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:134|135|(3:137|138|(4:140|141|142|143)(1:145))(1:146)|144)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0376, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0377, code lost:
    
        r15 = r9;
        r8 = r2;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0434, code lost:
    
        if (r8 == null) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bd  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v15, types: [jf7] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v56 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        SQLiteCursor sQLiteCursor;
        byte b;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        int i;
        ?? r15;
        SQLiteDatabase sQLiteDatabase2;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        NativeByteBuffer c;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        byte b6 = this.a;
        int i2 = 2;
        SQLiteCursor sQLiteCursor2 = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r8 = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r8 = null;
        SQLiteCursor sQLiteCursor3 = null;
        ?? r8 = 0;
        byte b7 = 1;
        int i3 = 0;
        int i4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b6) {
            case 0:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                uc7Var.j4(updates_channeldifference.users, false);
                uc7Var.c4(updates_channeldifference.chats, false);
                return;
            case 1:
                uc7 uc7Var2 = (uc7) obj2;
                uc7Var2.getClass();
                uc7Var2.J0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 2:
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                ((uc7) obj2).q(tL_help_promoData.pending_suggestions, tL_help_promoData.dismissed_suggestions, tL_help_promoData.custom_pending_suggestion);
                return;
            case 3:
                uc7 uc7Var3 = (uc7) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                uc7Var3.j4(tL_channels_sendAsPeers.users, false);
                uc7Var3.c4(tL_channels_sendAsPeers.chats, false);
                return;
            case 4:
                uc7 uc7Var4 = (uc7) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                uc7Var4.getClass();
                uc7Var4.j4(messages_sponsoredmessages.users, false);
                uc7Var4.c4(messages_sponsoredmessages.chats, false);
                return;
            case 5:
                uc7 uc7Var5 = (uc7) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                uc7Var5.j4(updates.users, false);
                uc7Var5.c4(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList = updates.chats;
                if (arrayList == null || arrayList.isEmpty()) {
                    uc7Var5.getNotificationCenter().k(30, new Object[0]);
                    return;
                } else {
                    uc7Var5.getNotificationCenter().k(29, Long.valueOf(updates.chats.get(0).id));
                    return;
                }
            case 6:
                pcc pccVar = (pcc) obj2;
                Runnable runnable = (Runnable) obj;
                if (pccVar != null) {
                    pccVar.a(null);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                uc7 uc7Var6 = (uc7) obj2;
                ((ii7) obj).a(uc7Var6.M4);
                uc7Var6.L4 = false;
                return;
            case 8:
                m82 m82Var = (m82) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (m82Var != null) {
                    m82Var.a(tL_error);
                    return;
                }
                return;
            case 9:
                ((oo2) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 10:
                pt2 pt2Var = (pt2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (pt2Var != null) {
                    pt2Var.accept(user);
                    return;
                }
                return;
            case 11:
                r47 r47Var = (r47) obj;
                long B0 = r47.B0(r47Var.k);
                int e1 = r47Var.e1();
                zh6 zh6Var = ((uc7) obj2).A0;
                ArrayList arrayList2 = (ArrayList) zh6Var.f(B0);
                if (arrayList2 == null) {
                    arrayList2 = qd4.s(zh6Var, B0);
                }
                if (arrayList2.contains(Integer.valueOf(e1))) {
                    return;
                }
                arrayList2.add(Integer.valueOf(e1));
                return;
            case 12:
                oc7 oc7Var = (oc7) obj2;
                TLObject tLObject = (TLObject) obj;
                oc7Var.c = false;
                oc7Var.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    oc7Var.b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                jn7.f(oc7Var.a).k(jn7.X3, new Object[0]);
                return;
            case 13:
                jf7 jf7Var = (jf7) obj2;
                te2 te2Var = (te2) obj;
                try {
                    try {
                        try {
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                ?? r3 = 0;
                                ?? queryFinalized2 = jf7Var.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                                while (queryFinalized2.next()) {
                                    try {
                                        ?? byteBufferValue2 = queryFinalized2.byteBufferValue(r3);
                                        if (byteBufferValue2 != 0) {
                                            TLRPC.ChatTheme TLdeserialize = TLRPC.ChatTheme.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r3), r3);
                                            byteBufferValue2.reuse();
                                            if (TLdeserialize instanceof TLRPC.TL_chatThemeUniqueGift) {
                                                arrayList3.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize);
                                            }
                                        }
                                        r3 = 0;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        sQLiteCursor2 = queryFinalized2;
                                        z = true;
                                        jf7Var.n(e, z);
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLiteCursor2 = queryFinalized2;
                                        cc4.g(e, true);
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        hl.c3(new fe7(te2Var, (byte) 0));
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteCursor2 = queryFinalized2;
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                queryFinalized2.dispose();
                                hl.c3(new t87(te2Var, arrayList3, (byte) 16));
                                return;
                            } catch (SQLiteException e3) {
                                e = e3;
                                sQLiteCursor2 = null;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            z = true;
                            sQLiteCursor2 = null;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        sQLiteCursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 14:
                ((xa7) obj2).a(((int[]) obj)[0]);
                return;
            case 15:
                ?? r12 = (jf7) obj2;
                sa saVar = (sa) obj;
                try {
                    try {
                        r12.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i5 = 0;
                        i = 0;
                        while (i5 < i2) {
                            try {
                                String str = strArr[i5];
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                SQLiteCursor queryFinalized3 = r12.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i4]);
                                while (queryFinalized3.next()) {
                                    try {
                                        try {
                                            NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(i2);
                                            if (byteBufferValue3 != null) {
                                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                s37.b(tL_message, byteBufferValue3);
                                                byteBufferValue3.reuse();
                                                if (tL_message.voiceTranscriptionLocal) {
                                                    tL_message.voiceTranscription = r8;
                                                    tL_message.voiceTranscriptionWords = r8;
                                                    tL_message.voiceTranscriptionLocal = i4;
                                                    tL_message.voiceTranscriptionOpen = i4;
                                                    tL_message.voiceTranscriptionFinal = i4;
                                                    tL_message.voiceTranscriptionId = 0L;
                                                    long intValue = queryFinalized3.intValue(i4 == true ? 1 : 0);
                                                    long longValue = queryFinalized3.longValue(b7);
                                                    boolean z2 = i4 == true ? 1 : 0;
                                                    long[] jArr = new long[2];
                                                    jArr[z2 ? 1 : 0] = intValue;
                                                    jArr[b7] = longValue;
                                                    arrayList4.add(jArr);
                                                    arrayList5.add(tL_message);
                                                    i4 = z2 ? 1 : 0;
                                                    i2 = 2;
                                                    r8 = 0;
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor = queryFinalized3;
                                            i3 = i;
                                            b2 = b7;
                                            sQLitePreparedStatement = null;
                                            r15 = b2;
                                            try {
                                                r12.n(e, r15);
                                                sQLiteDatabase2 = r12.b;
                                                if (sQLiteDatabase2 != null) {
                                                    sQLiteDatabase2.commitTransaction();
                                                }
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                    sQLitePreparedStatement.dispose();
                                                }
                                                i = i3;
                                                hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                                return;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLiteDatabase = r12.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteCursor = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = r12.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                int i6 = i4 == true ? 1 : 0;
                                queryFinalized3.dispose();
                                SQLitePreparedStatement executeFast = r12.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                int i7 = i6;
                                while (i7 < arrayList4.size()) {
                                    try {
                                        try {
                                            executeFast.requery();
                                            c = s37.c((TLRPC.Message) arrayList5.get(i7));
                                            if (c != null) {
                                                try {
                                                    executeFast.bindByteBuffer(b7, c);
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    sQLitePreparedStatement = executeFast;
                                                    i3 = i;
                                                    b5 = b7;
                                                    sQLiteCursor = null;
                                                    r15 = b5;
                                                    r12.n(e, r15);
                                                    sQLiteDatabase2 = r12.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    i = i3;
                                                    hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                                    return;
                                                }
                                            } else {
                                                executeFast.bindNull(b7);
                                            }
                                            b4 = b7;
                                        } catch (Exception e8) {
                                            e = e8;
                                            b4 = b7;
                                        }
                                        try {
                                            executeFast.bindInteger(2, (int) ((long[]) arrayList4.get(i7))[i6]);
                                            int i8 = i7;
                                            executeFast.bindLong(3, ((long[]) arrayList4.get(i7))[b4 == true ? 1 : 0]);
                                            executeFast.step();
                                            if (c != null) {
                                                c.reuse();
                                            }
                                            i7 = i8 + 1;
                                            b7 = b4 == true ? 1 : 0;
                                        } catch (Exception e9) {
                                            e = e9;
                                            sQLitePreparedStatement = executeFast;
                                            i3 = i;
                                            b5 = b4;
                                            sQLiteCursor = null;
                                            r15 = b5;
                                            r12.n(e, r15);
                                            sQLiteDatabase2 = r12.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            i = i3;
                                            hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor = null;
                                        sQLiteDatabase = r12.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                b3 = b7;
                                executeFast.dispose();
                                try {
                                    if (str.equals("messages_v2")) {
                                        i = arrayList4.size();
                                    }
                                    i5++;
                                    b7 = b3 == true ? 1 : 0;
                                    i4 = i6;
                                    i2 = 2;
                                    r8 = 0;
                                } catch (Exception e10) {
                                    e = e10;
                                    i3 = i;
                                    b = b3;
                                    sQLiteCursor = null;
                                    b2 = b;
                                    sQLitePreparedStatement = null;
                                    r15 = b2;
                                    r12.n(e, r15);
                                    sQLiteDatabase2 = r12.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    i = i3;
                                    hl.c3(new hl3((Object) saVar, i, (byte) 29));
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                b3 = b7;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = r12.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e12) {
                        e = e12;
                        b = 1;
                    }
                    hl.c3(new hl3((Object) saVar, i, (byte) 29));
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor = null;
                }
            case 16:
                ((te2) obj2).a((ArrayList) obj);
                return;
            case 17:
                jf7 jf7Var2 = (jf7) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = jf7Var2.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th8) {
                    th = th8;
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
                        hl.c3(new he7(jf7Var2, tL_chatFull, b7));
                        SQLitePreparedStatement executeFast2 = jf7Var2.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor3 = queryFinalized;
                    jf7Var2.n(e, true);
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor3 = queryFinalized;
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                    throw th;
                }
            case 18:
                ((jf7) obj2).getMessagesController().Y3((TLRPC.TL_updates) obj, false);
                return;
            case 19:
                qsb.a((psb) obj2);
                ((ne7) obj).run();
                return;
            case 20:
                ((jf7) obj2).B((ac7) obj);
                return;
            case 21:
                jf7 jf7Var3 = (jf7) obj2;
                List<TLRPC.ChatTheme> list = (List) obj;
                try {
                    try {
                        try {
                            sQLitePreparedStatement3 = jf7Var3.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                    } catch (Exception e15) {
                        cc4.g(e15, true);
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                            return;
                        }
                        return;
                    }
                } catch (SQLiteException e16) {
                    jf7Var3.n(e16, true);
                    if (sQLitePreparedStatement3 == null) {
                        return;
                    }
                    sQLitePreparedStatement3.dispose();
                    return;
                }
            case 22:
                ((wt1) obj2).a(((int[]) obj)[0]);
                return;
            case 23:
                jf7 jf7Var4 = (jf7) obj2;
                String str2 = (String) obj;
                try {
                    try {
                        sQLitePreparedStatement2 = jf7Var4.b.executeFast("DELETE FROM onchain_offer_intents WHERE slug = ?");
                        sQLitePreparedStatement2.bindString(1, str2);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e17) {
                        jf7Var4.n(e17, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th11) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th11;
                }
            case 24:
                jf7 jf7Var5 = (jf7) obj2;
                hp7 hp7Var = (hp7) obj;
                long j = hp7Var.a;
                try {
                    jf7Var5.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
                    SQLitePreparedStatement executeFast3 = jf7Var5.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
                    for (Map.Entry entry : hp7Var.c.entrySet()) {
                        int intValue2 = ((Integer) entry.getKey()).intValue();
                        long longValue2 = ((Long) ((Pair) entry.getValue()).first).longValue();
                        long longValue3 = ((Long) ((Pair) entry.getValue()).second).longValue();
                        executeFast3.requery();
                        executeFast3.bindLong(1, j);
                        executeFast3.bindInteger(2, intValue2);
                        executeFast3.bindLong(3, longValue2);
                        String str3 = hp7Var.b;
                        if (str3 == null) {
                            str3 = "";
                            hp7Var.b = "";
                        }
                        executeFast3.bindString(4, str3);
                        executeFast3.bindInteger(5, hp7Var.d ? 1 : 0);
                        executeFast3.bindLong(6, longValue3);
                        executeFast3.step();
                    }
                    executeFast3.dispose();
                    return;
                } catch (Exception e18) {
                    jf7Var5.n(e18, true);
                    return;
                }
            case 25:
                a();
                return;
            case 26:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) obj).registerReceiver(new ak((yv2) obj2, (byte) 10), intentFilter);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                TLRPC.User user2 = (TLRPC.User) obj;
                ((rl7) obj2).dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.Q2(user2.id));
                    return;
                }
                return;
        }
    }
}
