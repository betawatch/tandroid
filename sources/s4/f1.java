package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class f1 extends m0 {
    public boolean m;
    public boolean n;

    public f1() {
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

    @Override // s4.m0
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.a) != (i11 = q0Var2.a) || q0Var.b != q0Var2.b || this.n)) {
            return r(c1Var, q0Var, i10, q0Var.b, i11, q0Var2.b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        return !this.m || c1Var.h();
    }

    public final void u(c1 c1Var) {
        w(c1Var);
        d(c1Var);
    }

    public final void v(c1 c1Var) {
        x(c1Var);
        d(c1Var);
    }

    public void y() {
    }

    public void w(c1 c1Var) {
    }

    public void x(c1 c1Var) {
    }
}
