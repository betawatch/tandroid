package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
