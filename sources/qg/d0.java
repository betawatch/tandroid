package qg;

import org.telegram.ui.bu0;
import org.telegram.ui.ir0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d0 implements pg.d1 {
    public final /* synthetic */ ir0 a;
    public final /* synthetic */ bu0 b;

    public d0(bu0 bu0Var, ir0 ir0Var) {
        this.b = bu0Var;
        this.a = ir0Var;
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
        bu0 bu0Var = this.b;
        if (bu0Var.k1) {
            bu0Var.k1 = false;
        } else {
            bu0Var.t1.b(1);
            bu0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.d1
    public final boolean d() {
        bu0 bu0Var = this.b;
        boolean z10 = bu0Var.S0 == null;
        if (!z10) {
            bu0Var.s0(null, true);
        }
        return z10;
    }

    @Override // pg.d1
    public final void e() {
        bu0 bu0Var = this.b;
        bu0Var.F0.a.e();
        bu0Var.l1.setViewHidden(false);
    }

    @Override // pg.d1
    public final void f() {
        bu0 bu0Var = this.b;
        if (bu0Var.S0 != null) {
            bu0Var.s0(null, true);
        }
        bu0Var.l1.setViewHidden(true);
    }
}
