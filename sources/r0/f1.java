package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
