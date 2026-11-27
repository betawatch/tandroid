// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z12 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j22 b;

    public /* synthetic */ z12(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                j22Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                pw0 pw0Var = j22Var.n;
                if (pw0Var.getWebView() != null) {
                    pw0Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
