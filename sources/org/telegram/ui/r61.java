package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class r61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u61 b;

    public /* synthetic */ r61(u61 u61Var, int i10) {
        this.a = i10;
        this.b = u61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var = this.b;
                u61Var.N = floatValue;
                u61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var2 = this.b;
                u61Var2.N = floatValue2;
                u61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61 u61Var3 = this.b;
                u61Var3.N = floatValue3;
                u61Var3.V.h0.invalidate();
                break;
        }
    }
}
