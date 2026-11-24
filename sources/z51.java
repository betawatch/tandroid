// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ z51(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                b61Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b61Var.invalidate();
                break;
            case 1:
                b61Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                break;
            case 2:
                b61Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                break;
            case 3:
                b61Var.getClass();
                b61Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                break;
            default:
                b61Var.getClass();
                b61Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                break;
        }
    }
}
