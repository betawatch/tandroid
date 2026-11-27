// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w39 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ i49 b;

    public w39(i49 i49Var, float f) {
        this.b = i49Var;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i49 i49Var = this.b;
        i49Var.p0 = floatValue;
        i49Var.o0 = (1.0f - floatValue) * this.a;
        i49Var.invalidate();
    }
}
