package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z21 b;

    public /* synthetic */ w21(z21 z21Var, int i10) {
        this.a = i10;
        this.b = z21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z21 z21Var = this.b;
                z21Var.getClass();
                z21Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var.g();
                break;
            case 1:
                z21 z21Var2 = this.b;
                z21Var2.getClass();
                z21Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var2.g();
                break;
            default:
                z21 z21Var3 = this.b;
                z21Var3.getClass();
                z21Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var3.g();
                break;
        }
    }
}
