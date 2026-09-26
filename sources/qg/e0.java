package qg;

import org.telegram.ui.ar0;
import org.telegram.ui.st0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class e0 implements pg.e1 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ st0 b;

    public e0(st0 st0Var, ar0 ar0Var) {
        this.b = st0Var;
        this.a = ar0Var;
    }

    @Override // pg.e1
    public final void a() {
        this.a.run();
    }

    @Override // pg.e1
    public final void b() {
        f0 f0Var = this.b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override // pg.e1
    public final void c() {
        st0 st0Var = this.b;
        if (st0Var.k1) {
            st0Var.k1 = false;
        } else {
            st0Var.t1.b(1);
            st0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.e1
    public final boolean d() {
        st0 st0Var = this.b;
        boolean z10 = st0Var.S0 == null;
        if (!z10) {
            st0Var.s0(null, true);
        }
        return z10;
    }

    @Override // pg.e1
    public final void e() {
        st0 st0Var = this.b;
        st0Var.F0.a.e();
        st0Var.l1.setViewHidden(false);
    }

    @Override // pg.e1
    public final void f() {
        st0 st0Var = this.b;
        if (st0Var.S0 != null) {
            st0Var.s0(null, true);
        }
        st0Var.l1.setViewHidden(true);
    }
}
