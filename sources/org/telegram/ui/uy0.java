package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy0 b;

    public /* synthetic */ uy0(xy0 xy0Var, int i7) {
        this.a = i7;
        this.b = xy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xy0 xy0Var = this.b;
                xy0Var.getClass();
                xy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var.g();
                break;
            case 1:
                xy0 xy0Var2 = this.b;
                xy0Var2.getClass();
                xy0Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var2.g();
                break;
            default:
                xy0 xy0Var3 = this.b;
                xy0Var3.getClass();
                xy0Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var3.g();
                break;
        }
    }
}
