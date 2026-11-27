// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ ql1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.Tc();
                break;
            case 1:
                zu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.O7();
                break;
            case 2:
                zu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.O7();
                break;
            case 3:
                zu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.Tc();
                break;
            default:
                zu1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nt1 nt1Var = zu1Var.m1;
                if (nt1Var != null) {
                    nt1Var.invalidate();
                    zu1Var.A0.invalidate();
                    break;
                }
                break;
        }
    }
}
