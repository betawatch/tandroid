package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
