// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class sa7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ sa7(ad7 ad7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c A[Catch: Exception -> 0x013f, all -> 0x0147, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:15:0x0060, B:39:0x00ef, B:42:0x00fa, B:45:0x0104, B:47:0x0108, B:51:0x0116, B:53:0x011b, B:55:0x012c), top: B:14:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        ad7 ad7Var;
        ArrayList arrayList;
        SQLiteCursor queryFinalized;
        ArrayList arrayList2;
        ad7 ad7Var2;
        byte b = this.a;
        ?? r4 = 0;
        long j = this.c;
        ad7 ad7Var3 = this.b;
        long j2 = this.d;
        try {
            switch (b) {
                case 0:
                    try {
                        SQLiteCursor queryFinalized2 = ad7Var3.b.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j, new Object[0]);
                        int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                        queryFinalized2.dispose();
                        if (j2 != intValue) {
                            SQLiteDatabase sQLiteDatabase = ad7Var3.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("REPLACE INTO dialog_settings VALUES(" + j + ", " + j2 + ")").stepThis().dispose();
                            ad7Var3.q1(true);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        ad7Var3.n(e, true);
                        return;
                    }
                case 1:
                    try {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var3.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                        ad7Var3.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id = " + j2 + ")").stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase3 = ad7Var3.b;
                        StringBuilder sb = new StringBuilder("DELETE FROM messages_topics WHERE uid = ");
                        sb.append(j);
                        sb.append(" AND topic_id = ");
                        sb.append(j2);
                        sQLiteDatabase3.executeFast(sb.toString()).stepThis().dispose();
                        return;
                    } catch (SQLiteException e2) {
                        e2.printStackTrace();
                        return;
                    }
                case 2:
                    try {
                        sQLitePreparedStatement = ad7Var3.b.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                        try {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, j);
                            sQLitePreparedStatement.bindLong(2, j2);
                            sQLitePreparedStatement.step();
                            sQLitePreparedStatement.dispose();
                        } catch (Exception e3) {
                            e = e3;
                            ad7Var3.n(e, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        sQLitePreparedStatement = null;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                case 3:
                    ad7 ad7Var4 = this.b;
                    long j3 = this.c;
                    try {
                        try {
                            arrayList = new ArrayList();
                            queryFinalized = ad7Var4.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                        } catch (Exception e5) {
                            e = e5;
                            ad7Var = ad7Var4;
                        }
                        try {
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                while (queryFinalized.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r4);
                                        if (byteBufferValue != 0) {
                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r4), r4);
                                            try {
                                                if (TLdeserialize != null) {
                                                    TLdeserialize.readAttachPath(byteBufferValue, ad7Var4.getUserConfig().n);
                                                    if ((l7c.A(j3) && k27.B1(TLdeserialize.fwd_from.from_id) == j2) || (k27.B1(TLdeserialize.from_id) == j2 && TLdeserialize.id != 1)) {
                                                        arrayList.add(Integer.valueOf(TLdeserialize.id));
                                                        ad7Var4.a(TLdeserialize, arrayList3, arrayList5, arrayList4, false);
                                                        arrayList2 = arrayList3;
                                                        byteBufferValue.reuse();
                                                    }
                                                }
                                                byteBufferValue.reuse();
                                            } catch (Exception e6) {
                                                e = e6;
                                                ad7Var4.n(e, true);
                                                queryFinalized.dispose();
                                                ad7Var4.C(arrayList5, true);
                                                ad7Var = ad7Var4;
                                                gl.c3(new m77((Object) ad7Var, (Object) arrayList4, j3, (Object) arrayList, (byte) 21));
                                                ad7Var2 = ad7Var;
                                                ad7Var2.N0(0, 0, j3, arrayList, false);
                                                ad7Var2 = ad7Var2;
                                                ad7Var2.P1(j3, !cf3.y(j3) ? -j3 : 0L, arrayList, null);
                                                ad7Var = ad7Var2;
                                                ad7Var.getFileLoader().getClass();
                                                ba4.p(0, arrayList2);
                                                if (arrayList.isEmpty()) {
                                                }
                                            }
                                            arrayList2 = arrayList3;
                                        } else {
                                            arrayList2 = arrayList3;
                                        }
                                        arrayList3 = arrayList2;
                                        r4 = 0;
                                    } catch (Exception e7) {
                                        e = e7;
                                        arrayList2 = arrayList3;
                                    }
                                }
                                arrayList2 = arrayList3;
                                queryFinalized.dispose();
                                ad7Var4.C(arrayList5, true);
                                ad7Var = ad7Var4;
                                try {
                                    gl.c3(new m77((Object) ad7Var, (Object) arrayList4, j3, (Object) arrayList, (byte) 21));
                                    ad7Var2 = ad7Var;
                                } catch (Exception e8) {
                                    e = e8;
                                }
                                try {
                                    ad7Var2.N0(0, 0, j3, arrayList, false);
                                    ad7Var2 = ad7Var2;
                                    ad7Var2.P1(j3, !cf3.y(j3) ? -j3 : 0L, arrayList, null);
                                    ad7Var = ad7Var2;
                                    ad7Var.getFileLoader().getClass();
                                    ba4.p(0, arrayList2);
                                    if (arrayList.isEmpty()) {
                                        gl.c3(new jc7(ad7Var, arrayList, j3, (byte) 8));
                                        return;
                                    }
                                    return;
                                } catch (Exception e9) {
                                    e = e9;
                                    ad7Var = ad7Var2;
                                    sQLiteCursor = null;
                                    try {
                                        ad7Var.n(e, true);
                                        if (sQLiteCursor == null) {
                                            sQLiteCursor.dispose();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            ad7Var = ad7Var4;
                            sQLiteCursor = queryFinalized;
                            ad7Var.n(e, true);
                            if (sQLiteCursor == null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                    }
                    break;
                default:
                    try {
                        ad7Var3.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j + " AND id = " + j2).stepThis().dispose();
                        ad7Var3.b.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j + " AND count > 0").stepThis().dispose();
                        return;
                    } catch (Exception e11) {
                        ad7Var3.n(e11, true);
                        return;
                    }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
