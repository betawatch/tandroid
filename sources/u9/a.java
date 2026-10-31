package u9;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import r9.p;
import rh.d0;
import sc.e;
import z9.b1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public static final c c = new c();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new d0(this, 20));
    }

    public final c a(String str) {
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
        String h = e.h("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", h, null);
        }
        this.a.a(new org.telegram.messenger.voip.d0(str, j10, b1Var, 10));
    }
}
