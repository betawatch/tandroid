package w7;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class v {
    public static b2.b1 a(b2.b1 b1Var, b2.b1 b1Var2) {
        if (b1Var != null) {
            b2.u uVar = b1Var.a;
            if (b1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < uVar.a.size(); i10++) {
                    if (b1Var2.a(uVar.a(i10))) {
                        int a2 = uVar.a(i10);
                        v7.u6.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                v7.u6.p(!false);
                return new b2.b1(new b2.u(sparseBooleanArray));
            }
        }
        return b2.b1.b;
    }

    public static void b(b2.f1 f1Var, m4.w wVar) {
        int i10 = wVar.b;
        long j10 = wVar.c;
        e9.n0 n0Var = wVar.a;
        if (i10 == -1) {
            if (f1Var.o0(20)) {
                f1Var.L0(n0Var);
                return;
            } else {
                if (n0Var.isEmpty()) {
                    return;
                }
                f1Var.l0((b2.o0) n0Var.get(0));
                return;
            }
        }
        if (f1Var.o0(20)) {
            f1Var.S(j10, wVar.b, n0Var);
        } else {
            if (n0Var.isEmpty()) {
                return;
            }
            f1Var.k((b2.o0) n0Var.get(0), j10);
        }
    }
}
