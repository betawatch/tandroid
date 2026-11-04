package u5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.ui.Components.hr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements d, v5.c, c {
    public static final k5.c f = new k5.c("proto");
    public final i a;
    public final w5.a b;
    public final w5.a c;
    public final a d;
    public final cd.a e;

    public g(w5.a aVar, w5.a aVar2, a aVar3, i iVar, cd.a aVar4) {
        this.a = iVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, n5.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(x5.a.a(iVar.c))));
        byte[] bArr = iVar.b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object h(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.a;
        Objects.requireNonNull(iVar);
        w5.a aVar = this.c;
        long o10 = aVar.o();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.o() >= this.d.c + o10) {
                    throw new v5.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(e eVar) {
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            Object apply = eVar.apply(a10);
            a10.setTransactionSuccessful();
            return apply;
        } finally {
            a10.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, n5.i iVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i3)), new hr(this, arrayList, iVar, 10));
        return arrayList;
    }

    public final void e(long j10, q5.c cVar, String str) {
        c(new ci.i(str, cVar, j10, 10));
    }

    public final Object f(v5.b bVar) {
        SQLiteDatabase a10 = a();
        w5.a aVar = this.c;
        long o10 = aVar.o();
        while (true) {
            try {
                a10.beginTransaction();
                try {
                    Object d = bVar.d();
                    a10.setTransactionSuccessful();
                    return d;
                } finally {
                    a10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.o() >= this.d.c + o10) {
                    throw new v5.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
