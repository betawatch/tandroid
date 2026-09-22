package qg;

import org.telegram.ui.au0;
import org.telegram.ui.jr0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e0 implements pg.e1 {
    public final /* synthetic */ jr0 a;
    public final /* synthetic */ au0 b;

    public e0(au0 au0Var, jr0 jr0Var) {
        this.b = au0Var;
        this.a = jr0Var;
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
        au0 au0Var = this.b;
        if (au0Var.k1) {
            au0Var.k1 = false;
        } else {
            au0Var.t1.b(1);
            au0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.e1
    public final boolean d() {
        au0 au0Var = this.b;
        boolean z10 = au0Var.S0 == null;
        if (!z10) {
            au0Var.r0(null, true);
        }
        return z10;
    }

    @Override // pg.e1
    public final void e() {
        au0 au0Var = this.b;
        au0Var.F0.a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override // pg.e1
    public final void f() {
        au0 au0Var = this.b;
        if (au0Var.S0 != null) {
            au0Var.r0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
