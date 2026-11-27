// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class y1d extends b2d {
    public final WindowInsets.Builder c;

    public y1d(l2d l2dVar) {
        super(l2dVar);
        WindowInsets g = l2dVar.g();
        this.c = g != null ? vk1.i(g) : vk1.h();
    }

    @Override // b2d
    public l2d b() {
        a();
        l2d h = l2d.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // b2d
    public void d(mq5 mq5Var) {
        this.c.setMandatorySystemGestureInsets(mq5Var.d());
    }

    @Override // b2d
    public void e(mq5 mq5Var) {
        this.c.setStableInsets(mq5Var.d());
    }

    @Override // b2d
    public void f(mq5 mq5Var) {
        this.c.setSystemGestureInsets(mq5Var.d());
    }

    @Override // b2d
    public void g(mq5 mq5Var) {
        this.c.setSystemWindowInsets(mq5Var.d());
    }

    @Override // b2d
    public void h(mq5 mq5Var) {
        this.c.setTappableElementInsets(mq5Var.d());
    }

    public y1d() {
        this.c = vk1.h();
    }
}
