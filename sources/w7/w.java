package w7;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class w {
    public static b2.c1 a(b2.c1 c1Var, b2.c1 c1Var2) {
        if (c1Var != null) {
            b2.v vVar = c1Var.a;
            if (c1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < vVar.a.size(); i10++) {
                    if (c1Var2.a(vVar.a(i10))) {
                        int a2 = vVar.a(i10);
                        v7.u6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.u6.p(!false);
                return new b2.c1(new b2.v(sparseBooleanArray));
            }
        }
        return b2.c1.b;
    }

    public static void b(b2.g1 g1Var, m4.x xVar) {
        int i10 = xVar.b;
        long j10 = xVar.c;
        e9.n0 n0Var = xVar.a;
        if (i10 == -1) {
            if (g1Var.o0(20)) {
                g1Var.L0(n0Var);
                return;
            } else {
                if (n0Var.isEmpty()) {
                    return;
                }
                g1Var.l0((b2.p0) n0Var.get(0));
                return;
            }
        }
        if (g1Var.o0(20)) {
            g1Var.S(j10, xVar.b, n0Var);
        } else {
            if (n0Var.isEmpty()) {
                return;
            }
            g1Var.k((b2.p0) n0Var.get(0), j10);
        }
    }
}
