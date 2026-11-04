package u4;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // u4.m0
    public boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        int i3;
        int i10;
        if (t0Var != null && ((i3 = t0Var.a) != (i10 = t0Var2.a) || t0Var.b != t0Var2.b || this.n)) {
            return r(d1Var, t0Var, i3, t0Var.b, i10, t0Var2.b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, d2.t0 t0Var, int i3, int i10, int i11, int i12);

    public abstract boolean r(d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12);

    public abstract void s(d1 d1Var, d2.t0 t0Var);

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
