package p4;

import android.os.Bundle;
import c8.u9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ g0(n0 n0Var, int i7) {
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
                d0 d0Var = n0Var.h;
                if (d0Var.t.S0() != null) {
                    w7.s sVar = d0Var.e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    u9.b(new n1(-6));
                    break;
                }
                break;
            case 2:
                n0Var.h.t.V();
                break;
            case 3:
                n0Var.h.t.F();
                break;
            case 4:
                n0Var.h.t.K0();
                break;
            case 5:
                n0Var.h.t.M0();
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
                d0 d0Var2 = n0Var.h;
                h1 h1Var = d0Var2.t;
                if (!h2.l0.c0(h1Var, d0Var2.p)) {
                    if (h1Var != null && h1Var.q0(1)) {
                        h1Var.b();
                        break;
                    }
                } else {
                    h2.l0.J(h1Var);
                    break;
                }
                break;
            case 10:
                n0Var.h.t.I0();
                break;
            case 11:
                n0Var.h.t.h0();
                break;
            default:
                h1 h1Var2 = n0Var.h.t;
                String str = h2.l0.a;
                if (h1Var2 != null && h1Var2.q0(1)) {
                    h1Var2.b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0(n0 n0Var, e2.d1 d1Var) {
        this.a = 1;
        this.b = n0Var;
    }

    public /* synthetic */ g0(n0 n0Var, j1 j1Var, Bundle bundle) {
        this.a = 0;
        this.b = n0Var;
    }
}
