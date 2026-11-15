package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x01 b;

    public /* synthetic */ u01(x01 x01Var, int i7) {
        this.a = i7;
        this.b = x01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var = this.b;
                x01Var.O = floatValue;
                x01Var.W.i0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var2 = this.b;
                x01Var2.O = floatValue2;
                x01Var2.W.i0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01 x01Var3 = this.b;
                x01Var3.O = floatValue3;
                x01Var3.W.i0.invalidate();
                break;
        }
    }
}
