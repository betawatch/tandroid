package w9;

import android.util.Log;
import ca.p1;
import ci.i;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.e3;
import t9.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static final c c = new c();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new e3(this, 28));
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

    public final void d(String str, long j10, p1 p1Var) {
        String f10 = t4.c.f("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", f10, null);
        }
        this.a.a(new i(str, j10, p1Var, 11));
    }
}
