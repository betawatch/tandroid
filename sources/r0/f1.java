package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
