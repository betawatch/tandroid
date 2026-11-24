// default package

import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vo4 {
    public static final uo4 a = uo4.a;

    public static uo4 a(bn4 bn4Var) {
        while (bn4Var != null) {
            if (bn4Var.t()) {
                bn4Var.p();
            }
            bn4Var = bn4Var.N;
        }
        return a;
    }

    public static void b(lo4 lo4Var) {
        if (go4.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(lo4Var.a.getClass().getName()), lo4Var);
        }
    }

    public static final void c(bn4 bn4Var, String str) {
        str.getClass();
        b(new lo4(bn4Var, "Attempting to reuse fragment " + bn4Var + " with previous ID " + str));
        a(bn4Var).getClass();
    }
}
