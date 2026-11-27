// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gy0 b;

    public /* synthetic */ zx0(gy0 gy0Var, byte b) {
        this.a = b;
        this.b = gy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gy0 gy0Var = this.b;
        switch (b) {
            case 0:
                gy0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                break;
            case 1:
                gy0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                gy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                break;
        }
    }
}
