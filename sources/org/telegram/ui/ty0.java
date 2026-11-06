package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy0 b;

    public /* synthetic */ ty0(wy0 wy0Var, int i7) {
        this.a = i7;
        this.b = wy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wy0 wy0Var = this.b;
                wy0Var.getClass();
                wy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var.g();
                break;
            case 1:
                wy0 wy0Var2 = this.b;
                wy0Var2.getClass();
                wy0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var2.g();
                break;
            default:
                wy0 wy0Var3 = this.b;
                wy0Var3.getClass();
                wy0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var3.g();
                break;
        }
    }
}
