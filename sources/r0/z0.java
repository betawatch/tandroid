package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class z0 extends c1 {
    public final WindowInsets.Builder c;

    public z0() {
        this.c = android.support.v4.media.session.y.g();
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
        WindowInsets.Builder g10;
        WindowInsets g11 = m1Var.g();
        if (g11 != null) {
            g10 = android.support.v4.media.session.y.h(g11);
        } else {
            g10 = android.support.v4.media.session.y.g();
        }
        this.c = g10;
    }
}
