package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a11 b;

    public /* synthetic */ x01(a11 a11Var, int i7) {
        this.a = i7;
        this.b = a11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var = this.b;
                a11Var.N = floatValue;
                a11Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var2 = this.b;
                a11Var2.N = floatValue2;
                a11Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var3 = this.b;
                a11Var3.N = floatValue3;
                a11Var3.V.h0.invalidate();
                break;
        }
    }
}
