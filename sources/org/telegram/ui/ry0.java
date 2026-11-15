package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
