package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class x0 extends a1 {
    public final WindowInsets.Builder c;

    public x0() {
        this.c = android.support.v4.media.session.x.h();
    }

    @Override // r0.a1
    public k1 b() {
        a();
        k1 h = k1.h(null, this.c.build());
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

    public x0(k1 k1Var) {
        super(k1Var);
        WindowInsets.Builder h;
        WindowInsets g7 = k1Var.g();
        if (g7 != null) {
            h = android.support.v4.media.session.x.i(g7);
        } else {
            h = android.support.v4.media.session.x.h();
        }
        this.c = h;
    }
}
