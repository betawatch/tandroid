package v5;

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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g implements d, w5.c, c {
    public static final l5.c f = new l5.c("proto");
    public final i a;
    public final x5.a b;
    public final x5.a c;
    public final a d;
    public final fd.a e;

    public g(x5.a aVar, x5.a aVar2, a aVar3, i iVar, fd.a aVar4) {
        this.a = iVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, o5.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(y5.a.a(iVar.c))));
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
        x5.a aVar = this.c;
        long s5 = aVar.s();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.s() >= this.d.c + s5) {
                    throw new w5.a("Timed out while trying to open db.", e10);
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

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, o5.i iVar, int i7) {
        ArrayList arrayList = new ArrayList();
        Long b10 = b(sQLiteDatabase, iVar);
        if (b10 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b10.toString()}, null, null, null, String.valueOf(i7)), new hr(this, arrayList, iVar, 14));
        return arrayList;
    }

    public final void e(long j3, r5.c cVar, String str) {
        c(new bi.i(str, cVar, j3, 10));
    }

    public final Object f(w5.b bVar) {
        SQLiteDatabase a10 = a();
        x5.a aVar = this.c;
        long s5 = aVar.s();
        while (true) {
            try {
                a10.beginTransaction();
                try {
                    Object h = bVar.h();
                    a10.setTransactionSuccessful();
                    return h;
                } finally {
                    a10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.s() >= this.d.c + s5) {
                    throw new w5.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
