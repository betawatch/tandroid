// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gy0 b;

    public /* synthetic */ zx0(gy0 gy0Var, byte b) {
        this.a = b;
        this.b = gy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gy0 gy0Var = this.b;
        switch (b) {
            case 0:
                gy0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                break;
            case 1:
                gy0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                gy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                break;
        }
    }
}
