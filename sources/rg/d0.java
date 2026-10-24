package rg;

import org.telegram.ui.jt0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d0 implements qg.d1 {
    public final /* synthetic */ tq0 a;
    public final /* synthetic */ jt0 b;

    public d0(jt0 jt0Var, tq0 tq0Var) {
        this.b = jt0Var;
        this.a = tq0Var;
    }

    @Override // qg.d1
    public final void a() {
        this.a.run();
    }

    @Override // qg.d1
    public final void b() {
        e0 e0Var = this.b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override // qg.d1
    public final void c() {
        jt0 jt0Var = this.b;
        if (jt0Var.k1) {
            jt0Var.k1 = false;
        } else {
            jt0Var.t1.b(1);
            jt0Var.n((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.d1
    public final boolean d() {
        jt0 jt0Var = this.b;
        boolean z10 = jt0Var.S0 == null;
        if (!z10) {
            jt0Var.r0(null, true);
        }
        return z10;
    }

    @Override // qg.d1
    public final void e() {
        jt0 jt0Var = this.b;
        jt0Var.F0.a.e();
        jt0Var.l1.setViewHidden(false);
    }

    @Override // qg.d1
    public final void f() {
        jt0 jt0Var = this.b;
        if (jt0Var.S0 != null) {
            jt0Var.r0(null, true);
        }
        jt0Var.l1.setViewHidden(true);
    }
}
