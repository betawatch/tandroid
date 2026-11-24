// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ uw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                wx0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.h();
                break;
            default:
                wx0Var.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
