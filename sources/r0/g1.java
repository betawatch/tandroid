package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class g1 extends f1 {
    public static final l1 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = l1.h(null, windowInsets);
    }

    public g1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
    }

    @Override // r0.c1, r0.i1
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(j1.a(i10)));
    }

    @Override // r0.c1, r0.i1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override // r0.c1, r0.i1
    public boolean p(int i10) {
        return this.c.isVisible(j1.a(i10));
    }

    @Override // r0.c1, r0.i1
    public final void d(View view) {
    }
}
