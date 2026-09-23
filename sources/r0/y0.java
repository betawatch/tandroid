package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class y0 extends b1 {
    public final WindowInsets.Builder c;

    public y0() {
        this.c = ah.e.h();
    }

    @Override // r0.b1
    public l1 b() {
        a();
        l1 h = l1.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // r0.b1
    public void d(i0.b bVar) {
        this.c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // r0.b1
    public void e(i0.b bVar) {
        this.c.setStableInsets(bVar.d());
    }

    @Override // r0.b1
    public void f(i0.b bVar) {
        this.c.setSystemGestureInsets(bVar.d());
    }

    @Override // r0.b1
    public void g(i0.b bVar) {
        this.c.setSystemWindowInsets(bVar.d());
    }

    @Override // r0.b1
    public void h(i0.b bVar) {
        this.c.setTappableElementInsets(bVar.d());
    }

    public y0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder h;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            h = ah.e.i(g10);
        } else {
            h = ah.e.h();
        }
        this.c = h;
    }
}
