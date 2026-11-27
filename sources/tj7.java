// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj7 b;

    public /* synthetic */ tj7(uj7 uj7Var, byte b) {
        this.a = b;
        this.b = uj7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uj7 uj7Var = this.b;
        switch (b) {
            case 0:
                uj7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uj7Var.n = floatValue;
                View view = uj7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - uj7Var.n);
                view.setScaleY(1.0f - uj7Var.n);
                uj7Var.c.setColorFilter(new PorterDuffColorFilter(vm2.f(uj7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                uj7Var.a.invalidate();
                break;
        }
    }
}
