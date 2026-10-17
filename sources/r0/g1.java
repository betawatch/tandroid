package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
    public i0.c f(int i10) {
        return i0.c.c(this.c.getInsets(j1.a(i10)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public i0.c g(int i10) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public boolean p(int i10) {
        return this.c.isVisible(j1.a(i10));
    }
}
