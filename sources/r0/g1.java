package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class g1 extends e1 {
    public static final l1 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = l1.h(null, windowInsets);
    }

    public g1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // r0.b1, r0.i1
    public i0.b f(int i7) {
        return i0.b.c(this.c.getInsets(j1.a(i7)));
    }

    @Override // r0.b1, r0.i1
    public i0.b g(int i7) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(j1.a(i7)));
    }

    @Override // r0.b1, r0.i1
    public boolean p(int i7) {
        return this.c.isVisible(j1.a(i7));
    }

    @Override // r0.b1, r0.i1
    public final void d(View view) {
    }
}
