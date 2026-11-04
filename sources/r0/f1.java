package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class f1 extends e1 {
    public static final k1 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = k1.h(null, windowInsets);
    }

    public f1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // r0.b1, r0.h1
    public i0.b f(int i3) {
        return i0.b.c(this.c.getInsets(i1.a(i3)));
    }

    @Override // r0.b1, r0.h1
    public i0.b g(int i3) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(i1.a(i3)));
    }

    @Override // r0.b1, r0.h1
    public boolean p(int i3) {
        return this.c.isVisible(i1.a(i3));
    }

    @Override // r0.b1, r0.h1
    public final void d(View view) {
    }
}
