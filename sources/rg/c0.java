package rg;

import org.telegram.ui.it0;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class c0 implements qg.d1 {
    public final /* synthetic */ sq0 a;
    public final /* synthetic */ it0 b;

    public c0(it0 it0Var, sq0 sq0Var) {
        this.b = it0Var;
        this.a = sq0Var;
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
