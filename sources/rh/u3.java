package rh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ u3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                y3Var.getClass();
                y3Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.d(y3Var.a0);
                break;
            case 1:
                y3 y3Var2 = this.b;
                y3Var2.getClass();
                float u10 = c3.i0.u((float) Math.pow((r6 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                y3Var2.w0 = u10;
                FrameLayout frameLayout = y3Var2.b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(y3Var2.w0);
                y3Var2.invalidate();
                break;
            default:
                y3 y3Var3 = this.b;
                y3Var3.getClass();
                y3Var3.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var3.d(y3Var3.a0);
                break;
        }
    }
}
