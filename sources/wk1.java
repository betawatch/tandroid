// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wk1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ wk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                at1 at1Var = mu1Var.m1;
                if (at1Var != null) {
                    at1Var.invalidate();
                    mu1Var.A0.invalidate();
                    break;
                }
                break;
            case 1:
                mu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.Hc();
                break;
            case 2:
                mu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.Hc();
                break;
            case 3:
                mu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.G7();
                break;
            default:
                mu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.G7();
                break;
        }
    }
}
