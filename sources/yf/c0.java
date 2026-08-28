package yf;

import org.telegram.ui.gq0;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 implements xf.b1 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ xs0 b;

    public c0(xs0 xs0Var, gq0 gq0Var) {
        this.b = xs0Var;
        this.a = gq0Var;
    }

    @Override // xf.b1
    public final void a() {
        this.a.run();
    }

    @Override // xf.b1
    public final void b() {
        d0 d0Var = this.b.T0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override // xf.b1
    public final void c() {
        xs0 xs0Var = this.b;
        if (xs0Var.g1) {
            xs0Var.g1 = false;
        } else {
            xs0Var.p1.b(1);
            xs0Var.n((xf.m) xf.m.a.get(0));
        }
    }

    @Override // xf.b1
    public final boolean d() {
        xs0 xs0Var = this.b;
        boolean z10 = xs0Var.O0 == null;
        if (!z10) {
            xs0Var.r0(null, true);
        }
        return z10;
    }

    @Override // xf.b1
    public final void e() {
        xs0 xs0Var = this.b;
        xs0Var.B0.a.e();
        xs0Var.h1.setViewHidden(false);
    }

    @Override // xf.b1
    public final void f() {
        xs0 xs0Var = this.b;
        if (xs0Var.O0 != null) {
            xs0Var.r0(null, true);
        }
        xs0Var.h1.setViewHidden(true);
    }
}
