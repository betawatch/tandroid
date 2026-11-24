// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xf3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hg3 b;

    public /* synthetic */ xf3(hg3 hg3Var, byte b) {
        this.a = b;
        this.b = hg3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hg3 hg3Var = this.b;
        switch (b) {
            case 0:
                hg3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                break;
            case 1:
                hg3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                break;
            default:
                hg3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3Var.invalidate();
                break;
        }
    }
}
