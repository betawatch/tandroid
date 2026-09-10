package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class y0 extends b1 {
    public final WindowInsets.Builder c;

    public y0() {
        this.c = ah.b.h();
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
            h = ah.b.i(g10);
        } else {
            h = ah.b.h();
        }
        this.c = h;
    }
}
