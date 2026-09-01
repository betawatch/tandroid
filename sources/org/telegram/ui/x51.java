package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;

    public /* synthetic */ x51(a61 a61Var, int i10) {
        this.a = i10;
        this.b = a61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var = this.b;
                a61Var.K = floatValue;
                a61Var.S.e0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var2 = this.b;
                a61Var2.K = floatValue2;
                a61Var2.S.e0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61 a61Var3 = this.b;
                a61Var3.K = floatValue3;
                a61Var3.S.e0.invalidate();
                break;
        }
    }
}
