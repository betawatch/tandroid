package s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
    public boolean a(b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        int i10;
        int i11;
        if (u0Var != null && ((i10 = u0Var.a) != (i11 = u0Var2.a) || u0Var.b != u0Var2.b || this.n)) {
            return r(b1Var, u0Var, i10, u0Var.b, i11, u0Var2.b);
        }
        p(b1Var);
        return true;
    }

    public abstract void p(b1 b1Var);

    public abstract boolean q(b1 b1Var, b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract void s(b1 b1Var, b2.u0 u0Var);

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
