// default package

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class za7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ za7(ad7 ad7Var, ArrayList arrayList, int i) {
        this.a = (byte) 1;
        this.b = ad7Var;
        this.c = arrayList;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v33 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Exception e;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase2;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r1 = null;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        int i = 0;
        ArrayList arrayList2 = this.c;
        int i2 = this.d;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                try {
                    ad7Var.b.beginTransaction();
                    ad7Var.b.executeFast("DELETE FROM shortcut_widget WHERE id = " + i2).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
                    if (arrayList2.isEmpty()) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i2);
                        executeFast2.bindLong(2, -1L);
                        executeFast2.bindInteger(3, 0);
                        executeFast2.step();
                    } else {
                        int size = arrayList2.size();
                        while (i < size) {
                            long j = ((zc7) arrayList2.get(i)).a;
                            executeFast2.requery();
                            executeFast2.bindInteger(1, i2);
                            executeFast2.bindLong(2, j);
                            executeFast2.bindInteger(3, i);
                            executeFast2.step();
                            i++;
                        }
                    }
                    executeFast2.dispose();
                    ad7Var.b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    ad7Var.n(e2, true);
                    return;
                }
            case 1:
                SQLitePreparedStatement sQLitePreparedStatement4 = "SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (";
                try {
                    try {
                        try {
                            arrayList = new ArrayList();
                            sQLiteDatabase2 = ad7Var.b;
                            Locale locale = Locale.US;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                    try {
                        SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT did, folder_id FROM dialogs WHERE pinned > 0 AND did NOT IN (" + TextUtils.join(",", arrayList2) + ")", new Object[0]);
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (queryFinalized.intValue(1) == i2 && !cf3.B(longValue) && !cf3.C(longValue)) {
                                    arrayList.add(Long.valueOf(queryFinalized.longValue(0)));
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor2 = queryFinalized;
                                sQLitePreparedStatement4 = 0;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                if (sQLitePreparedStatement4 != 0) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        sQLitePreparedStatement = ad7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            try {
                                long longValue2 = ((Long) arrayList.get(i3)).longValue();
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindInteger(1, 0);
                                sQLitePreparedStatement.bindLong(2, longValue2);
                                sQLitePreparedStatement.step();
                            } catch (Exception e5) {
                                e = e5;
                                ad7Var.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e6) {
                        e = e6;
                        sQLitePreparedStatement = null;
                        ad7Var.n(e, true);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement == null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement4 = 0;
                }
                break;
            default:
                try {
                    if (i2 == 1) {
                        try {
                            ad7Var.b.executeFast("DELETE FROM wallpapers2 WHERE num >= -1").stepThis().dispose();
                        } catch (Exception e7) {
                            e = e7;
                            ad7Var.n(e, true);
                            sQLiteDatabase = ad7Var.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement3.dispose();
                                return;
                            }
                            return;
                        }
                    }
                    ad7Var.b.beginTransaction();
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    executeFast = i2 != 0 ? sQLiteDatabase3.executeFast("REPLACE INTO wallpapers2 VALUES(?, ?, ?)") : sQLiteDatabase3.executeFast("UPDATE wallpapers2 SET data = ? WHERE uid = ?");
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i);
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wallPaper.getObjectSize());
                        wallPaper.serializeToStream(nativeByteBuffer);
                        if (i2 != 0) {
                            executeFast.bindLong(1, wallPaper.id);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            if (i2 < 0) {
                                executeFast.bindInteger(3, i2);
                            } else {
                                executeFast.bindInteger(3, i2 == 2 ? -1 : i);
                            }
                        } else {
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindLong(2, wallPaper.id);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        i++;
                    }
                    executeFast.dispose();
                    ad7Var.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    sQLitePreparedStatement3 = executeFast;
                    e = e8;
                    ad7Var.n(e, true);
                    sQLiteDatabase = ad7Var.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement3 == null) {
                    }
                } catch (Throwable th5) {
                    sQLitePreparedStatement2 = executeFast;
                    th = th5;
                    SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.commitTransaction();
                    }
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ za7(ad7 ad7Var, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.d = i;
        this.c = arrayList;
    }
}
