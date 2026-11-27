// default package

import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
