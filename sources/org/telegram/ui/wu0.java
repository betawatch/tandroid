package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ wu0(fv0 fv0Var, int i10) {
        this.a = i10;
        this.b = fv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fv0 fv0Var = this.b;
                fv0Var.getClass();
                fv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fv0 fv0Var2 = this.b;
                fv0Var2.getClass();
                fv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
