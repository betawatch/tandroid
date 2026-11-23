package p4;

import android.os.Bundle;
import c8.t9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ h0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // p4.m0
    public final void f(v vVar) {
        int i7 = this.a;
        n0 n0Var = this.b;
        switch (i7) {
            case 0:
                n0Var.h.n(vVar);
                break;
            case 1:
                e0 e0Var = n0Var.h;
                if (e0Var.t.S0() != null) {
                    w7.s sVar = e0Var.e;
                    e0Var.s(vVar);
                    sVar.getClass();
                    t9.b(new o1(-6));
                    break;
                }
                break;
            case 2:
                n0Var.h.t.U();
                break;
            case 3:
                n0Var.h.t.E();
                break;
            case 4:
                n0Var.h.t.J0();
                break;
            case 5:
                n0Var.h.t.L0();
                break;
            case 6:
                n0Var.h.g(vVar, true);
                break;
            case 7:
                n0Var.h.t.a();
                break;
            case 8:
                n0Var.h.t.stop();
                break;
            case 9:
                e0 e0Var2 = n0Var.h;
                i1 i1Var = e0Var2.t;
                if (!h2.l0.c0(i1Var, e0Var2.p)) {
                    if (i1Var != null && i1Var.p0(1)) {
                        i1Var.b();
                        break;
                    }
                } else {
                    h2.l0.J(i1Var);
                    break;
                }
                break;
            case 10:
                n0Var.h.t.H0();
                break;
            case 11:
                n0Var.h.t.g0();
                break;
            default:
                i1 i1Var2 = n0Var.h.t;
                String str = h2.l0.a;
                if (i1Var2 != null && i1Var2.p0(1)) {
                    i1Var2.b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h0(n0 n0Var, e2.d1 d1Var) {
        this.a = 1;
        this.b = n0Var;
    }

    public /* synthetic */ h0(n0 n0Var, k1 k1Var, Bundle bundle) {
        this.a = 0;
        this.b = n0Var;
    }
}
