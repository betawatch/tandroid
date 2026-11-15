package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy0 b;

    public /* synthetic */ ry0(uy0 uy0Var, int i7) {
        this.a = i7;
        this.b = uy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uy0 uy0Var = this.b;
                uy0Var.getClass();
                uy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var.g();
                break;
            case 1:
                uy0 uy0Var2 = this.b;
                uy0Var2.getClass();
                uy0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var2.g();
                break;
            default:
                uy0 uy0Var3 = this.b;
                uy0Var3.getClass();
                uy0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy0Var3.g();
                break;
        }
    }
}
