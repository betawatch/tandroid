package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a41 b;

    public /* synthetic */ x31(a41 a41Var, int i10) {
        this.a = i10;
        this.b = a41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a41 a41Var = this.b;
                a41Var.getClass();
                a41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var.g();
                break;
            case 1:
                a41 a41Var2 = this.b;
                a41Var2.getClass();
                a41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var2.g();
                break;
            default:
                a41 a41Var3 = this.b;
                a41Var3.getClass();
                a41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var3.g();
                break;
        }
    }
}
