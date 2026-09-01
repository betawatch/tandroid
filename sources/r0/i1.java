package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i1 extends h1 {
    public static final m1 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = m1.h(null, windowInsets);
    }

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // r0.h1, r0.d1, r0.j1
    public i0.b f(int i10) {
        return i0.b.c(this.c.getInsets(l1.a(i10)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public i0.b g(int i10) {
        return i0.b.c(this.c.getInsetsIgnoringVisibility(l1.a(i10)));
    }

    @Override // r0.h1, r0.d1, r0.j1
    public boolean p(int i10) {
        return this.c.isVisible(l1.a(i10));
    }
}
