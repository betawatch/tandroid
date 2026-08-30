package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y51 b;

    public /* synthetic */ v51(y51 y51Var, int i10) {
        this.a = i10;
        this.b = y51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var = this.b;
                y51Var.K = floatValue;
                y51Var.S.e0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var2 = this.b;
                y51Var2.K = floatValue2;
                y51Var2.S.e0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51 y51Var3 = this.b;
                y51Var3.K = floatValue3;
                y51Var3.S.e0.invalidate();
                break;
        }
    }
}
