package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
