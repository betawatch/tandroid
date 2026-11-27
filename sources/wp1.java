// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wp1 extends dl1 {
    public final /* synthetic */ zu1 z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(vnbVar, activity, false);
        this.z2 = zu1Var;
    }

    @Override // dl1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        zu1 zu1Var = this.z2;
        j0(zu1Var.g1.getY() + y, zu1Var.m1.getBackgroundSizeY());
    }
}
