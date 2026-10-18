package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(j1.a(i10)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public boolean p(int i10) {
        return this.c.isVisible(j1.a(i10));
    }
}
