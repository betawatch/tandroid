// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ws5 extends njb {
    public final /* synthetic */ xs5 E;
    public final o04 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws5(xs5 xs5Var, Context context) {
        super(context);
        this.E = xs5Var;
        this.x = new o04(this, (byte) 16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o04 o04Var = this.x;
        gm.r(o04Var);
        if (this.y) {
            gm.d3(o04Var, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.x);
    }
}
