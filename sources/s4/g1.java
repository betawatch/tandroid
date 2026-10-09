package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class g1 extends n0 {
    public boolean m;
    public boolean n;

    public g1() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = 250L;
        this.l = 0L;
        this.m = true;
    }

    @Override // s4.n0
    public boolean a(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.a) != (i11 = q0Var2.a) || q0Var.b != q0Var2.b || this.n)) {
            return r(d1Var, q0Var, i10, q0Var.b, i11, q0Var2.b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(d1 d1Var, b2.q0 q0Var);

    public boolean t(d1 d1Var) {
        return !this.m || d1Var.h();
    }

    public final void u(d1 d1Var) {
        w(d1Var);
        d(d1Var);
    }

    public final void v(d1 d1Var) {
        x(d1Var);
        d(d1Var);
    }

    public void y() {
    }

    public void w(d1 d1Var) {
    }

    public void x(d1 d1Var) {
    }
}
