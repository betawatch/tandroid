package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public i0.b f(int i9) {
        return i0.b.c(this.c.getInsets(k1.a(i9)));
    }

    @Override // r0.d1, r0.j1
    public i0.b g(int i9) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(k1.a(i9)));
    }

    @Override // r0.d1, r0.j1
    public boolean p(int i9) {
        return this.c.isVisible(k1.a(i9));
    }

    @Override // r0.d1, r0.j1
    public final void d(View view) {
    }
}
