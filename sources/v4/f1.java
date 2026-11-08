package v4;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class f1 extends l0 {
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

    @Override // v4.l0
    public boolean a(d1 d1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.a) != (i10 = r0Var2.a) || r0Var.b != r0Var2.b || this.n)) {
            return r(d1Var, r0Var, i7, r0Var.b, i10, r0Var2.b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(d1 d1Var, e2.r0 r0Var);

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
