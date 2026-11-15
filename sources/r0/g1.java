package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g1 extends f1 {
    public static final k1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = k1.h(null, windowInsets);
    }

    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // r0.f1, r0.b1, r0.h1
    public i0.c f(int i7) {
        return i0.c.c(this.c.getInsets(j1.a(i7)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public i0.c g(int i7) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public boolean p(int i7) {
        return this.c.isVisible(j1.a(i7));
    }
}
