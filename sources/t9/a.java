package t9;

import android.util.Log;
import ci.t9;
import java.util.concurrent.atomic.AtomicReference;
import q9.q;
import r5.d;
import v7.j0;
import y9.b1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final q a;
    public final AtomicReference b = new AtomicReference(null);

    public a(q qVar) {
        this.a = qVar;
        qVar.a(new d(this, 4));
    }

    public final b a(String str) {
        a aVar = (a) this.b.get();
        return aVar == null ? c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j3, b1 b1Var) {
        String g10 = j0.g("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", g10, null);
        }
        this.a.a(new t9(str, j3, b1Var, 9));
    }
}
