package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
