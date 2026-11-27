// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ys1 extends kg5 {
    public final /* synthetic */ zu1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(zu1 zu1Var, Activity activity) {
        super(activity, 3);
        this.X0 = zu1Var;
    }

    @Override // kg5, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - hl.L(120.0f)) + this.X0.R1);
    }
}
