package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy0 b;

    public /* synthetic */ vy0(yy0 yy0Var, int i7) {
        this.a = i7;
        this.b = yy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yy0 yy0Var = this.b;
                yy0Var.getClass();
                yy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.g();
                break;
            case 1:
                yy0 yy0Var2 = this.b;
                yy0Var2.getClass();
                yy0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var2.g();
                break;
            default:
                yy0 yy0Var3 = this.b;
                yy0Var3.getClass();
                yy0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var3.g();
                break;
        }
    }
}
