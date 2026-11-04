package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ r3(u3 u3Var, int i3) {
        this.a = i3;
        this.b = u3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var = this.b;
                u3Var.J = floatValue;
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
