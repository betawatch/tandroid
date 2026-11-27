// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb3 b;

    public /* synthetic */ rb3(zb3 zb3Var, f89 f89Var, byte b) {
        this.a = b;
        this.b = zb3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zb3 zb3Var = this.b;
        switch (b) {
            case 0:
                zb3Var.Q();
                break;
            default:
                zb3Var.M();
                break;
        }
    }
}
