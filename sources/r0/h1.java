package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    @Override // r0.g1, r0.b1, r0.i1
    public i0.b f(int i7) {
        return i0.b.c(this.c.getInsets(k1.a(i7)));
    }

    @Override // r0.g1, r0.b1, r0.i1
    public i0.b g(int i7) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(k1.a(i7)));
    }

    @Override // r0.g1, r0.b1, r0.i1
    public boolean p(int i7) {
        return this.c.isVisible(k1.a(i7));
    }
}
