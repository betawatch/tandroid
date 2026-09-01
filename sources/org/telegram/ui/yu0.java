package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hv0 b;

    public /* synthetic */ yu0(hv0 hv0Var, int i10) {
        this.a = i10;
        this.b = hv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hv0 hv0Var = this.b;
                hv0Var.getClass();
                hv0Var.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hv0 hv0Var2 = this.b;
                hv0Var2.getClass();
                hv0Var2.O.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
