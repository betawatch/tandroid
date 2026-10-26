package v9;

import aa.d1;
import android.util.Log;
import bi.i;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.voip.j1;
import s9.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new j1(this, 23));
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
