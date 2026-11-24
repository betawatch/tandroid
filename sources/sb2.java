// default package

import android.content.Context;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sb2 implements Runnable {
    public final /* synthetic */ byte a = 6;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ sb2(int i, Context context, long j, long j2, fx0[] fx0VarArr, wjb wjbVar) {
        this.b = i;
        this.e = context;
        this.c = j;
        this.d = j2;
        this.f = fx0VarArr;
        this.h = wjbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        up9 up9Var;
        SQLiteCursor sQLiteCursor;
        gq7 gq7Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        int i2;
        NativeByteBuffer byteBufferValue;
        int i3;
        byte b = this.a;
        int i4 = 4;
        long j = this.d;
        int i5 = 2;
        long j2 = this.c;
        int i6 = 0;
        int i7 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj2;
                wjb wjbVar = (wjb) obj;
                ((cs5) obj3).u();
                na7 q1 = na7.q1(i7);
                long j3 = this.c;
                long j4 = this.d;
                boolean n2 = q1.n2(j3, j4, null);
                im7.n(i7).G(j3, j4, !n2);
                if (u21.a(mu1Var)) {
                    if (n2) {
                        i = 0;
                    } else {
                        i4 = 3;
                        i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    u21.z(mu1Var, i4, i, wjbVar).j();
                    return;
                }
                return;
            case 1:
                k76 k76Var = (k76) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                k76Var.b(i7);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = k76Var.getContext();
                    f53 f53Var = new f53();
                    long j5 = this.d;
                    long j6 = this.c;
                    new zua(context, f53Var, j6, 17, "", new n30((Object) k76Var, j5, (TLObject) tL_textWithEntities, j6, (byte) 6), k76Var.N).show();
                    return;
                }
                if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new u21(k76Var.b, new f53()).g0(tL_error, true);
                    return;
                }
                t76 t76Var = k76Var.Q;
                if (t76Var != null) {
                    t76Var.G();
                    return;
                }
                return;
            case 2:
                hq6 hq6Var = (hq6) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj2;
                e77 e77Var = (e77) obj;
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) hq6Var.y1.get(j2 + "_" + j);
                if (botInfo2 != null) {
                    botInfo = botInfo2;
                }
                if (e77Var != null) {
                    e77Var.a(botInfo);
                }
                hq6Var.getNotificationCenter().k(66, botInfo, Integer.valueOf(i7));
                return;
            case 3:
                na7 na7Var = (na7) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                int[] iArr = (int[]) obj;
                long j7 = this.d;
                if (j2 == 0) {
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    messagesStorage.a.c(new ua7(messagesStorage, j7, (byte) 3));
                }
                TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
                tL_messages_deleteSavedHistory.peer = na7Var.h1(j7);
                tL_messages_deleteSavedHistory.parent_peer = inputPeer;
                if (i7 == 0 && j2 == 0) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= na7Var.D1().j.size()) {
                            up9Var = null;
                        } else if (((up9) na7Var.D1().j.get(i8)).a == j7) {
                            up9Var = (up9) na7Var.D1().j.get(i8);
                        } else {
                            i8++;
                        }
                    }
                    if (up9Var != null) {
                        iArr[0] = Math.max(iArr[0], up9Var.c);
                        vp9 D1 = na7Var.D1();
                        D1.g -= D1.i(j7);
                        D1.k();
                    }
                    int i9 = iArr[0];
                    tL_messages_deleteSavedHistory.max_id = i9 <= 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i9;
                }
                na7Var.getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new ws0(na7Var, j7, (Object) iArr, (TLObject) inputPeer, (byte) 4), 64);
                return;
            case 4:
                ad7 ad7Var = (ad7) obj3;
                String str = (String) obj2;
                gq7 gq7Var2 = (gq7) obj;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                        StringBuilder sb = new StringBuilder("DELETE FROM onchain_offer_intents WHERE used_at < ");
                        gq7Var = gq7Var2;
                        try {
                            sb.append(currentTimeMillis - 1800000);
                            sb.append(" OR used_at > ");
                            sb.append(currentTimeMillis);
                            sQLiteDatabase2.executeFast(sb.toString()).stepThis().dispose();
                            SQLiteCursor queryFinalized = ad7Var.b.queryFinalized("SELECT random_id FROM onchain_offer_intents WHERE slug = ? AND amount = ? AND duration = ?", str, Long.valueOf(j), Integer.valueOf(i7));
                            try {
                                try {
                                    if (queryFinalized.next()) {
                                        try {
                                            j2 = queryFinalized.longValue(0);
                                        } catch (Exception e) {
                                            e = e;
                                            sQLiteCursor = queryFinalized;
                                            z = true;
                                            sQLitePreparedStatement = null;
                                            try {
                                                ad7Var.n(e, z);
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                gl.c3(new et(gq7Var, j2, (byte) 21));
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (sQLiteCursor != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    queryFinalized.dispose();
                                    executeFast = ad7Var.b.executeFast("REPLACE INTO onchain_offer_intents VALUES(?, ?, ?, ?, ?)");
                                } catch (Exception e2) {
                                    e = e2;
                                    sQLiteCursor = queryFinalized;
                                    z = true;
                                    sQLitePreparedStatement = null;
                                    ad7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    gl.c3(new et(gq7Var, j2, (byte) 21));
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteCursor = null;
                            z = true;
                            sQLitePreparedStatement = null;
                            ad7Var.n(e, z);
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            gl.c3(new et(gq7Var, j2, (byte) 21));
                            return;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        gq7Var = gq7Var2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                try {
                    executeFast.bindString(1, str);
                    executeFast.bindLong(2, j);
                    executeFast.bindInteger(3, i7);
                    executeFast.bindLong(4, j2);
                    executeFast.bindLong(5, currentTimeMillis);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    z = true;
                    ad7Var.n(e, z);
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    gl.c3(new et(gq7Var, j2, (byte) 21));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = executeFast;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                gl.c3(new et(gq7Var, j2, (byte) 21));
                return;
            case 5:
                ad7 ad7Var2 = (ad7) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                try {
                    ad7Var2.b.beginTransaction();
                    int i10 = 0;
                    while (true) {
                        SQLiteDatabase sQLiteDatabase3 = ad7Var2.b;
                        if (i10 >= i5) {
                            sQLiteDatabase3.commitTransaction();
                            SQLiteDatabase sQLiteDatabase4 = ad7Var2.b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.commitTransaction();
                                return;
                            }
                            return;
                        }
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT data FROM " + (i10 == 0 ? "messages_v2" : "messages_topics") + " WHERE mid = " + i7 + " AND uid = " + j2, new Object[i6]);
                        try {
                            if (!queryFinalized2.next() || (byteBufferValue = queryFinalized2.byteBufferValue(i6)) == null) {
                                z2 = i6;
                                i2 = i7;
                            } else {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i6), i6);
                                if (TLdeserialize != null) {
                                    z2 = i6;
                                    i3 = i7;
                                    TLdeserialize.readAttachPath(byteBufferValue, ad7Var2.getUserConfig().n);
                                } else {
                                    z2 = i6;
                                    i3 = i7;
                                }
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) messageMedia;
                                        if (str2 != null) {
                                            tL_messageMediaWidget.public_data = str2.isEmpty() ? null : str2;
                                            tL_messageMediaWidget.public_data_hash = j;
                                        }
                                        if (str3 != null) {
                                            tL_messageMediaWidget.chat_data = str3.isEmpty() ? null : str3;
                                        }
                                        SQLitePreparedStatement executeFast2 = ad7Var2.b.executeFast("UPDATE " + (i10 == 0 ? "messages_v2" : "messages_topics") + " SET data = ? WHERE mid = ? AND uid = ?");
                                        k27.p5(TLdeserialize);
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                        TLdeserialize.serializeToStream(nativeByteBuffer);
                                        executeFast2.requery();
                                        executeFast2.bindByteBuffer(1, nativeByteBuffer);
                                        i2 = i3;
                                        executeFast2.bindInteger(2, i2);
                                        executeFast2.bindLong(3, j2);
                                        executeFast2.step();
                                        nativeByteBuffer.reuse();
                                        executeFast2.dispose();
                                    }
                                }
                                i2 = i3;
                            }
                            queryFinalized2.dispose();
                            i10++;
                            i7 = i2;
                            i6 = z2;
                            i5 = 2;
                        } catch (Exception e6) {
                            e = e6;
                            sQLiteCursor2 = queryFinalized2;
                            try {
                                ad7Var2.n(e, true);
                                SQLiteDatabase sQLiteDatabase5 = ad7Var2.b;
                                if (sQLiteDatabase5 != null) {
                                    sQLiteDatabase5.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteDatabase = ad7Var2.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor2 = queryFinalized2;
                            sQLiteDatabase = ad7Var2.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor2 = null;
                }
                break;
            default:
                Context context2 = (Context) obj3;
                int i11 = this.b;
                ct0 g = ct0.g(i11);
                long j8 = this.c;
                g.f(context2, j8, this.d, new qf1((fx0[]) obj2, context2, i11, j8, (wjb) obj, (byte) 2));
                return;
        }
    }

    public /* synthetic */ sb2(cs5 cs5Var, int i, long j, long j2, mu1 mu1Var, wjb wjbVar) {
        this.e = cs5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = mu1Var;
        this.h = wjbVar;
    }

    public /* synthetic */ sb2(k76 k76Var, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = k76Var;
        this.b = i;
        this.f = tL_error;
        this.c = j;
        this.d = j2;
        this.h = tL_textWithEntities;
    }

    public /* synthetic */ sb2(hq6 hq6Var, long j, long j2, TL_bots.BotInfo botInfo, e77 e77Var, int i) {
        this.e = hq6Var;
        this.c = j;
        this.d = j2;
        this.f = botInfo;
        this.h = e77Var;
        this.b = i;
    }

    public /* synthetic */ sb2(na7 na7Var, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.e = na7Var;
        this.c = j;
        this.d = j2;
        this.f = inputPeer;
        this.b = i;
        this.h = iArr;
    }

    public /* synthetic */ sb2(ad7 ad7Var, int i, long j, String str, long j2, String str2) {
        this.e = ad7Var;
        this.b = i;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.h = str2;
    }

    public /* synthetic */ sb2(ad7 ad7Var, long j, String str, long j2, int i, gq7 gq7Var) {
        this.e = ad7Var;
        this.c = j;
        this.f = str;
        this.d = j2;
        this.b = i;
        this.h = gq7Var;
    }
}
