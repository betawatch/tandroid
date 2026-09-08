package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class y0 extends b1 {
    public final WindowInsets.Builder c;

    public y0() {
        this.c = android.support.v4.media.session.y.h();
    }

    @Override // r0.b1
    public l1 b() {
        a();
        l1 h = l1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.b1
    public void d(i0.c cVar) {
        this.c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // r0.b1
    public void e(i0.c cVar) {
        this.c.setStableInsets(cVar.d());
    }

    @Override // r0.b1
    public void f(i0.c cVar) {
        this.c.setSystemGestureInsets(cVar.d());
    }

    @Override // r0.b1
    public void g(i0.c cVar) {
        this.c.setSystemWindowInsets(cVar.d());
    }

    @Override // r0.b1
    public void h(i0.c cVar) {
        this.c.setTappableElementInsets(cVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.y.i(g10);
        } else {
            h = android.support.v4.media.session.y.h();
        }
        this.c = h;
    }
}
