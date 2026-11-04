package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class x0 extends a1 {
    public final WindowInsets.Builder c;

    public x0() {
        this.c = android.support.v4.media.session.w.h();
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
            h = android.support.v4.media.session.w.i(g7);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.c = h;
    }
}
