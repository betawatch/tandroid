package th;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                a1 a1Var = this.b;
                a1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.n = floatValue;
                View view = a1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - a1Var.n);
                view.setScaleY(1.0f - a1Var.n);
                a1Var.c.setColorFilter(new PorterDuffColorFilter(i0.b.f(a1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                a1Var.a.invalidate();
                break;
        }
    }
}
