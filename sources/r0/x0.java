package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class x0 extends a1 {
    public final WindowInsets.Builder c;

    public x0() {
        this.c = android.support.v4.media.session.w.h();
    }

    @Override // r0.a1
    public l1 b() {
        a();
        l1 h = l1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.a1
    public void d(i0.b bVar) {
        this.c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // r0.a1
    public void e(i0.b bVar) {
        this.c.setStableInsets(bVar.d());
    }

    @Override // r0.a1
    public void f(i0.b bVar) {
        this.c.setSystemGestureInsets(bVar.d());
    }

    @Override // r0.a1
    public void g(i0.b bVar) {
        this.c.setSystemWindowInsets(bVar.d());
    }

    @Override // r0.a1
    public void h(i0.b bVar) {
        this.c.setTappableElementInsets(bVar.d());
    }

    public x0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.w.i(g10);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.c = h;
    }
}
