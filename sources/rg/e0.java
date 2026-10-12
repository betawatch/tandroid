package rg;

import org.telegram.ui.hu0;
import org.telegram.ui.or0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e0 implements qg.b1 {
    public final /* synthetic */ or0 a;
    public final /* synthetic */ hu0 b;

    public e0(hu0 hu0Var, or0 or0Var) {
        this.b = hu0Var;
        this.a = or0Var;
    }

    @Override // qg.b1
    public final void a() {
        this.a.run();
    }

    @Override // qg.b1
    public final void b() {
        f0 f0Var = this.b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override // qg.b1
    public final void c() {
        hu0 hu0Var = this.b;
        if (hu0Var.k1) {
            hu0Var.k1 = false;
        } else {
            hu0Var.t1.b(1);
            hu0Var.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.b1
    public final boolean d() {
        hu0 hu0Var = this.b;
        boolean z10 = hu0Var.S0 == null;
        if (!z10) {
            hu0Var.s0(null, true);
        }
        return z10;
    }

    @Override // qg.b1
    public final void e() {
        hu0 hu0Var = this.b;
        hu0Var.F0.a.f();
        hu0Var.l1.setViewHidden(false);
    }

    @Override // qg.b1
    public final void f() {
        hu0 hu0Var = this.b;
        if (hu0Var.S0 != null) {
            hu0Var.s0(null, true);
        }
        hu0Var.l1.setViewHidden(true);
    }
}
