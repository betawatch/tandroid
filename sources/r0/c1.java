package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class c1 extends b1 {
    public i0.c n;

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
    public final i0.c i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.h1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.h1
    public void s(i0.c cVar) {
        this.n = cVar;
    }
}
