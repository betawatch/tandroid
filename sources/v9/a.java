package v9;

import aa.d1;
import android.util.Log;
import bi.i;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.voip.j1;
import s9.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final q a;
    public final AtomicReference b = new AtomicReference(null);

    public a(q qVar) {
        this.a = qVar;
        qVar.a(new j1(this, 23));
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

    public final void d(String str, long j10, d1 d1Var) {
        String j11 = b10.j("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", j11, null);
        }
        this.a.a(new i(str, j10, d1Var, 11));
    }
}
