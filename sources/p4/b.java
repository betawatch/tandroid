package p4;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final e0 b;
    public final Executor c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public b(Context context, e0 e0Var) {
        this.a = context.getApplicationContext();
        this.b = e0Var;
        Executor e10 = h2.a.e();
        this.c = e10;
        this.d = new androidx.mediarouter.app.f(this, 10);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        e10.execute(new a(this, 1));
    }

    public static /* synthetic */ void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.a;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(fVar, intentFilter, 2);
        } else {
            context.registerReceiver(fVar, intentFilter);
        }
        bVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        Cursor query;
        AtomicBoolean atomicBoolean = this.e;
        boolean z9 = atomicBoolean.get();
        boolean z10 = false;
        try {
            query = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
        } catch (Exception unused) {
        }
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("CarConnectionState");
                if (columnIndex != -1 && query.moveToNext()) {
                    boolean z11 = query.getInt(columnIndex) != 0;
                    query.close();
                    z10 = z11;
                    atomicBoolean.set(z10);
                    if (z9 != z10 || this.f.get()) {
                    }
                    this.b.run();
                    return;
                }
            } finally {
            }
        }
        query.close();
        atomicBoolean.set(z10);
        if (z9 != z10) {
        }
    }
}
