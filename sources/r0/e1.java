package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class e1 extends d1 {
    public i0.c n;

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
    public final i0.c i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.j1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.j1
    public void s(i0.c cVar) {
        this.n = cVar;
    }
}
