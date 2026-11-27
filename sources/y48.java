// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y48 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ y48(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o68Var.invalidate();
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o68Var.d3 = floatValue;
                o68Var.b3.setTransitionProgress(floatValue);
                break;
            default:
                o68Var.D0(valueAnimator);
                break;
        }
    }
}
