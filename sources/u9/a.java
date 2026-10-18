package u9;

import ai.f;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import qg.g0;
import r9.p;
import z9.b1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new g0(this, 18));
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

    public final void d(String str, long j10, b1 b1Var) {
        String h = r4.c.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.a.a(new f(str, j10, b1Var, 10));
    }
}
