package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class w0 extends z0 {
    public final WindowInsets.Builder c;

    public w0() {
        this.c = android.support.v4.media.session.w.h();
    }

    @Override // r0.z0
    public j1 b() {
        a();
        j1 h = j1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.z0
    public void d(i0.c cVar) {
        this.c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // r0.z0
    public void e(i0.c cVar) {
        this.c.setStableInsets(cVar.d());
    }

    @Override // r0.z0
    public void f(i0.c cVar) {
        this.c.setSystemGestureInsets(cVar.d());
    }

    @Override // r0.z0
    public void g(i0.c cVar) {
        this.c.setSystemWindowInsets(cVar.d());
    }

    @Override // r0.z0
    public void h(i0.c cVar) {
        this.c.setTappableElementInsets(cVar.d());
    }

    public w0(j1 j1Var) {
        super(j1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            h = android.support.v4.media.session.w.i(g10);
        } else {
            h = android.support.v4.media.session.w.h();
        }
        this.c = h;
    }
}
