package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy0 b;

    public /* synthetic */ wy0(zy0 zy0Var, int i7) {
        this.a = i7;
        this.b = zy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zy0 zy0Var = this.b;
                zy0Var.getClass();
                zy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.g();
                break;
            case 1:
                zy0 zy0Var2 = this.b;
                zy0Var2.getClass();
                zy0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var2.g();
                break;
            default:
                zy0 zy0Var3 = this.b;
                zy0Var3.getClass();
                zy0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var3.g();
                break;
        }
    }
}
