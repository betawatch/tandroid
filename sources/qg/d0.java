package qg;

import org.telegram.ui.au0;
import org.telegram.ui.jr0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d0 implements pg.d1 {
    public final /* synthetic */ jr0 a;
    public final /* synthetic */ au0 b;

    public d0(au0 au0Var, jr0 jr0Var) {
        this.b = au0Var;
        this.a = jr0Var;
    }

    @Override // pg.d1
    public final void a() {
        this.a.run();
    }

    @Override // pg.d1
    public final void b() {
        e0 e0Var = this.b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override // pg.d1
    public final void c() {
        au0 au0Var = this.b;
        if (au0Var.k1) {
            au0Var.k1 = false;
        } else {
            au0Var.t1.b(1);
            au0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.d1
    public final boolean d() {
        au0 au0Var = this.b;
        boolean z10 = au0Var.S0 == null;
        if (!z10) {
            au0Var.r0(null, true);
        }
        return z10;
    }

    @Override // pg.d1
    public final void e() {
        au0 au0Var = this.b;
        au0Var.F0.a.e();
        au0Var.l1.setViewHidden(false);
    }

    @Override // pg.d1
    public final void f() {
        au0 au0Var = this.b;
        if (au0Var.S0 != null) {
            au0Var.r0(null, true);
        }
        au0Var.l1.setViewHidden(true);
    }
}
