package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ v3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var = this.b;
                y3Var.F = floatValue;
                y3Var.c.invalidate();
                y3Var.i();
                y3Var.h();
                break;
            case 1:
                y3 y3Var2 = this.b;
                y3Var2.getClass();
                y3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3 y3Var3 = this.b;
                y3Var3.x = floatValue2;
                if (!y3Var3.n) {
                    y3Var3.n();
                }
                y3Var3.i();
                y3Var3.h();
                break;
        }
    }
}
