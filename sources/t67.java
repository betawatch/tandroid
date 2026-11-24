// default package

import android.content.Context;
import android.content.IntentFilter;
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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t67(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ad7 ad7Var = (ad7) this.b;
        hm7 hm7Var = (hm7) this.c;
        long j = hm7Var.a;
        try {
            ad7Var.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
            SQLitePreparedStatement executeFast = ad7Var.b.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry entry : hm7Var.c.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                long longValue = ((Long) ((Pair) entry.getValue()).first).longValue();
                long longValue2 = ((Long) ((Pair) entry.getValue()).second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                String str = hm7Var.b;
                if (str == null) {
                    str = "";
                    hm7Var.b = "";
                }
                executeFast.bindString(4, str);
                executeFast.bindInteger(5, hm7Var.d ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e) {
            ad7Var.n(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c1  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$ChatFull] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        int i;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor queryFinalized;
        TLRPC.TL_chatFull tL_chatFull;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        int i2 = 2;
        ?? r5 = 0;
        SQLiteCursor sQLiteCursor2 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor3 = null;
        r5 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r5 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r5 = null;
        SQLiteCursor sQLiteCursor4 = null;
        byte b2 = 1;
        int i3 = 0;
        int i4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((na7) obj2).getNotificationCenter().k(75, 4, ((TLRPC.TL_help_termsOfServiceUpdate) obj).terms_of_service);
                return;
            case 1:
                ((na7) obj2).Q2((TLRPC.TL_help_appConfig) obj);
                return;
            case 2:
                na7 na7Var = (na7) obj2;
                TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) obj;
                na7Var.getClass();
                na7Var.b4(messages_sponsoredmessages.users, false);
                na7Var.V3(messages_sponsoredmessages.chats, false);
                return;
            case 3:
                na7 na7Var2 = (na7) obj2;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj;
                na7Var2.b4(updates_channeldifference.users, false);
                na7Var2.V3(updates_channeldifference.chats, false);
                return;
            case 4:
                na7 na7Var3 = (na7) obj2;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) obj;
                na7Var3.b4(tL_channels_channelParticipant.users, false);
                na7Var3.V3(tL_channels_channelParticipant.chats, false);
                return;
            case 5:
                na7 na7Var4 = (na7) obj2;
                iu4 iu4Var = (iu4) obj;
                if (iu4Var != null) {
                    iu4Var.run();
                }
                na7Var4.getNotificationCenter().k(2, 2);
                na7Var4.getNotificationCenter().k(39, new Object[0]);
                return;
            case 6:
                na7 na7Var5 = (na7) obj2;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) obj;
                na7Var5.b4(tL_channels_sendAsPeers.users, false);
                na7Var5.V3(tL_channels_sendAsPeers.chats, false);
                return;
            case 7:
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                ((na7) obj2).p(tL_help_promoData.pending_suggestions, tL_help_promoData.dismissed_suggestions, tL_help_promoData.custom_pending_suggestion);
                return;
            case 8:
                na7 na7Var6 = (na7) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                na7Var6.b4(updates.users, false);
                na7Var6.V3(updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList = updates.chats;
                if (arrayList == null || arrayList.isEmpty()) {
                    na7Var6.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    na7Var6.getNotificationCenter().k(28, Long.valueOf(updates.chats.get(0).id));
                    return;
                }
            case 9:
                p8c p8cVar = (p8c) obj2;
                Runnable runnable = (Runnable) obj;
                if (p8cVar != null) {
                    p8cVar.a(null);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                ((vn2) obj2).a(0, (TLRPC.TL_error) obj);
                return;
            case 11:
                na7 na7Var7 = (na7) obj2;
                ((zf7) obj).a(na7Var7.L4);
                na7Var7.K4 = false;
                return;
            case 12:
                v72 v72Var = (v72) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (v72Var != null) {
                    v72Var.a(tL_error);
                    return;
                }
                return;
            case 13:
                vs2 vs2Var = (vs2) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (vs2Var != null) {
                    vs2Var.accept(user);
                    return;
                }
                return;
            case 14:
                k27 k27Var = (k27) obj;
                long B0 = k27.B0(k27Var.k);
                int e1 = k27Var.e1();
                vf6 vf6Var = ((na7) obj2).A0;
                ArrayList arrayList2 = (ArrayList) vf6Var.f(B0);
                if (arrayList2 == null) {
                    arrayList2 = tb4.s(vf6Var, B0);
                }
                if (arrayList2.contains(Integer.valueOf(e1))) {
                    return;
                }
                arrayList2.add(Integer.valueOf(e1));
                return;
            case 15:
                ha7 ha7Var = (ha7) obj2;
                TLObject tLObject = (TLObject) obj;
                ha7Var.c = false;
                ha7Var.d = true;
                if (tLObject instanceof TL_account.TL_savedMusicIds) {
                    ha7Var.b.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
                }
                kk7.f(ha7Var.a).k(kk7.W3, new Object[0]);
                return;
            case 16:
                ((be2) obj2).a((ArrayList) obj);
                return;
            case 17:
                ((o87) obj2).a(((int[]) obj)[0]);
                return;
            case 18:
                ad7 ad7Var = (ad7) obj2;
                ra raVar = (ra) obj;
                try {
                    try {
                        ad7Var.b.beginTransaction();
                        String[] strArr = {"messages_v2", "messages_topics"};
                        int i5 = 0;
                        i = 0;
                        while (i5 < i2) {
                            try {
                                String str = strArr[i5];
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                SQLiteCursor queryFinalized2 = ad7Var.b.queryFinalized("SELECT mid, uid, custom_params FROM " + str + " WHERE custom_params IS NOT NULL", new Object[i4]);
                                while (queryFinalized2.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i2);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            l17.b(tL_message, byteBufferValue2);
                                            byteBufferValue2.reuse();
                                            if (tL_message.voiceTranscriptionLocal) {
                                                tL_message.voiceTranscription = r5;
                                                tL_message.voiceTranscriptionWords = r5;
                                                tL_message.voiceTranscriptionLocal = i4;
                                                tL_message.voiceTranscriptionOpen = i4;
                                                tL_message.voiceTranscriptionFinal = i4;
                                                tL_message.voiceTranscriptionId = 0L;
                                                long intValue = queryFinalized2.intValue(i4 == true ? 1 : 0);
                                                long longValue = queryFinalized2.longValue(1);
                                                boolean z = i4 == true ? 1 : 0;
                                                long[] jArr = new long[2];
                                                jArr[z ? 1 : 0] = intValue;
                                                jArr[1] = longValue;
                                                arrayList3.add(jArr);
                                                arrayList4.add(tL_message);
                                                i4 = z ? 1 : 0;
                                                i2 = 2;
                                                r5 = 0;
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        sQLiteCursor = queryFinalized2;
                                        i3 = i;
                                        sQLitePreparedStatement = null;
                                        try {
                                            ad7Var.n(e, true);
                                            sQLiteDatabase2 = ad7Var.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            i = i3;
                                            gl.c3(new sm3((Object) raVar, i, (byte) 27));
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase = ad7Var.b;
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
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = queryFinalized2;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = ad7Var.b;
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
                                queryFinalized2.dispose();
                                SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE " + str + " SET custom_params = ? WHERE mid = ? AND uid = ?");
                                for (int i7 = i6; i7 < arrayList3.size(); i7++) {
                                    try {
                                        executeFast.requery();
                                        NativeByteBuffer c = l17.c((TLRPC.Message) arrayList4.get(i7));
                                        if (c != null) {
                                            executeFast.bindByteBuffer(1, c);
                                        } else {
                                            executeFast.bindNull(1);
                                        }
                                        executeFast.bindInteger(2, (int) ((long[]) arrayList3.get(i7))[i6]);
                                        executeFast.bindLong(3, ((long[]) arrayList3.get(i7))[1]);
                                        executeFast.step();
                                        if (c != null) {
                                            c.reuse();
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        sQLitePreparedStatement = executeFast;
                                        i3 = i;
                                        sQLiteCursor = null;
                                        ad7Var.n(e, true);
                                        sQLiteDatabase2 = ad7Var.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        i = i3;
                                        gl.c3(new sm3((Object) raVar, i, (byte) 27));
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLitePreparedStatement = executeFast;
                                        sQLiteCursor = null;
                                        sQLiteDatabase = ad7Var.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                executeFast.dispose();
                                if (str.equals("messages_v2")) {
                                    i = arrayList3.size();
                                }
                                i5++;
                                i4 = i6;
                                i2 = 2;
                                r5 = 0;
                            } catch (Exception e3) {
                                e = e3;
                                i3 = i;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                ad7Var.n(e, true);
                                sQLiteDatabase2 = ad7Var.b;
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
                                gl.c3(new sm3((Object) raVar, i, (byte) 27));
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                    gl.c3(new sm3((Object) raVar, i, (byte) 27));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
            case 19:
                qob.a((pob) obj2);
                ((bc7) obj).run();
                return;
            case 20:
                ad7 ad7Var2 = (ad7) obj2;
                TLRPC.ChatParticipants chatParticipants = (TLRPC.ChatParticipants) obj;
                try {
                    try {
                        queryFinalized = ad7Var2.b.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
                    } catch (Exception e5) {
                        e = e5;
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
                        gl.c3(new zb7(ad7Var2, tL_chatFull, b2));
                        SQLitePreparedStatement executeFast2 = ad7Var2.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor4 = queryFinalized;
                    ad7Var2.n(e, true);
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
            case 21:
                ((ad7) obj2).B((t97) obj);
                return;
            case 22:
                ((ad7) obj2).getMessagesController().R3((TLRPC.TL_updates) obj, false);
                return;
            case 23:
                ((kt1) obj2).a(((int[]) obj)[0]);
                return;
            case 24:
                ad7 ad7Var3 = (ad7) obj2;
                String str2 = (String) obj;
                try {
                    try {
                        sQLitePreparedStatement3 = ad7Var3.b.executeFast("DELETE FROM onchain_offer_intents WHERE slug = ?");
                        sQLitePreparedStatement3.bindString(1, str2);
                        sQLitePreparedStatement3.step();
                    } catch (Throwable th7) {
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        throw th7;
                    }
                } catch (Exception e7) {
                    ad7Var3.n(e7, true);
                    if (sQLitePreparedStatement3 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement3.dispose();
                return;
            case 25:
                ad7 ad7Var4 = (ad7) obj2;
                List<TLRPC.ChatTheme> list = (List) obj;
                try {
                    try {
                        sQLitePreparedStatement2 = ad7Var4.b.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
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
                } catch (SQLiteException e8) {
                    ad7Var4.n(e8, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Exception e9) {
                    fa4.g(e9, true);
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                }
            case 26:
                ad7 ad7Var5 = (ad7) obj2;
                be2 be2Var = (be2) obj;
                try {
                    try {
                        ArrayList arrayList5 = new ArrayList();
                        SQLiteCursor queryFinalized3 = ad7Var5.b.queryFinalized("SELECT data FROM gift_themes", new Object[0]);
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
                            } catch (SQLiteException e10) {
                                e = e10;
                                sQLiteCursor3 = queryFinalized3;
                                ad7Var5.n(e, true);
                                break;
                            } catch (Exception e11) {
                                e = e11;
                                sQLiteCursor3 = queryFinalized3;
                                fa4.g(e, true);
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                gl.c3(new vl6(be2Var, (byte) 17));
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
                        gl.c3(new t67(be2Var, arrayList5, (byte) 16));
                        return;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                }
            case 27:
                a();
                return;
            case 28:
                ad7 ad7Var6 = (ad7) obj2;
                HashMap hashMap = (HashMap) obj;
                for (zc7 zc7Var : hashMap.keySet()) {
                    Integer num = (Integer) hashMap.get(zc7Var);
                    num.getClass();
                    try {
                        SQLiteDatabase sQLiteDatabase4 = ad7Var6.b;
                        Locale locale = Locale.US;
                        long j = zc7Var.a;
                        long j2 = zc7Var.b;
                        sQLiteDatabase4.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j + " AND topic_id = " + j2 + "), " + num + ") WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                    } catch (SQLiteException e14) {
                        ad7Var6.n(e14, true);
                    }
                }
                return;
            default:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) obj).registerReceiver(new zj((ev2) obj2, (byte) 10), intentFilter);
                return;
        }
    }
}
