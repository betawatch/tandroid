package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
    public i0.c f(int i10) {
        return i0.c.c(this.c.getInsets(j1.a(i10)));
    }

    @Override // r0.c1, r0.i1
    public i0.c g(int i10) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(j1.a(i10)));
    }

    @Override // r0.c1, r0.i1
    public boolean p(int i10) {
        return this.c.isVisible(j1.a(i10));
    }

    @Override // r0.c1, r0.i1
    public final void d(View view) {
    }
}
