// default package

import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class zq4 {
    public static final yq4 a = yq4.a;

    public static yq4 a(gp4 gp4Var) {
        while (gp4Var != null) {
            if (gp4Var.t()) {
                gp4Var.p();
            }
            gp4Var = gp4Var.N;
        }
        return a;
    }

    public static void b(pq4 pq4Var) {
        if (kq4.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(pq4Var.a.getClass().getName()), pq4Var);
        }
    }

    public static final void c(gp4 gp4Var, String str) {
        str.getClass();
        b(new pq4(gp4Var, "Attempting to reuse fragment " + gp4Var + " with previous ID " + str));
        a(gp4Var).getClass();
    }
}
