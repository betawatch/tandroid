// default package

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ve7 implements Runnable {
    public final /* synthetic */ jf7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ve7(jf7 jf7Var, int i, ArrayList arrayList, int i2, int i3, int i4) {
        this.a = jf7Var;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteCursor queryFinalized;
        long j;
        jf7 jf7Var = this.a;
        int i = this.b;
        boolean z = this.d;
        int i2 = this.f;
        try {
            long E = wf3.E(i);
            SparseArray sparseArray = new SparseArray();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = this.c;
            int i3 = this.e;
            int i4 = 0;
            if (arrayList2 == null) {
                SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase3.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE uid = " + E + " AND out = " + (z ? 1 : 0) + " AND read_state > 0 AND ttl > 0 AND date <= " + i3 + " AND send_state = 0 AND media != 1", new Object[0]);
            } else {
                String join = TextUtils.join(",", arrayList2);
                SQLiteDatabase sQLiteDatabase4 = jf7Var.b;
                Locale locale2 = Locale.US;
                queryFinalized = sQLiteDatabase4.queryFinalized("SELECT m.mid, m.ttl FROM messages_v2 as m INNER JOIN randoms_v2 as r ON m.mid = r.mid AND m.uid = r.uid WHERE r.random_id IN (" + join + ")", new Object[0]);
            }
            int i5 = Integer.MAX_VALUE;
            while (queryFinalized.next()) {
                try {
                    int intValue = queryFinalized.intValue(1);
                    int intValue2 = queryFinalized.intValue(i4);
                    if (arrayList2 != null) {
                        arrayList.add(Integer.valueOf(intValue2));
                    }
                    if (intValue > 0) {
                        int max = Math.max(i3, i2) + intValue;
                        i5 = Math.min(i5, max);
                        ArrayList arrayList3 = (ArrayList) sparseArray.get(max);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            sparseArray.put(max, arrayList3);
                        }
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(intValue2);
                        arrayList3.add(Integer.valueOf(intValue2));
                    }
                    i4 = 0;
                } catch (Exception e) {
                    e = e;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    try {
                        jf7Var.n(e, true);
                        sQLiteDatabase2 = jf7Var.b;
                        if (sQLiteDatabase2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = jf7Var.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    sQLiteDatabase = jf7Var.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                j = E;
                hl.c3(new se7(jf7Var, j, arrayList, (byte) 3));
            } else {
                j = E;
            }
            if (sparseArray.size() != 0) {
                jf7Var.b.beginTransaction();
                SQLitePreparedStatement executeFast = jf7Var.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                    try {
                        int keyAt = sparseArray.keyAt(i6);
                        ArrayList arrayList4 = (ArrayList) sparseArray.get(keyAt);
                        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                            executeFast.requery();
                            executeFast.bindInteger(1, ((Integer) arrayList4.get(i7)).intValue());
                            executeFast.bindLong(2, j);
                            executeFast.bindInteger(3, keyAt);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        jf7Var.n(e, true);
                        sQLiteDatabase2 = jf7Var.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor == null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = executeFast;
                        sQLiteCursor = null;
                        sQLiteDatabase = jf7Var.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                jf7Var.b.commitTransaction();
                SQLiteDatabase sQLiteDatabase5 = jf7Var.b;
                Locale locale3 = Locale.US;
                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid IN(" + sb.toString() + ") AND uid = " + j).stepThis().dispose();
                jf7Var.getMessagesController().m0(i5, j, sparseArray);
            }
            SQLiteDatabase sQLiteDatabase6 = jf7Var.b;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
        } catch (Exception e3) {
            e = e3;
            sQLitePreparedStatement = null;
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = null;
        }
    }
}
