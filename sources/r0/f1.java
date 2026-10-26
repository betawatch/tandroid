package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(i1.a(i10)));
    }

    @Override // r0.b1, r0.h1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override // r0.b1, r0.h1
    public boolean p(int i10) {
        return this.c.isVisible(i1.a(i10));
    }

    @Override // r0.b1, r0.h1
    public final void d(View view) {
    }
}
