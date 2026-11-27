// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tj7 b;

    public /* synthetic */ sj7(tj7 tj7Var, byte b) {
        this.a = b;
        this.b = tj7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tj7 tj7Var = this.b;
        switch (b) {
            case 0:
                tj7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tj7Var.n = floatValue;
                View view = tj7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - tj7Var.n);
                view.setScaleY(1.0f - tj7Var.n);
                tj7Var.c.setColorFilter(new PorterDuffColorFilter(vm2.f(tj7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                tj7Var.a.invalidate();
                break;
        }
    }
}
