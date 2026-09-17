package t1;

import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class c {
    public static final b a = b.a;

    public static b a(r rVar) {
        while (rVar != null) {
            if (rVar.t()) {
                rVar.p();
            }
            rVar = rVar.M;
        }
        return a;
    }

    public static void b(a aVar) {
        if (i0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.a.getClass().getName()), aVar);
        }
    }

    public static final void c(r rVar, String previousFragmentId) {
        i.e(previousFragmentId, "previousFragmentId");
        b(new a(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + previousFragmentId));
        a(rVar).getClass();
    }
}
