// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ ug3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                uj3Var.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uj3Var.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
