package rg;

import org.telegram.ui.it0;
import org.telegram.ui.rq0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class c0 implements qg.d1 {
    public final /* synthetic */ rq0 a;
    public final /* synthetic */ it0 b;

    public c0(it0 it0Var, rq0 rq0Var) {
        this.b = it0Var;
        this.a = rq0Var;
    }

    @Override // qg.d1
    public final void a() {
        this.a.run();
    }

    @Override // qg.d1
    public final void b() {
        d0 d0Var = this.b.X0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override // qg.d1
    public final void c() {
        it0 it0Var = this.b;
        if (it0Var.k1) {
            it0Var.k1 = false;
        } else {
            it0Var.t1.b(1);
            it0Var.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.d1
    public final boolean d() {
        it0 it0Var = this.b;
        boolean z10 = it0Var.S0 == null;
        if (!z10) {
            it0Var.s0(null, true);
        }
        return z10;
    }

    @Override // qg.d1
    public final void e() {
        it0 it0Var = this.b;
        it0Var.F0.a.e();
        it0Var.l1.setViewHidden(false);
    }

    @Override // qg.d1
    public final void f() {
        it0 it0Var = this.b;
        if (it0Var.S0 != null) {
            it0Var.s0(null, true);
        }
        it0Var.l1.setViewHidden(true);
    }
}
