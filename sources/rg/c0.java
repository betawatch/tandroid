package rg;

import org.telegram.ui.gt0;
import org.telegram.ui.qq0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class c0 implements qg.e1 {
    public final /* synthetic */ qq0 a;
    public final /* synthetic */ gt0 b;

    public c0(gt0 gt0Var, qq0 qq0Var) {
        this.b = gt0Var;
        this.a = qq0Var;
    }

    @Override // qg.e1
    public final void a() {
        this.a.run();
    }

    @Override // qg.e1
    public final void b() {
        d0 d0Var = this.b.X0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override // qg.e1
    public final void c() {
        gt0 gt0Var = this.b;
        if (gt0Var.k1) {
            gt0Var.k1 = false;
        } else {
            gt0Var.t1.b(1);
            gt0Var.o((qg.m) qg.m.a.get(0));
        }
    }

    @Override // qg.e1
    public final boolean d() {
        gt0 gt0Var = this.b;
        boolean z10 = gt0Var.S0 == null;
        if (!z10) {
            gt0Var.s0(null, true);
        }
        return z10;
    }

    @Override // qg.e1
    public final void e() {
        gt0 gt0Var = this.b;
        gt0Var.F0.a.e();
        gt0Var.l1.setViewHidden(false);
    }

    @Override // qg.e1
    public final void f() {
        gt0 gt0Var = this.b;
        if (gt0Var.S0 != null) {
            gt0Var.s0(null, true);
        }
        gt0Var.l1.setViewHidden(true);
    }
}
