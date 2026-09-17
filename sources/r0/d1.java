package r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class d1 extends c1 {
    public i0.c n;

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
    public final i0.c i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = i0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // r0.i1
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // r0.i1
    public void s(i0.c cVar) {
        this.n = cVar;
    }
}
