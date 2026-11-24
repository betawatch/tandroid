// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u22 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e32 b;

    public /* synthetic */ u22(e32 e32Var, byte b) {
        this.a = b;
        this.b = e32Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        e32 e32Var = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ox0 ox0Var = e32Var.n;
                if (ox0Var.getWebView() != null) {
                    ox0Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
            default:
                e32Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
