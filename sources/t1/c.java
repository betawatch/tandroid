package t1;

import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        if (j0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.a.getClass().getName()), aVar);
        }
    }

    public static final void c(s sVar, String previousFragmentId) {
        i.e(previousFragmentId, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + previousFragmentId));
        a(sVar).getClass();
    }
}
