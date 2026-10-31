package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f1 extends e1 {
    public static final j1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = j1.h(null, windowInsets);
    }

    public f1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override // r0.e1, r0.a1, r0.g1
    public i0.c f(int i10) {
        return i0.c.c(this.c.getInsets(i1.a(i10)));
    }

    @Override // r0.e1, r0.a1, r0.g1
    public i0.c g(int i10) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override // r0.e1, r0.a1, r0.g1
    public boolean p(int i10) {
        return this.c.isVisible(i1.a(i10));
    }
}
