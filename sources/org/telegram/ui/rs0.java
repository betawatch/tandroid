package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ at0 b;

    public /* synthetic */ rs0(at0 at0Var, int i10) {
        this.a = i10;
        this.b = at0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                at0 at0Var = this.b;
                at0Var.getClass();
                at0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                at0 at0Var2 = this.b;
                at0Var2.getClass();
                at0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
