package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public i0.b f(int i7) {
        return i0.b.c(this.c.getInsets(j1.a(i7)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public i0.b g(int i7) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override // r0.f1, r0.b1, r0.h1
    public boolean p(int i7) {
        return this.c.isVisible(j1.a(i7));
    }
}
