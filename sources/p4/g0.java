package p4;

import android.os.Bundle;
import c8.s9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    pb.b bVar = d0Var.e;
                    d0Var.s(vVar);
                    bVar.getClass();
                    s9.b(new m1(-6));
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
                g1 g1Var = d0Var2.t;
                if (!h2.m0.c0(g1Var, d0Var2.p)) {
                    if (g1Var != null && g1Var.p0(1)) {
                        g1Var.b();
                        break;
                    }
                } else {
                    h2.m0.J(g1Var);
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
                g1 g1Var2 = m0Var.h.t;
                String str = h2.m0.a;
                if (g1Var2 != null && g1Var2.p0(1)) {
                    g1Var2.b();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0(m0 m0Var, e2.d1 d1Var) {
        this.a = 1;
        this.b = m0Var;
    }

    public /* synthetic */ g0(m0 m0Var, i1 i1Var, Bundle bundle) {
        this.a = 0;
        this.b = m0Var;
    }
}
