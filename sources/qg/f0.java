package qg;

import org.telegram.ui.au0;
import org.telegram.ui.ir0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f0 implements pg.b1 {
    public final /* synthetic */ ir0 a;
    public final /* synthetic */ au0 b;

    public f0(au0 au0Var, ir0 ir0Var) {
        this.b = au0Var;
        this.a = ir0Var;
    }

    @Override // pg.b1
    public final void a() {
        this.a.run();
    }

    @Override // pg.b1
    public final void b() {
        g0 g0Var = this.b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override // pg.b1
    public final void c() {
        au0 au0Var = this.b;
        if (au0Var.k1) {
            au0Var.k1 = false;
        } else {
            au0Var.t1.b(1);
            au0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.b1
    public final boolean d() {
        au0 au0Var = this.b;
        boolean z10 = au0Var.S0 == null;
        if (!z10) {
            au0Var.s0(null, true);
        }
        return z10;
    }

    @Override // pg.b1
    public final void e() {
        au0 au0Var = this.b;
        au0Var.F0.a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override // pg.b1
    public final void f() {
        au0 au0Var = this.b;
        if (au0Var.S0 != null) {
            au0Var.s0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
