package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class z0 extends c1 {
    public final WindowInsets.Builder c;

    public z0() {
        this.c = ah.f.h();
    }

    @Override // r0.c1
    public m1 b() {
        a();
        m1 h = m1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.c1
    public void d(i0.b bVar) {
        this.c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // r0.c1
    public void e(i0.b bVar) {
        this.c.setStableInsets(bVar.d());
    }

    @Override // r0.c1
    public void f(i0.b bVar) {
        this.c.setSystemGestureInsets(bVar.d());
    }

    @Override // r0.c1
    public void g(i0.b bVar) {
        this.c.setSystemWindowInsets(bVar.d());
    }

    @Override // r0.c1
    public void h(i0.b bVar) {
        this.c.setTappableElementInsets(bVar.d());
    }

    public z0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            h = ah.f.i(g10);
        } else {
            h = ah.f.h();
        }
        this.c = h;
    }
}
