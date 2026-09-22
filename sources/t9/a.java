package t9;

import android.util.Log;
import ci.t9;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Cells.q3;
import q9.p;
import r5.e;
import y9.b1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new e(this, 3));
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
        String i10 = q3.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i10, null);
        }
        this.a.a(new t9(str, j3, b1Var, 9));
    }
}
