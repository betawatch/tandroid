package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class e1 extends l0 {
    public boolean m;
    public boolean n;

    public e1() {
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

    @Override // s4.l0
    public boolean a(b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        if (v0Var != null && ((i10 = v0Var.a) != (i11 = v0Var2.a) || v0Var.b != v0Var2.b || this.n)) {
            return r(b1Var, v0Var, i10, v0Var.b, i11, v0Var2.b);
        }
        p(b1Var);
        return true;
    }

    public abstract void p(b1 b1Var);

    public abstract boolean q(b1 b1Var, b1 b1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract void s(b1 b1Var, b2.v0 v0Var);

    public boolean t(b1 b1Var) {
        return !this.m || b1Var.h();
    }

    public final void u(b1 b1Var) {
        w(b1Var);
        d(b1Var);
    }

    public final void v(b1 b1Var) {
        x(b1Var);
        d(b1Var);
    }

    public void y() {
    }

    public void w(b1 b1Var) {
    }

    public void x(b1 b1Var) {
    }
}
