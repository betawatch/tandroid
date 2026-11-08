package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public i0.b f(int i7) {
        return i0.b.c(this.c.getInsets(i1.a(i7)));
    }

    @Override // r0.b1, r0.h1
    public i0.b g(int i7) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(i1.a(i7)));
    }

    @Override // r0.b1, r0.h1
    public boolean p(int i7) {
        return this.c.isVisible(i1.a(i7));
    }

    @Override // r0.b1, r0.h1
    public final void d(View view) {
    }
}
