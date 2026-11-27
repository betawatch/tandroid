// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;

    public /* synthetic */ zc7(jf7 jf7Var, int i, int i2, int i3, int i4, long j) {
        this.a = (byte) 1;
        this.b = jf7Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.h = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        jf7 jf7Var;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int intValue;
        int intValue2;
        long longValue;
        int i;
        int max;
        SQLitePreparedStatement executeFast;
        long j;
        int intValue3;
        jf7 jf7Var2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLitePreparedStatement sQLitePreparedStatement4;
        byte b = this.a;
        int i2 = this.f;
        int i3 = this.e;
        int i4 = this.d;
        int i5 = this.c;
        switch (b) {
            case 0:
                jf7 jf7Var3 = this.b;
                long j2 = this.h;
                try {
                    SQLiteCursor queryFinalized = jf7Var3.b.queryFinalized("SELECT unread_count, inbox_max, last_mid FROM dialogs WHERE did = " + j2, new Object[0]);
                    try {
                        if (queryFinalized.next()) {
                            try {
                                intValue = queryFinalized.intValue(0);
                                intValue2 = queryFinalized.intValue(1);
                                longValue = queryFinalized.longValue(2);
                                i = intValue;
                            } catch (Exception e) {
                                e = e;
                                jf7Var = jf7Var3;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                try {
                                    jf7Var.n(e, true);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    sQLiteDatabase2 = jf7Var.b;
                                    if (sQLiteDatabase2 == null) {
                                    }
                                    sQLiteDatabase2.commitTransaction();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    sQLiteDatabase = jf7Var.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                jf7Var = jf7Var3;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = jf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            longValue = 0;
                            intValue = 0;
                            intValue2 = 0;
                            i = 0;
                        }
                        queryFinalized.dispose();
                        jf7Var3.b.beginTransaction();
                        if (wf3.B(j2)) {
                            executeFast = jf7Var3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid >= ? AND read_state IN(0,2) AND out = 0");
                            try {
                                executeFast.requery();
                                executeFast.bindLong(1, j2);
                                executeFast.bindInteger(2, i2);
                                executeFast.step();
                                executeFast.dispose();
                                if (i2 <= longValue) {
                                    max = 0;
                                    sQLiteCursor = null;
                                } else {
                                    sQLiteCursor = jf7Var3.b.queryFinalized("SELECT changes()", new Object[0]);
                                    try {
                                        if (sQLiteCursor.next()) {
                                            try {
                                                intValue3 = sQLiteCursor.intValue(0) + i4;
                                            } catch (Exception e2) {
                                                e = e2;
                                                jf7Var = jf7Var3;
                                                sQLitePreparedStatement = null;
                                                jf7Var.n(e, true);
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase2 = jf7Var.b;
                                                if (sQLiteDatabase2 == null) {
                                                }
                                                sQLiteDatabase2.commitTransaction();
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                jf7Var = jf7Var3;
                                                sQLitePreparedStatement = null;
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLiteCursor != null) {
                                                }
                                                sQLiteDatabase = jf7Var.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            intValue3 = 0;
                                        }
                                        sQLiteCursor.dispose();
                                        max = Math.max(0, intValue - intValue3);
                                    } catch (Exception e3) {
                                        e = e3;
                                        jf7Var = jf7Var3;
                                        sQLitePreparedStatement2 = null;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        jf7Var.n(e, true);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase2 = jf7Var.b;
                                        if (sQLiteDatabase2 == null) {
                                        }
                                        sQLiteDatabase2.commitTransaction();
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        jf7Var = jf7Var3;
                                        sQLitePreparedStatement2 = null;
                                        sQLitePreparedStatement = sQLitePreparedStatement2;
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        sQLiteDatabase = jf7Var.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                jf7Var = jf7Var3;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = executeFast;
                                jf7Var.n(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = jf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                jf7Var = jf7Var3;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = executeFast;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = jf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            try {
                                i2 = Math.max(intValue2, i5);
                                sQLitePreparedStatement = jf7Var3.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND mid <= ? AND read_state IN(0,2) AND out = 0");
                                try {
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j2);
                                    sQLitePreparedStatement.bindInteger(2, i2);
                                    sQLitePreparedStatement.step();
                                    sQLitePreparedStatement.dispose();
                                    if (i2 >= longValue) {
                                        max = 0;
                                        sQLiteCursor = null;
                                    } else {
                                        try {
                                            sQLiteCursor = jf7Var3.b.queryFinalized("SELECT changes()", new Object[0]);
                                        } catch (Exception e5) {
                                            e = e5;
                                            sQLitePreparedStatement = sQLitePreparedStatement;
                                            jf7Var = jf7Var3;
                                            sQLiteCursor = null;
                                            jf7Var.n(e, true);
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            sQLiteDatabase2 = jf7Var.b;
                                            if (sQLiteDatabase2 == null) {
                                                return;
                                            }
                                            sQLiteDatabase2.commitTransaction();
                                            return;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLitePreparedStatement = sQLitePreparedStatement;
                                            jf7Var = jf7Var3;
                                            sQLiteCursor = null;
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase = jf7Var.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            int intValue4 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) + i4 : 0;
                                            sQLiteCursor.dispose();
                                            max = Math.max(0, intValue - intValue4);
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLitePreparedStatement = sQLitePreparedStatement;
                                            jf7Var = jf7Var3;
                                            jf7Var.n(e, true);
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase2 = jf7Var.b;
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            sQLiteDatabase2.commitTransaction();
                                            return;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLitePreparedStatement = sQLitePreparedStatement;
                                            jf7Var = jf7Var3;
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            sQLiteDatabase = jf7Var.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    executeFast = jf7Var3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                                } catch (Exception e7) {
                                    e = e7;
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                jf7Var = jf7Var3;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                jf7Var.n(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = jf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                                jf7Var = jf7Var3;
                                sQLiteCursor = null;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = jf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                            try {
                                executeFast.requery();
                                executeFast.bindLong(1, j2);
                                executeFast.bindInteger(2, i2);
                                executeFast.step();
                                executeFast.dispose();
                                SQLitePreparedStatement executeFast2 = jf7Var3.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND date <= ?");
                                executeFast2.requery();
                                executeFast2.bindLong(1, j2);
                                executeFast2.bindInteger(2, i3);
                                executeFast2.step();
                                executeFast2.dispose();
                            } catch (Exception e9) {
                                e = e9;
                                jf7Var = jf7Var3;
                                sQLitePreparedStatement = executeFast;
                                jf7Var.n(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = jf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th10) {
                                th = th10;
                                jf7Var = jf7Var3;
                                sQLitePreparedStatement = executeFast;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = jf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast = jf7Var3.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ? WHERE did = ?");
                        executeFast.requery();
                        executeFast.bindInteger(1, max);
                        executeFast.bindInteger(2, i2);
                        executeFast.bindLong(3, j2);
                        executeFast.step();
                        executeFast.dispose();
                        jf7Var3.b.commitTransaction();
                        if (jf7Var3.r0(14, j2)) {
                            long j3 = i2;
                            jf7Var = jf7Var3;
                            j = j2;
                            try {
                                jf7Var.d2(j, intValue2, j3);
                            } catch (Exception e10) {
                                e = e10;
                                sQLitePreparedStatement = null;
                                jf7Var.n(e, true);
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase2 = jf7Var.b;
                                if (sQLiteDatabase2 == null) {
                                }
                                sQLiteDatabase2.commitTransaction();
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                sQLitePreparedStatement = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                sQLiteDatabase = jf7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            jf7Var = jf7Var3;
                            j = j2;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        jf7Var = jf7Var3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor = queryFinalized;
                    } catch (Throwable th12) {
                        th = th12;
                        jf7Var = jf7Var3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor = queryFinalized;
                    }
                } catch (Exception e12) {
                    e = e12;
                    jf7Var = jf7Var3;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                } catch (Throwable th13) {
                    th = th13;
                    jf7Var = jf7Var3;
                    sQLiteCursor = null;
                    sQLitePreparedStatement = null;
                }
                if (i != 0 && max == 0) {
                    try {
                    } catch (Exception e13) {
                        e = e13;
                        sQLitePreparedStatement2 = null;
                        sQLitePreparedStatement = sQLitePreparedStatement2;
                        jf7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        sQLiteDatabase2 = jf7Var.b;
                        if (sQLiteDatabase2 == null) {
                        }
                        sQLiteDatabase2.commitTransaction();
                        return;
                    } catch (Throwable th14) {
                        th = th14;
                        sQLitePreparedStatement2 = null;
                        sQLitePreparedStatement = sQLitePreparedStatement2;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        sQLiteDatabase = jf7Var.b;
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                    if (!jf7Var.r0(13, j)) {
                        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                        longSparseIntArray.put(j, max);
                        sQLitePreparedStatement2 = null;
                        try {
                            jf7Var.T1(longSparseIntArray, null, true);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j));
                            jf7Var.i2(arrayList);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            sQLiteDatabase2 = jf7Var.b;
                            if (sQLiteDatabase2 == null) {
                                return;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            sQLiteDatabase2 = jf7Var.b;
                            if (sQLiteDatabase2 == null) {
                            }
                            sQLiteDatabase2.commitTransaction();
                            return;
                        } catch (Throwable th15) {
                            th = th15;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            sQLiteDatabase = jf7Var.b;
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                        sQLiteDatabase2.commitTransaction();
                        return;
                    }
                }
                sQLitePreparedStatement2 = null;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(j));
                jf7Var.i2(arrayList2);
                if (sQLiteCursor != null) {
                }
                sQLiteDatabase2 = jf7Var.b;
                if (sQLiteDatabase2 == null) {
                }
                sQLiteDatabase2.commitTransaction();
                return;
            case 1:
                jf7 jf7Var4 = this.b;
                long j4 = this.h;
                try {
                    try {
                        int max2 = Math.max(i5, i4) + i3;
                        SparseArray sparseArray = new SparseArray();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(i2));
                        sparseArray.put(max2, arrayList3);
                        jf7Var2 = jf7Var4;
                        try {
                            hl.c3(new se7(jf7Var2, j4, arrayList3, (byte) 6));
                            SQLitePreparedStatement executeFast3 = jf7Var2.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                                try {
                                    int keyAt = sparseArray.keyAt(i6);
                                    ArrayList arrayList4 = (ArrayList) sparseArray.get(keyAt);
                                    for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                                        executeFast3.requery();
                                        executeFast3.bindInteger(1, ((Integer) arrayList4.get(i7)).intValue());
                                        executeFast3.bindLong(2, j4);
                                        executeFast3.bindInteger(3, keyAt);
                                        executeFast3.bindInteger(4, 1);
                                        executeFast3.step();
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    sQLitePreparedStatement3 = executeFast3;
                                    try {
                                        jf7Var2.n(e, true);
                                        if (sQLitePreparedStatement3 == null) {
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        if (sQLitePreparedStatement3 != null) {
                                            sQLitePreparedStatement3.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    sQLitePreparedStatement3 = executeFast3;
                                    if (sQLitePreparedStatement3 != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast3.dispose();
                            SQLiteDatabase sQLiteDatabase3 = jf7Var2.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i2 + " AND uid = " + j4).stepThis().dispose();
                            jf7Var2.getMessagesController().m0(max2, j4, sparseArray);
                            return;
                        } catch (Exception e16) {
                            e = e16;
                            sQLitePreparedStatement3 = null;
                            jf7Var2.n(e, true);
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement3.dispose();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        sQLitePreparedStatement3 = null;
                    }
                } catch (Exception e17) {
                    e = e17;
                    jf7Var2 = jf7Var4;
                }
            default:
                jf7 jf7Var5 = this.b;
                long j5 = this.h;
                try {
                    try {
                        sQLitePreparedStatement4 = jf7Var5.b.executeFast("REPLACE INTO widget_heights VALUES(?, ?, ?, ?, ?, ?)");
                        try {
                            sQLitePreparedStatement4.bindLong(1, j5);
                            sQLitePreparedStatement4.bindInteger(2, i5);
                            sQLitePreparedStatement4.bindInteger(3, i4);
                            sQLitePreparedStatement4.bindInteger(4, i3);
                            sQLitePreparedStatement4.bindLong(5, System.currentTimeMillis());
                            sQLitePreparedStatement4.bindInteger(6, i2);
                            sQLitePreparedStatement4.step();
                            sQLitePreparedStatement4.dispose();
                            SQLiteDatabase sQLiteDatabase4 = jf7Var5.b;
                            Locale locale2 = Locale.US;
                            sQLiteDatabase4.executeFast("DELETE FROM widget_heights WHERE uid = " + j5 + " AND mid = " + i5 + " AND width NOT IN (SELECT width FROM widget_heights WHERE uid = " + j5 + " AND mid = " + i5 + " ORDER BY date DESC LIMIT 4)").stepThis().dispose();
                        } catch (Exception e18) {
                            e = e18;
                            jf7Var5.n(e, true);
                            if (sQLitePreparedStatement4 != null) {
                                sQLitePreparedStatement4.dispose();
                            }
                            return;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        if (sQLitePreparedStatement4 != null) {
                            sQLitePreparedStatement4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e19) {
                    e = e19;
                    sQLitePreparedStatement4 = null;
                } catch (Throwable th20) {
                    th = th20;
                    sQLitePreparedStatement4 = null;
                    if (sQLitePreparedStatement4 != null) {
                    }
                    throw th;
                }
                return;
        }
    }

    public /* synthetic */ zc7(jf7 jf7Var, long j, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.h = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
