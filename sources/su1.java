// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class su1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh7 b;

    public /* synthetic */ su1(hh7 hh7Var, byte b) {
        this.a = b;
        this.b = hh7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hh7 hh7Var = this.b;
        switch (b) {
            case 0:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
