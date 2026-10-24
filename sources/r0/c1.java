package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class c1 extends b1 {
    public i0.b n;

    public c1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.n = null;
    }

    @Override // r0.h1
    public k1 b() {
        return k1.h(null, this.c.consumeStableInsets());
    }

    @Override // r0.h1
    public k1 c() {
        return k1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // r0.h1
    public final i0.b i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.h1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.h1
    public void s(i0.b bVar) {
        this.n = bVar;
    }
}
