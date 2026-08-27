package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public i0.c f(int i10) {
        return i0.c.c(this.c.getInsets(l1.a(i10)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public i0.c g(int i10) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(l1.a(i10)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public boolean p(int i10) {
        return this.c.isVisible(l1.a(i10));
    }
}
