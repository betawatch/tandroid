package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class z0 extends c1 {
    public final WindowInsets.Builder c;

    public z0() {
        this.c = android.support.v4.media.session.z.g();
    }

    @Override // r0.c1
    public m1 b() {
        a();
        m1 h = m1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.c1
    public void d(i0.c cVar) {
        this.c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // r0.c1
    public void e(i0.c cVar) {
        this.c.setStableInsets(cVar.d());
    }

    @Override // r0.c1
    public void f(i0.c cVar) {
        this.c.setSystemGestureInsets(cVar.d());
    }

    @Override // r0.c1
    public void g(i0.c cVar) {
        this.c.setSystemWindowInsets(cVar.d());
    }

    @Override // r0.c1
    public void h(i0.c cVar) {
        this.c.setTappableElementInsets(cVar.d());
    }

    public z0(m1 m1Var) {
        super(m1Var);
        WindowInsets.Builder g10;
        WindowInsets g11 = m1Var.g();
        if (g11 != null) {
            g10 = android.support.v4.media.session.z.h(g11);
        } else {
            g10 = android.support.v4.media.session.z.g();
        }
        this.c = g10;
    }
}
