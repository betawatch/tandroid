// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xt1 extends hg5 {
    public final /* synthetic */ yv1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(yv1 yv1Var, Activity activity) {
        super(activity, 3);
        this.X0 = yv1Var;
    }

    @Override // hg5, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - gm.L(120.0f)) + this.X0.R1);
    }
}
