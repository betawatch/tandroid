// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qh8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ th8 b;

    public /* synthetic */ qh8(th8 th8Var, byte b) {
        this.a = b;
        this.b = th8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        th8 th8Var = this.b;
        switch (b) {
            case 0:
                th8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th8Var.c(true);
                break;
            default:
                th8Var.getClass();
                th8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th8Var.c(true);
                break;
        }
    }
}
