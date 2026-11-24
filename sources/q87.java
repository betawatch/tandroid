// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class q87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        cf7 cf7Var = (cf7) this.b;
        ko7 ko7Var = (ko7) this.c;
        long j = ko7Var.a;
        try {
            cf7Var.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = cf7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : ko7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = ko7Var.b;
                if (str == null) {
                    str = "";
                    ko7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, ko7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            cf7Var.n(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03bf  */
    /* JADX WARN: Type inference failed for: r10v19, types: [cf7] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
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
        byte b6;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        byte b7 = this.a;
        int i2 = 2;
        ?? r6 = 0;
        SQLiteCursor sQLiteCursor2 = null;
        r6 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r6 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r6 = null;
        SQLiteCursor sQLiteCursor4 = null;
        byte b8 = 1;
        int i3 = 0;
        int i4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b7) {
            case 0:
                oc7 oc7Var = (oc7) obj2;
                oc7Var.getClass();
                oc7Var.I0(((TL_update.TL_updateChannel) obj).channel_id, 1, 0L, null);
                return;
            case 1:
                oc7 oc7Var2 = (oc7) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                oc7Var2.d4(tL_channels_channelParticipant.users, false);
                oc7Var2.X3(tL_channels_channelParticipant.chats, false);
                return;
            case 2:
                ((oc7) obj2).getNotificationCenter().k(76, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 3:
                ((oc7) obj2).S2((TLRPC.TL_help_appConfig) obj);
                return;
            case 4:
                oc7 oc7Var3 = (oc7) obj2;
                qn4 qn4Var = (qn4) obj;
                if (qn4Var != null) {
                    qn4Var.run();
                }
                oc7Var3.getNotificationCenter().k(2, 2);
                oc7Var3.getNotificationCenter().k(40, new Object[0]);
                return;
            case 5:
                oc7 oc7Var4 = (oc7) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                oc7Var4.d4(updates_channeldifference.users, false);
                oc7Var4.X3(updates_channeldifference.chats, false);
                return;
            case 6:
                oc7 oc7Var5 = (oc7) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                oc7Var5.getClass();
                oc7Var5.d4(messages_sponsoredmessages.users, false);
                oc7Var5.X3(messages_sponsoredmessages.chats, false);
                return;
            case 7:
                oc7 oc7Var6 = (oc7) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                oc7Var6.d4(tL_channels_sendAsPeers.users, false);
                oc7Var6.X3(tL_channels_sendAsPeers.chats, false);
                return;
            case 8:
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                ((oc7) obj2).p(tL_help_promoData.pending_suggestions, tL_help_promoData.dismissed_suggestions, tL_help_promoData.custom_pending_suggestion);
                return;
            case 9:
                oc7 oc7Var7 = (oc7) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                oc7Var7.d4(updates.users, false);
                oc7Var7.X3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList = updates.chats;
                if (arrayList == null || arrayList.isEmpty()) {
                    oc7Var7.getNotificationCenter().k(30, new Object[0]);
                    return;
                } else {
                    oc7Var7.getNotificationCenter().k(29, Long.valueOf(updates.chats.get(0).id));
                    return;
                }
            case 10:
                qac qacVar = (qac) obj2;
                Runnable runnable = (Runnable) obj;
                if (qacVar != null) {
                    qacVar.a(null);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((gp2) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 12:
                oc7 oc7Var8 = (oc7) obj2;
                ((ci7) obj).a(oc7Var8.N4);
                oc7Var8.M4 = false;
                return;
            case 13:
                g92 g92Var = (g92) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (g92Var != null) {
                    g92Var.a(tL_error);
                    return;
                }
                return;
            case 14:
                gu2 gu2Var = (gu2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (gu2Var != null) {
                    gu2Var.accept(user);
                    return;
                }
                return;
            case 15:
                k47 k47Var = (k47) obj;
                long B0 = k47.B0(k47Var.k);
                int e1 = k47Var.e1();
                vh6 vh6Var = ((oc7) obj2).A0;
                ArrayList arrayList2 = (ArrayList) vh6Var.f(B0);
                if (arrayList2 == null) {
                    arrayList2 = td4.t(vh6Var, B0);
                }
                if (arrayList2.contains(Integer.valueOf(e1))) {
                    return;
                }
                arrayList2.add(Integer.valueOf(e1));
                return;
            case 16:
                ic7 ic7Var = (ic7) obj2;
                TLObject tLObject = (TLObject) obj;
                ic7Var.c = false;
                ic7Var.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    ic7Var.b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                nm7.f(ic7Var.a).k(nm7.X3, new Object[0]);
                return;
            case 17:
                ((mf2) obj2).a((ArrayList) obj);
                return;
            case 18:
                ((pa7) obj2).a(((int[]) obj)[0]);
                return;
            case 19:
                ?? r10 = (cf7) obj2;
                ra raVar = (ra) obj;
                try {
                    try {
                        r10.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i5 = 0;
                        i = 0;
                        while (i5 < i2) {
                            try {
                                String str = strArr[i5];
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                SQLiteCursor queryFinalized2 = r10.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i4]);
                                while (queryFinalized2.next()) {
                                    try {
                                        try {
                                            try {
                                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i2);
                                                if (byteBufferValue2 != null) {
                                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                    l37.b(tL_message, byteBufferValue2);
                                                    byteBufferValue2.reuse();
                                                    if (tL_message.voiceTranscriptionLocal) {
                                                        tL_message.voiceTranscription = r6;
                                                        tL_message.voiceTranscriptionWords = r6;
                                                        tL_message.voiceTranscriptionLocal = i4;
                                                        tL_message.voiceTranscriptionOpen = i4;
                                                        tL_message.voiceTranscriptionFinal = i4;
                                                        tL_message.voiceTranscriptionId = 0L;
                                                        long intValue = queryFinalized2.intValue(i4 == true ? 1 : 0);
                                                        long longValue = queryFinalized2.longValue(b8);
                                                        boolean z = i4 == true ? 1 : 0;
                                                        long[] jArr = new long[2];
                                                        jArr[z ? 1 : 0] = intValue;
                                                        jArr[b8] = longValue;
                                                        arrayList3.add(jArr);
                                                        arrayList4.add(tL_message);
                                                        i4 = z ? 1 : 0;
                                                        i2 = 2;
                                                        r6 = 0;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                sQLiteCursor = queryFinalized2;
                                                b4 = b8;
                                                i3 = i;
                                                b2 = b4;
                                                sQLitePreparedStatement = null;
                                                r15 = b2;
                                                try {
                                                    r10.n(e, r15);
                                                    sQLiteDatabase2 = r10.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    i = i3;
                                                    gm.c3(new bm3((Object) raVar, i, (byte) 29));
                                                    return;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sQLiteDatabase = r10.b;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor = queryFinalized2;
                                            sQLitePreparedStatement = null;
                                            sQLiteDatabase = r10.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        b4 = b8;
                                        sQLiteCursor = queryFinalized2;
                                    }
                                }
                                int i6 = i4 == true ? 1 : 0;
                                queryFinalized2.dispose();
                                SQLitePreparedStatement executeFast = r10.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                int i7 = i6;
                                while (i7 < arrayList3.size()) {
                                    try {
                                        try {
                                            executeFast.requery();
                                            NativeByteBuffer c = l37.c((TLRPC.Message) arrayList4.get(i7));
                                            if (c != null) {
                                                try {
                                                    executeFast.bindByteBuffer(b8, c);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    sQLitePreparedStatement = executeFast;
                                                    b6 = b8;
                                                    i3 = i;
                                                    sQLiteCursor = null;
                                                    r15 = b6;
                                                    r10.n(e, r15);
                                                    sQLiteDatabase2 = r10.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    i = i3;
                                                    gm.c3(new bm3((Object) raVar, i, (byte) 29));
                                                    return;
                                                }
                                            } else {
                                                executeFast.bindNull(b8);
                                            }
                                            b5 = b8;
                                            try {
                                                executeFast.bindInteger(2, (int) ((long[]) arrayList3.get(i7))[i6]);
                                                int i8 = i7;
                                                executeFast.bindLong(3, ((long[]) arrayList3.get(i7))[b5 == true ? 1 : 0]);
                                                executeFast.step();
                                                if (c != null) {
                                                    c.reuse();
                                                }
                                                i7 = i8 + 1;
                                                b8 = b5 == true ? 1 : 0;
                                            } catch (Exception e4) {
                                                e = e4;
                                                sQLitePreparedStatement = executeFast;
                                                b6 = b5;
                                                i3 = i;
                                                sQLiteCursor = null;
                                                r15 = b6;
                                                r10.n(e, r15);
                                                sQLiteDatabase2 = r10.b;
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
                                                gm.c3(new bm3((Object) raVar, i, (byte) 29));
                                                return;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            b5 = b8;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor = null;
                                        sQLiteDatabase = r10.b;
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
                                b3 = b8;
                                executeFast.dispose();
                                try {
                                    if (str.equals("messages_v2")) {
                                        i = arrayList3.size();
                                    }
                                    i5++;
                                    b8 = b3 == true ? 1 : 0;
                                    i4 = i6;
                                    i2 = 2;
                                    r6 = 0;
                                } catch (Exception e6) {
                                    e = e6;
                                    i3 = i;
                                    b = b3;
                                    sQLiteCursor = null;
                                    b2 = b;
                                    sQLitePreparedStatement = null;
                                    r15 = b2;
                                    r10.n(e, r15);
                                    sQLiteDatabase2 = r10.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    i = i3;
                                    gm.c3(new bm3((Object) raVar, i, (byte) 29));
                                    return;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                b3 = b8;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = r10.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e8) {
                        e = e8;
                        b = 1;
                    }
                    gm.c3(new bm3((Object) raVar, i, (byte) 29));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
            case 20:
                rqb.a((qqb) obj2);
                ((de7) obj).run();
                return;
            case 21:
                cf7 cf7Var = (cf7) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = cf7Var.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e9) {
                        e = e9;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        tL_chatFull = 0;
                    } else {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                        TLdeserialize.online_count = queryFinalized.intValue(2);
                        TLdeserialize.inviterId = queryFinalized.longValue(3);
                        tL_chatFull = TLdeserialize;
                    }
                    queryFinalized.dispose();
                    if (tL_chatFull instanceof TLRPC.TL_chatFull) {
                        tL_chatFull.participants = chatParticipants;
                        gm.c3(new be7(cf7Var, tL_chatFull, b8));
                        SQLitePreparedStatement executeFast2 = cf7Var.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor4 = queryFinalized;
                    cf7Var.n(e, true);
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor4 = queryFinalized;
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th;
                }
            case 22:
                ((cf7) obj2).B((ub7) obj);
                return;
            case 23:
                ((cf7) obj2).getMessagesController().T3((TLRPC.TL_updates) obj, false);
                return;
            case 24:
                ((wu1) obj2).a(((int[]) obj)[0]);
                return;
            case 25:
                cf7 cf7Var2 = (cf7) obj2;
                String str2 = (String) obj;
                try {
                    try {
                        sQLitePreparedStatement3 = cf7Var2.b.executeFast("DELETE FROM onchain_offer_intents WHERE slug = ?");
                        sQLitePreparedStatement3.bindString(1, str2);
                        sQLitePreparedStatement3.step();
                    } catch (Throwable th7) {
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        throw th7;
                    }
                } catch (Exception e11) {
                    cf7Var2.n(e11, true);
                    if (sQLitePreparedStatement3 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement3.dispose();
                return;
            case 26:
                cf7 cf7Var3 = (cf7) obj2;
                List<TLRPC.ChatTheme> list = (List) obj;
                try {
                    try {
                        sQLitePreparedStatement2 = cf7Var3.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                        for (TLRPC.ChatTheme chatTheme : list) {
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                                tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.bindByteBuffer(2, nativeByteBuffer2);
                                nativeByteBuffer2.reuse();
                                sQLitePreparedStatement2.step();
                            }
                        }
                        sQLitePreparedStatement2.dispose();
                        return;
                    } catch (Throwable th8) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th8;
                    }
                } catch (SQLiteException e12) {
                    cf7Var3.n(e12, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Exception e13) {
                    fc4.g(e13, true);
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                }
            case 27:
                cf7 cf7Var4 = (cf7) obj2;
                mf2 mf2Var = (mf2) obj;
                try {
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        SQLiteCursor queryFinalized3 = cf7Var4.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
                        while (queryFinalized3.next()) {
                            try {
                                NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue3 != null) {
                                    TLRPC.ChatTheme TLdeserialize2 = TLRPC.ChatTheme.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                    byteBufferValue3.reuse();
                                    if (TLdeserialize2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                                        arrayList5.add((TLRPC.TL_chatThemeUniqueGift) TLdeserialize2);
                                    }
                                }
                            } catch (SQLiteException e14) {
                                e = e14;
                                sQLiteCursor3 = queryFinalized3;
                                cf7Var4.n(e, true);
                                break;
                            } catch (Exception e15) {
                                e = e15;
                                sQLiteCursor3 = queryFinalized3;
                                fc4.g(e, true);
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                gm.c3(new pg6(mf2Var, (byte) 24));
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor2 = queryFinalized3;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized3.dispose();
                        gm.c3(new q87(mf2Var, arrayList5, (byte) 17));
                        return;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                } catch (Exception e17) {
                    e = e17;
                }
            case 28:
                a();
                return;
            default:
                cf7 cf7Var5 = (cf7) obj2;
                HashMap hashMap = (HashMap) obj;
                for (bf7 bf7Var : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(bf7Var);
                    num.getClass();
                    try {
                        SQLiteDatabase sQLiteDatabase4 = cf7Var5.b;
                        Locale locale = Locale.US;
                        long j = bf7Var.a;
                        long j2 = bf7Var.b;
                        sQLiteDatabase4.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j + " AND topic_id = " + j2 + "), " + num + ") WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                    } catch (SQLiteException e18) {
                        cf7Var5.n(e18, true);
                    }
                }
                return;
        }
    }
}
