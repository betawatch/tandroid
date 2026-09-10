package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ t3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = this.b;
                w3Var.I = floatValue;
                w3Var.c.invalidate();
                w3Var.i();
                w3Var.h();
                break;
            case 1:
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                w3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.n();
                w3Var2.i();
                w3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var3 = this.b;
                w3Var3.x = floatValue2;
                if (!w3Var3.n) {
                    w3Var3.n();
                }
                w3Var3.i();
                w3Var3.h();
                break;
        }
    }
}
