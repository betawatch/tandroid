package qg;

import org.telegram.ui.au0;
import org.telegram.ui.jr0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e0 implements pg.d1 {
    public final /* synthetic */ jr0 a;
    public final /* synthetic */ au0 b;

    public e0(au0 au0Var, jr0 jr0Var) {
        this.b = au0Var;
        this.a = jr0Var;
    }

    @Override // pg.d1
    public final void a() {
        this.a.run();
    }

    @Override // pg.d1
    public final void b() {
        f0 f0Var = this.b.X0;
        if (f0Var != null) {
            f0Var.invalidate();
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
