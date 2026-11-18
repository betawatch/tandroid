package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b11 b;

    public /* synthetic */ y01(b11 b11Var, int i7) {
        this.a = i7;
        this.b = b11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var = this.b;
                b11Var.O = floatValue;
                b11Var.W.i0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var2 = this.b;
                b11Var2.O = floatValue2;
                b11Var2.W.i0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11 b11Var3 = this.b;
                b11Var3.O = floatValue3;
                b11Var3.W.i0.invalidate();
                break;
        }
    }
}
