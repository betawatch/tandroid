package rg;

import org.telegram.ui.gu0;
import org.telegram.ui.mr0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e0 implements qg.b1 {
    public final /* synthetic */ mr0 a;
    public final /* synthetic */ gu0 b;

    public e0(gu0 gu0Var, mr0 mr0Var) {
        this.b = gu0Var;
        this.a = mr0Var;
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
        gu0 gu0Var = this.b;
        if (gu0Var.k1) {
            gu0Var.k1 = false;
        } else {
            gu0Var.t1.b(1);
            gu0Var.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.b1
    public final boolean d() {
        gu0 gu0Var = this.b;
        boolean z10 = gu0Var.S0 == null;
        if (!z10) {
            gu0Var.s0(null, true);
        }
        return z10;
    }

    @Override // qg.b1
    public final void e() {
        gu0 gu0Var = this.b;
        gu0Var.F0.a.e();
        gu0Var.l1.setViewHidden(false);
    }

    @Override // qg.b1
    public final void f() {
        gu0 gu0Var = this.b;
        if (gu0Var.S0 != null) {
            gu0Var.s0(null, true);
        }
        gu0Var.l1.setViewHidden(true);
    }
}
