package w1;

import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class c {
    public static final b a = b.a;

    public static b a(s sVar) {
        while (sVar != null) {
            if (sVar.t()) {
                sVar.p();
            }
            sVar = sVar.N;
        }
        return a;
    }

    public static void b(a aVar) {
        if (j0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.a.getClass().getName()), aVar);
        }
    }

    public static final void c(s sVar, String previousFragmentId) {
        j.e(previousFragmentId, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + previousFragmentId));
        a(sVar).getClass();
    }
}
