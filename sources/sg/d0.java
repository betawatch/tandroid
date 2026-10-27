package sg;

import org.telegram.ui.pt0;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d0 implements rg.b1 {
    public final /* synthetic */ zq0 a;
    public final /* synthetic */ pt0 b;

    public d0(pt0 pt0Var, zq0 zq0Var) {
        this.b = pt0Var;
        this.a = zq0Var;
    }

    @Override // rg.b1
    public final void a() {
        this.a.run();
    }

    @Override // rg.b1
    public final void b() {
        e0 e0Var = this.b.M0;
        if (e0Var != null) {
            e0Var.invalidate();
        }
    }

    @Override // rg.b1
    public final void c() {
        pt0 pt0Var = this.b;
        if (pt0Var.Z0) {
            pt0Var.Z0 = false;
        } else {
            pt0Var.i1.b(1);
            pt0Var.i((rg.m) rg.m.a.get(0));
        }
    }

    @Override // rg.b1
    public final boolean d() {
        pt0 pt0Var = this.b;
        boolean z10 = pt0Var.H0 == null;
        if (!z10) {
            pt0Var.q0(null, true);
        }
        return z10;
    }

    @Override // rg.b1
    public final void e() {
        pt0 pt0Var = this.b;
        pt0Var.u0.a.a();
        pt0Var.a1.setViewHidden(false);
    }

    @Override // rg.b1
    public final void f() {
        pt0 pt0Var = this.b;
        if (pt0Var.H0 != null) {
            pt0Var.q0(null, true);
        }
        pt0Var.a1.setViewHidden(true);
    }
}
