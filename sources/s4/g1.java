package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g1 extends m0 {
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

    @Override // s4.m0
    public boolean a(e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        if (v0Var != null && ((i10 = v0Var.a) != (i11 = v0Var2.a) || v0Var.b != v0Var2.b || this.n)) {
            return r(e1Var, v0Var, i10, v0Var.b, i11, v0Var2.b);
        }
        p(e1Var);
        return true;
    }

    public abstract void p(e1 e1Var);

    public abstract boolean q(e1 e1Var, e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract void s(e1 e1Var, b2.v0 v0Var);

    public boolean t(e1 e1Var) {
        return !this.m || e1Var.h();
    }

    public final void u(e1 e1Var) {
        w(e1Var);
        d(e1Var);
    }

    public final void v(e1 e1Var) {
        x(e1Var);
        d(e1Var);
    }

    public void y() {
    }

    public void w(e1 e1Var) {
    }

    public void x(e1 e1Var) {
    }
}
