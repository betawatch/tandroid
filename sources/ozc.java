// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ozc extends nzc {
    public iq5 n;

    public ozc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
        this.n = null;
    }

    @Override // tzc
    public wzc b() {
        return wzc.h(null, this.c.consumeStableInsets());
    }

    @Override // tzc
    public wzc c() {
        return wzc.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // tzc
    public final iq5 i() {
        iq5 iq5Var = this.n;
        if (iq5Var != null) {
            return iq5Var;
        }
        WindowInsets windowInsets = this.c;
        iq5 b = iq5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = b;
        return b;
    }

    @Override // tzc
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // tzc
    public void s(iq5 iq5Var) {
        this.n = iq5Var;
    }
}
