package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 extends h1 {
    public static final m1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = m1.h(null, windowInsets);
    }

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // r0.h1, r0.d1, r0.j1
    public i0.b f(int i9) {
        return i0.b.c(this.c.getInsets(l1.a(i9)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public i0.b g(int i9) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(l1.a(i9)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public boolean p(int i9) {
        return this.c.isVisible(l1.a(i9));
    }
}
