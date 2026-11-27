// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class xd7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ xd7(jf7 jf7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = j;
        this.d = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c A[Catch: Exception -> 0x015f, all -> 0x0170, TRY_LEAVE, TryCatch #8 {all -> 0x0170, blocks: (B:21:0x0070, B:50:0x0110, B:53:0x011b, B:56:0x0125, B:58:0x0129, B:62:0x0137, B:64:0x013c, B:66:0x014c), top: B:20:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        jf7 jf7Var;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        jf7 jf7Var2;
        byte b = this.a;
        long j = this.c;
        jf7 jf7Var3 = this.b;
        long j2 = this.d;
        try {
            switch (b) {
                case 0:
                    try {
                        jf7Var3.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j + " AND id = " + j2).stepThis().dispose();
                        jf7Var3.b.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j + " AND count > 0").stepThis().dispose();
                        return;
                    } catch (Exception e) {
                        jf7Var3.n(e, true);
                        return;
                    }
                case 1:
                    try {
                        sQLitePreparedStatement = jf7Var3.b.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                        try {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, j);
                            sQLitePreparedStatement.bindLong(2, j2);
                            sQLitePreparedStatement.step();
                            sQLitePreparedStatement.dispose();
                        } catch (Exception e2) {
                            e = e2;
                            jf7Var3.n(e, true);
                            if (sQLitePreparedStatement == null) {
                                return;
                            }
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                    } catch (Exception e3) {
                        e = e3;
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
                case 2:
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7Var3.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j + " AND topic_id = " + j2).stepThis().dispose();
                        jf7Var3.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j + " AND topic_id = " + j2 + ")").stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase2 = jf7Var3.b;
                        StringBuilder sb = new StringBuilder("DELETE FROM messages_topics WHERE uid = ");
                        sb.append(j);
                        sb.append(" AND topic_id = ");
                        sb.append(j2);
                        sQLiteDatabase2.executeFast(sb.toString()).stepThis().dispose();
                        return;
                    } catch (SQLiteException e4) {
                        e4.printStackTrace();
                        return;
                    }
                case 3:
                    jf7 jf7Var4 = this.b;
                    long j3 = this.c;
                    try {
                        try {
                            arrayList = new ArrayList();
                            SQLiteCursor queryFinalized = jf7Var4.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3, new Object[0]);
                            try {
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    while (queryFinalized.next()) {
                                        try {
                                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                            if (byteBufferValue != null) {
                                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                try {
                                                    if (TLdeserialize != null) {
                                                        sQLiteCursor2 = queryFinalized;
                                                        try {
                                                            try {
                                                                TLdeserialize.readAttachPath(byteBufferValue, jf7Var4.getUserConfig().n);
                                                                if ((lbc.A(j3) && r47.B1(TLdeserialize.fwd_from.from_id) == j2) || (r47.B1(TLdeserialize.from_id) == j2 && TLdeserialize.id != 1)) {
                                                                    arrayList.add(Integer.valueOf(TLdeserialize.id));
                                                                    jf7Var4.a(TLdeserialize, arrayList3, arrayList5, arrayList4, false);
                                                                    arrayList2 = arrayList3;
                                                                    byteBufferValue.reuse();
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                if (sQLiteCursor != null) {
                                                                    sQLiteCursor.dispose();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            arrayList2 = arrayList3;
                                                            try {
                                                                jf7Var4.n(e, true);
                                                                sQLiteCursor2.dispose();
                                                                jf7Var4.C(arrayList5, true);
                                                                jf7Var = jf7Var4;
                                                                hl.c3(new ba7((Object) jf7Var, (Object) arrayList4, j3, (Object) arrayList, (byte) 22));
                                                                jf7Var2 = jf7Var;
                                                                jf7Var2.N0(0, 0, j3, arrayList, false);
                                                                jf7Var2 = jf7Var2;
                                                                jf7Var2.P1(j3, wf3.y(j3) ? -j3 : 0L, arrayList, null);
                                                                jf7Var = jf7Var2;
                                                                jf7Var.getFileLoader().getClass();
                                                                xb4.p(0, arrayList2);
                                                                if (arrayList.isEmpty()) {
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                jf7Var = jf7Var4;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                try {
                                                                    jf7Var.n(e, true);
                                                                    if (sQLiteCursor == null) {
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        sQLiteCursor2 = queryFinalized;
                                                    }
                                                    byteBufferValue.reuse();
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    jf7Var4.n(e, true);
                                                    sQLiteCursor2.dispose();
                                                    jf7Var4.C(arrayList5, true);
                                                    jf7Var = jf7Var4;
                                                    hl.c3(new ba7((Object) jf7Var, (Object) arrayList4, j3, (Object) arrayList, (byte) 22));
                                                    jf7Var2 = jf7Var;
                                                    jf7Var2.N0(0, 0, j3, arrayList, false);
                                                    jf7Var2 = jf7Var2;
                                                    jf7Var2.P1(j3, wf3.y(j3) ? -j3 : 0L, arrayList, null);
                                                    jf7Var = jf7Var2;
                                                    jf7Var.getFileLoader().getClass();
                                                    xb4.p(0, arrayList2);
                                                    if (arrayList.isEmpty()) {
                                                    }
                                                }
                                                arrayList2 = arrayList3;
                                            } else {
                                                sQLiteCursor2 = queryFinalized;
                                                arrayList2 = arrayList3;
                                            }
                                            queryFinalized = sQLiteCursor2;
                                            arrayList3 = arrayList2;
                                        } catch (Exception e8) {
                                            e = e8;
                                            sQLiteCursor2 = queryFinalized;
                                        }
                                    }
                                    sQLiteCursor2 = queryFinalized;
                                    arrayList2 = arrayList3;
                                    sQLiteCursor2.dispose();
                                    jf7Var4.C(arrayList5, true);
                                    jf7Var = jf7Var4;
                                    try {
                                        hl.c3(new ba7((Object) jf7Var, (Object) arrayList4, j3, (Object) arrayList, (byte) 22));
                                        jf7Var2 = jf7Var;
                                    } catch (Exception e9) {
                                        e = e9;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor2 = queryFinalized;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor2 = queryFinalized;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            jf7Var = jf7Var4;
                        }
                        try {
                            jf7Var2.N0(0, 0, j3, arrayList, false);
                            jf7Var2 = jf7Var2;
                            jf7Var2.P1(j3, wf3.y(j3) ? -j3 : 0L, arrayList, null);
                            jf7Var = jf7Var2;
                            jf7Var.getFileLoader().getClass();
                            xb4.p(0, arrayList2);
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            hl.c3(new se7(jf7Var, arrayList, j3, (byte) 8));
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            jf7Var = jf7Var2;
                            sQLiteCursor = null;
                            jf7Var.n(e, true);
                            if (sQLiteCursor == null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor = null;
                    }
                    break;
                default:
                    try {
                        SQLiteCursor queryFinalized2 = jf7Var3.b.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j, new Object[0]);
                        int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                        queryFinalized2.dispose();
                        if (j2 != intValue) {
                            SQLiteDatabase sQLiteDatabase3 = jf7Var3.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase3.executeFast("REPLACE INTO dialog_settings VALUES(" + j + ", " + j2 + ")").stepThis().dispose();
                            jf7Var3.q1(true);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        jf7Var3.n(e13, true);
                        return;
                    }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
