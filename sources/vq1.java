// default package

import android.app.Activity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vq1 extends cm1 {
    public final /* synthetic */ yv1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(ylbVar, activity, false);
        this.z2 = yv1Var;
    }

    @Override // cm1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        yv1 yv1Var = this.z2;
        j0(yv1Var.g1.getY() + y, yv1Var.m1.getBackgroundSizeY());
    }
}
