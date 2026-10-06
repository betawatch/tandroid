package qg;

import org.telegram.ui.dr0;
import org.telegram.ui.vt0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class d0 implements pg.e1 {
    public final /* synthetic */ dr0 a;
    public final /* synthetic */ vt0 b;

    public d0(vt0 vt0Var, dr0 dr0Var) {
        this.b = vt0Var;
        this.a = dr0Var;
    }

    @Override // pg.e1
    public final void a() {
        this.a.run();
    }

    @Override // pg.e1
    public final void b() {
        e0 e0Var = this.b.X0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override // pg.e1
    public final void c() {
        vt0 vt0Var = this.b;
        if (vt0Var.k1) {
            vt0Var.k1 = false;
        } else {
            vt0Var.t1.b(1);
            vt0Var.b((pg.m) pg.m.a.get(0));
        }
    }

    @Override // pg.e1
    public final boolean d() {
        vt0 vt0Var = this.b;
        boolean z10 = vt0Var.S0 == null;
        if (!z10) {
            vt0Var.s0(null, true);
        }
        return z10;
    }

    @Override // pg.e1
    public final void e() {
        vt0 vt0Var = this.b;
        vt0Var.F0.a.j();
        vt0Var.l1.setViewHidden(false);
    }

    @Override // pg.e1
    public final void f() {
        vt0 vt0Var = this.b;
        if (vt0Var.S0 != null) {
            vt0Var.s0(null, true);
        }
        vt0Var.l1.setViewHidden(true);
    }
}
