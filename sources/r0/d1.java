package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public i0.b n;

    public d1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.n = null;
    }

    @Override // r0.i1
    public l1 b() {
        return l1.h(null, this.c.consumeStableInsets());
    }

    @Override // r0.i1
    public l1 c() {
        return l1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // r0.i1
    public final i0.b i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.i1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.i1
    public void s(i0.b bVar) {
        this.n = bVar;
    }
}
