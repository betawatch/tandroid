package th;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ j1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                z2Var.getClass();
                z2Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.invalidate();
                break;
            case 1:
                z2 z2Var2 = this.b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.c3 = floatValue;
                z2Var2.a3.setTransitionProgress(floatValue);
                break;
            default:
                z2.X(this.b, valueAnimator);
                break;
        }
    }
}
