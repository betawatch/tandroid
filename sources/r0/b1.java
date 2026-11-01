package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class b1 extends a1 {
    public i0.c n;

    public b1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.n = null;
    }

    @Override // r0.g1
    public j1 b() {
        return j1.h(null, this.c.consumeStableInsets());
    }

    @Override // r0.g1
    public j1 c() {
        return j1.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // r0.g1
    public final i0.c i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.g1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.g1
    public void s(i0.c cVar) {
        this.n = cVar;
    }
}
