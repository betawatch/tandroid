package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class h1 extends g1 {
    public static final m1 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = m1.h(null, windowInsets);
    }

    public h1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // r0.d1, r0.j1
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(k1.a(i10)));
    }

    @Override // r0.d1, r0.j1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override // r0.d1, r0.j1
    public boolean p(int i10) {
        return this.c.isVisible(k1.a(i10));
    }

    @Override // r0.d1, r0.j1
    public final void d(View view) {
    }
}
