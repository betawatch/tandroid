package qg;

import org.telegram.ui.cu0;
import org.telegram.ui.kr0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f0 implements pg.b1 {
    public final /* synthetic */ kr0 a;
    public final /* synthetic */ cu0 b;

    public f0(cu0 cu0Var, kr0 kr0Var) {
        this.b = cu0Var;
        this.a = kr0Var;
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
        cu0 cu0Var = this.b;
        if (cu0Var.k1) {
            cu0Var.k1 = false;
        } else {
            cu0Var.t1.b(1);
            cu0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.b1
    public final boolean d() {
        cu0 cu0Var = this.b;
        boolean z10 = cu0Var.S0 == null;
        if (!z10) {
            cu0Var.r0(null, true);
        }
        return z10;
    }

    @Override // pg.b1
    public final void e() {
        cu0 cu0Var = this.b;
        cu0Var.F0.a.e();
        cu0Var.l1.setViewHidden(false);
    }

    @Override // pg.b1
    public final void f() {
        cu0 cu0Var = this.b;
        if (cu0Var.S0 != null) {
            cu0Var.r0(null, true);
        }
        cu0Var.l1.setViewHidden(true);
    }
}
