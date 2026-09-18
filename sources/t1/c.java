package t1;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class c {
    public static final b a = b.a;

    public static b a(s sVar) {
        while (sVar != null) {
            if (sVar.t()) {
                sVar.p();
            }
            sVar = sVar.M;
        }
        return a;
    }

    public static void b(a aVar) {
        if (k0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.a.getClass().getName()), aVar);
        }
    }

    public static final void c(s sVar, String previousFragmentId) {
        i.e(previousFragmentId, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + previousFragmentId));
        a(sVar).getClass();
    }
}
