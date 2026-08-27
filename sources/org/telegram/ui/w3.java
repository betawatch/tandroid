package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ w3(z3 z3Var, int i10) {
        this.a = i10;
        this.b = z3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var = this.b;
                z3Var.E = floatValue;
                z3Var.c.invalidate();
                z3Var.i();
                z3Var.h();
                break;
            case 1:
                z3 z3Var2 = this.b;
                z3Var2.getClass();
                z3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.n();
                z3Var2.i();
                z3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3 z3Var3 = this.b;
                z3Var3.x = floatValue2;
                if (!z3Var3.n) {
                    z3Var3.n();
                }
                z3Var3.i();
                z3Var3.h();
                break;
        }
    }
}
