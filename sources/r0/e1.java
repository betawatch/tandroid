package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public static final j1 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = j1.h(null, windowInsets);
    }

    public e1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    @Override // r0.a1, r0.g1
    public i0.c f(int i10) {
        return i0.c.c(this.c.getInsets(h1.a(i10)));
    }

    @Override // r0.a1, r0.g1
    public i0.c g(int i10) {
        return i0.c.c(this.c.getInsetsIgnoringVisibility(h1.a(i10)));
    }

    @Override // r0.a1, r0.g1
    public boolean p(int i10) {
        return this.c.isVisible(h1.a(i10));
    }

    @Override // r0.a1, r0.g1
    public final void d(View view) {
    }
}
