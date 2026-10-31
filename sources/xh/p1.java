package xh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ p1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m2 m2Var = this.b;
                m2Var.getClass();
                m2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.l();
                break;
            default:
                this.b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
