package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ u21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                x21Var.getClass();
                x21Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.g();
                break;
            case 1:
                x21 x21Var2 = this.b;
                x21Var2.getClass();
                x21Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var2.g();
                break;
            default:
                x21 x21Var3 = this.b;
                x21Var3.getClass();
                x21Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var3.g();
                break;
        }
    }
}
