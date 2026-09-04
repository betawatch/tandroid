package rg;

import org.telegram.ui.ir0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f0 implements qg.b1 {
    public final /* synthetic */ ir0 a;
    public final /* synthetic */ zt0 b;

    public f0(zt0 zt0Var, ir0 ir0Var) {
        this.b = zt0Var;
        this.a = ir0Var;
    }

    @Override // qg.b1
    public final void a() {
        this.a.run();
    }

    @Override // qg.b1
    public final void b() {
        g0 g0Var = this.b.X0;
        if (g0Var != null) {
            g0Var.invalidate();
        }
    }

    @Override // qg.b1
    public final void c() {
        zt0 zt0Var = this.b;
        if (zt0Var.k1) {
            zt0Var.k1 = false;
        } else {
            zt0Var.t1.b(1);
            zt0Var.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.b1
    public final boolean d() {
        zt0 zt0Var = this.b;
        boolean z10 = zt0Var.S0 == null;
        if (!z10) {
            zt0Var.r0(null, true);
        }
        return z10;
    }

    @Override // qg.b1
    public final void e() {
        zt0 zt0Var = this.b;
        zt0Var.F0.a.f();
        zt0Var.l1.setViewHidden(false);
    }

    @Override // qg.b1
    public final void f() {
        zt0 zt0Var = this.b;
        if (zt0Var.S0 != null) {
            zt0Var.r0(null, true);
        }
        zt0Var.l1.setViewHidden(true);
    }
}
