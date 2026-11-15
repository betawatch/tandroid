package v4;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    @Override // v4.m0
    public boolean a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.a) != (i10 = r0Var2.a) || r0Var.b != r0Var2.b || this.n)) {
            return r(e1Var, r0Var, i7, r0Var.b, i10, r0Var2.b);
        }
        p(e1Var);
        return true;
    }

    public abstract void p(e1 e1Var);

    public abstract boolean q(e1 e1Var, e1 e1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(e1 e1Var, e2.r0 r0Var);

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
