package sg;

import org.telegram.ui.nt0;
import org.telegram.ui.xq0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e0 implements rg.b1 {
    public final /* synthetic */ xq0 a;
    public final /* synthetic */ nt0 b;

    public e0(nt0 nt0Var, xq0 xq0Var) {
        this.b = nt0Var;
        this.a = xq0Var;
    }

    @Override // rg.b1
    public final void a() {
        this.a.run();
    }

    @Override // rg.b1
    public final void b() {
        f0 f0Var = this.b.M0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    @Override // rg.b1
    public final void c() {
        nt0 nt0Var = this.b;
        if (nt0Var.Z0) {
            nt0Var.Z0 = false;
        } else {
            nt0Var.i1.b(1);
            nt0Var.i((rg.m) rg.m.a.get(0));
        }
    }

    @Override // rg.b1
    public final boolean d() {
        nt0 nt0Var = this.b;
        boolean z10 = nt0Var.H0 == null;
        if (!z10) {
            nt0Var.q0(null, true);
        }
        return z10;
    }

    @Override // rg.b1
    public final void e() {
        nt0 nt0Var = this.b;
        nt0Var.u0.a.a();
        nt0Var.a1.setViewHidden(false);
    }

    @Override // rg.b1
    public final void f() {
        nt0 nt0Var = this.b;
        if (nt0Var.H0 != null) {
            nt0Var.q0(null, true);
        }
        nt0Var.a1.setViewHidden(true);
    }
}
