// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ um8 b;

    public /* synthetic */ pm8(um8 um8Var, byte b) {
        this.a = b;
        this.b = um8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        um8 um8Var = this.b;
        switch (b) {
            case 0:
                um8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um8Var.invalidate();
                break;
            case 1:
                um8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = um8Var.J + gm.L(28.0f);
                float L2 = um8Var.K + gm.L(52.0f);
                float f = um8Var.E;
                um8Var.H = L - (L * f);
                um8Var.I = L2 - (f * L2);
                um8Var.invalidate();
                break;
            case 2:
                um8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L3 = (gm.q.x - gm.L(36.0f)) - gm.L(52.0f);
                sm8 sm8Var = um8Var.c;
                sm8Var.getLayoutParams().width = gm.L(52.0f) + ((int) (L3 * um8Var.F));
                sm8Var.requestLayout();
                break;
            default:
                um8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um8Var.e();
                break;
        }
    }
}
