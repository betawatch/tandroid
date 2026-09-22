package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class h1 extends g1 {
    public static final l1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = l1.h(null, windowInsets);
    }

    public h1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // r0.g1, r0.c1, r0.i1
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(k1.a(i10)));
    }

    @Override // r0.g1, r0.c1, r0.i1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override // r0.g1, r0.c1, r0.i1
    public boolean p(int i10) {
        return this.c.isVisible(k1.a(i10));
    }
}
