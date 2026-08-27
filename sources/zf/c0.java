package zf;

import org.telegram.ui.hq0;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c0 implements yf.a1 {
    public final /* synthetic */ hq0 a;
    public final /* synthetic */ ys0 b;

    public c0(ys0 ys0Var, hq0 hq0Var) {
        this.b = ys0Var;
        this.a = hq0Var;
    }

    @Override // yf.a1
    public final void a() {
        this.a.run();
    }

    @Override // yf.a1
    public final void b() {
        d0 d0Var = this.b.T0;
        if (d0Var != null) {
            d0Var.invalidate();
        }
    }

    @Override // yf.a1
    public final void c() {
        ys0 ys0Var = this.b;
        if (ys0Var.g1) {
            ys0Var.g1 = false;
        } else {
            ys0Var.p1.b(1);
            ys0Var.l((yf.m) yf.m.a.get(0));
        }
    }

    @Override // yf.a1
    public final boolean d() {
        ys0 ys0Var = this.b;
        boolean z10 = ys0Var.O0 == null;
        if (!z10) {
            ys0Var.r0(null, true);
        }
        return z10;
    }

    @Override // yf.a1
    public final void e() {
        ys0 ys0Var = this.b;
        ys0Var.B0.a.g();
        ys0Var.h1.setViewHidden(false);
    }

    @Override // yf.a1
    public final void f() {
        ys0 ys0Var = this.b;
        if (ys0Var.O0 != null) {
            ys0Var.r0(null, true);
        }
        ys0Var.h1.setViewHidden(true);
    }
}
