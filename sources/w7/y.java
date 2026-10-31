package w7;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class y {
    public static b2.b1 a(b2.b1 b1Var, b2.b1 b1Var2) {
        if (b1Var != null) {
            b2.v vVar = b1Var.a;
            if (b1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < vVar.a.size(); i10++) {
                    if (b1Var2.a(vVar.a(i10))) {
                        int a2 = vVar.a(i10);
                        v7.t6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.t6.p(!false);
                return new b2.b1(new b2.v(sparseBooleanArray));
            }
        }
        return b2.b1.b;
    }

    public static void b(b2.f1 f1Var, m4.x xVar) {
        int i10 = xVar.b;
        long j10 = xVar.c;
        e9.n0 n0Var = xVar.a;
        if (i10 == -1) {
            if (f1Var.n0(20)) {
                f1Var.L0(n0Var);
                return;
            } else {
                if (n0Var.isEmpty()) {
                    return;
                }
                f1Var.k0((b2.p0) n0Var.get(0));
                return;
            }
        }
        if (f1Var.n0(20)) {
            f1Var.U(n0Var, xVar.b, j10);
        } else {
            if (n0Var.isEmpty()) {
                return;
            }
            f1Var.i((b2.p0) n0Var.get(0), j10);
        }
    }
}
