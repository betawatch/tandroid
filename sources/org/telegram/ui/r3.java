package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ r3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.b;
                u3Var.I = floatValue;
                u3Var.c.invalidate();
                u3Var.u();
                u3Var.r();
                break;
            case 1:
                u3 u3Var2 = this.b;
                u3Var2.getClass();
                u3Var2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.A();
                u3Var2.u();
                u3Var2.r();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.b;
                u3Var3.y = floatValue2;
                if (!u3Var3.n) {
                    u3Var3.A();
                }
                u3Var3.u();
                u3Var3.r();
                break;
        }
    }
}
