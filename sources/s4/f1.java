package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // s4.l0
    public boolean a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        int i10;
        int i11;
        if (gVar != null && ((i10 = gVar.a) != (i11 = gVar2.a) || gVar.b != gVar2.b || this.n)) {
            return r(c1Var, gVar, i10, gVar.b, i11, gVar2.b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, ac.g gVar);

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
