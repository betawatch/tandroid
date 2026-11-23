package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                a11Var.O = floatValue;
                a11Var.W.i0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var2 = this.b;
                a11Var2.O = floatValue2;
                a11Var2.W.i0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11 a11Var3 = this.b;
                a11Var3.O = floatValue3;
                a11Var3.W.i0.invalidate();
                break;
        }
    }
}
