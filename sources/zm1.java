// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ cm1 c;

    public /* synthetic */ zm1(yv1 yv1Var, cm1 cm1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = cm1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cm1 cm1Var = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.X9 = gm.L(30.0f) * floatValue;
                yv1Var.O7();
                cm1Var.setAlpha(floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.X9 = gm.L(30.0f) * floatValue2;
                yv1Var.O7();
                yv1Var.Q7();
                cm1Var.setAlpha(floatValue2);
                break;
        }
    }
}
