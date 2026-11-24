// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xa7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ xa7(ad7 ad7Var, long j, boolean z, String str, long j2, int i, String str2, String str3, String str4) {
        this.f = ad7Var;
        this.c = j;
        this.b = z;
        this.h = str;
        this.e = j2;
        this.d = i;
        this.n = str2;
        this.r = str3;
        this.s = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int intValue;
        Throwable th;
        switch (this.a) {
            case 0:
                ad7 ad7Var = (ad7) this.f;
                long j = this.c;
                boolean z = this.b;
                String str = (String) this.h;
                long j2 = this.e;
                int i = this.d;
                String str2 = (String) this.n;
                String str3 = (String) this.r;
                String str4 = (String) this.s;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    if (j == 0) {
                        try {
                            SQLiteDatabase sQLiteDatabase = ad7Var.b;
                            Locale locale = Locale.ENGLISH;
                            SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE dialogs SET " + str3 + " = ? WHERE did = ?");
                            try {
                                executeFast.bindInteger(1, Math.max(i, 0));
                                executeFast.bindLong(2, j2);
                                executeFast.step();
                                executeFast.dispose();
                                if (i == 0) {
                                    SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("UPDATE " + str4 + " SET state = 0 WHERE dialog_id = ?");
                                    try {
                                        executeFast2.bindLong(1, j2);
                                        executeFast2.step();
                                        executeFast2.dispose();
                                    } catch (SQLiteException e) {
                                        e = e;
                                        sQLitePreparedStatement = executeFast2;
                                        e.printStackTrace();
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLitePreparedStatement = executeFast2;
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast;
                            } catch (Throwable th3) {
                                th = th3;
                                sQLitePreparedStatement = executeFast;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                        }
                        return;
                    }
                    if (z) {
                        try {
                            try {
                                SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                                Locale locale2 = Locale.ENGLISH;
                                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT " + str + " FROM topics WHERE did = " + j2 + " AND topic_id = " + j, new Object[0]);
                                intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                            } catch (SQLiteException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } else {
                        intValue = 0;
                    }
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    Locale locale3 = Locale.ENGLISH;
                    SQLitePreparedStatement executeFast3 = sQLiteDatabase3.executeFast("UPDATE topics SET " + str + " = ? WHERE did = ? AND topic_id = ?");
                    try {
                        executeFast3.bindInteger(1, Math.max(intValue + i, 0));
                        executeFast3.bindLong(2, j2);
                        executeFast3.bindLong(3, j);
                        executeFast3.step();
                        executeFast3.dispose();
                        if (i != 0) {
                            return;
                        }
                        SQLitePreparedStatement executeFast4 = ad7Var.b.executeFast("UPDATE " + str2 + " SET state = 0 WHERE dialog_id = ? AND topic_id = ? ");
                        try {
                            executeFast4.bindLong(1, j2);
                            executeFast4.bindLong(2, j);
                            executeFast4.step();
                            executeFast4.dispose();
                            return;
                        } catch (SQLiteException e5) {
                            e = e5;
                            sQLitePreparedStatement = executeFast4;
                            e.printStackTrace();
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement = executeFast4;
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        sQLitePreparedStatement = executeFast3;
                    } catch (Throwable th6) {
                        th = th6;
                        sQLitePreparedStatement = executeFast3;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            default:
                gta gtaVar = (gta) this.f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.r;
                boolean z2 = this.b;
                long j3 = this.c;
                int i2 = this.d;
                k27 k27Var = (k27) this.s;
                long j4 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.d.c(new lsa(gtaVar, tLObject, (byte) 5));
                    runnable.run();
                    return;
                } else {
                    if (tL_error == null || !ab4.r(tL_error.text) || z2) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = na7.q1(gtaVar.a).h1(j3);
                    tL_messages_getScheduledMessages.id.add(Integer.valueOf(i2));
                    ConnectionsManager.getInstance(gtaVar.a).sendRequest(tL_messages_getScheduledMessages, new ws0((Object) gtaVar, (Object) k27Var, j4, (Object) runnable, (byte) 6));
                    return;
                }
        }
    }

    public /* synthetic */ xa7(gta gtaVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z, long j, int i, k27 k27Var, long j2) {
        this.f = gtaVar;
        this.h = tLObject;
        this.n = runnable;
        this.r = tL_error;
        this.b = z;
        this.c = j;
        this.d = i;
        this.s = k27Var;
        this.e = j2;
    }
}
