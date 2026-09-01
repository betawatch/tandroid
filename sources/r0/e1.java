package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public i0.b n;

    public e1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.n = null;
    }

    @Override // r0.j1
    public m1 b() {
        return m1.h(null, this.c.consumeStableInsets());
    }

    @Override // r0.j1
    public m1 c() {
        return m1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // r0.j1
    public final i0.b i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.j1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.j1
    public void s(i0.b bVar) {
        this.n = bVar;
    }
}
