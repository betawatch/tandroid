// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yx0 b;

    public /* synthetic */ rx0(yx0 yx0Var, byte b) {
        this.a = b;
        this.b = yx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yx0 yx0Var = this.b;
        switch (b) {
            case 0:
                yx0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                break;
            case 1:
                yx0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                yx0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                break;
        }
    }
}
