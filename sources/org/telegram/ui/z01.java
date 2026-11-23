package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c11 b;

    public /* synthetic */ z01(c11 c11Var, int i7) {
        this.a = i7;
        this.b = c11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var = this.b;
                c11Var.O = floatValue;
                c11Var.W.i0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var2 = this.b;
                c11Var2.O = floatValue2;
                c11Var2.W.i0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11 c11Var3 = this.b;
                c11Var3.O = floatValue3;
                c11Var3.W.i0.invalidate();
                break;
        }
    }
}
