// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw0 b;

    public /* synthetic */ vv0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                xw0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xw0Var.h();
                break;
            default:
                xw0Var.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
