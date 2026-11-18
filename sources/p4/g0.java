package p4;

import android.os.Bundle;
import c8.t9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ g0(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // p4.l0
    public final void f(v vVar) {
        int i7 = this.a;
        m0 m0Var = this.b;
        switch (i7) {
            case 0:
                m0Var.h.n(vVar);
                break;
            case 1:
                d0 d0Var = m0Var.h;
                if (d0Var.t.S0() != null) {
                    w7.s sVar = d0Var.e;
                    d0Var.s(vVar);
                    sVar.getClass();
                    t9.b(new o1(-6));
                    break;
                }
                break;
            case 2:
                m0Var.h.t.U();
                break;
            case 3:
                m0Var.h.t.E();
                break;
            case 4:
                m0Var.h.t.J0();
                break;
            case 5:
                m0Var.h.t.L0();
                break;
            case 6:
                m0Var.h.g(vVar, true);
                break;
            case 7:
                m0Var.h.t.a();
                break;
            case 8:
                m0Var.h.t.stop();
                break;
            case 9:
                d0 d0Var2 = m0Var.h;
                i1 i1Var = d0Var2.t;
                if (!h2.l0.c0(i1Var, d0Var2.p)) {
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
                m0Var.h.t.H0();
                break;
            case 11:
                m0Var.h.t.g0();
                break;
            default:
                i1 i1Var2 = m0Var.h.t;
                String str = h2.l0.a;
                if (i1Var2 != null && i1Var2.p0(1)) {
                    i1Var2.b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0(m0 m0Var, e2.d1 d1Var) {
        this.a = 1;
        this.b = m0Var;
    }

    public /* synthetic */ g0(m0 m0Var, k1 k1Var, Bundle bundle) {
        this.a = 0;
        this.b = m0Var;
    }
}
