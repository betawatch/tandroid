package qg;

import org.telegram.ui.cr0;
import org.telegram.ui.tt0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f0 implements pg.c1 {
    public final /* synthetic */ cr0 a;
    public final /* synthetic */ tt0 b;

    public f0(tt0 tt0Var, cr0 cr0Var) {
        this.b = tt0Var;
        this.a = cr0Var;
    }

    @Override // pg.c1
    public final void a() {
        this.a.run();
    }

    @Override // pg.c1
    public final void b() {
        g0 g0Var = this.b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override // pg.c1
    public final void c() {
        tt0 tt0Var = this.b;
        if (tt0Var.k1) {
            tt0Var.k1 = false;
        } else {
            tt0Var.t1.b(1);
            tt0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.c1
    public final boolean d() {
        tt0 tt0Var = this.b;
        boolean z10 = tt0Var.S0 == null;
        if (!z10) {
            tt0Var.s0(null, true);
        }
        return z10;
    }

    @Override // pg.c1
    public final void e() {
        tt0 tt0Var = this.b;
        tt0Var.F0.a.e();
        tt0Var.l1.setViewHidden(false);
    }

    @Override // pg.c1
    public final void f() {
        tt0 tt0Var = this.b;
        if (tt0Var.S0 != null) {
            tt0Var.s0(null, true);
        }
        tt0Var.l1.setViewHidden(true);
    }
}
