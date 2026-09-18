package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                u3Var.i();
                u3Var.h();
                break;
            case 1:
                u3 u3Var2 = this.b;
                u3Var2.getClass();
                u3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var2.n();
                u3Var2.i();
                u3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3 u3Var3 = this.b;
                u3Var3.x = floatValue2;
                if (!u3Var3.n) {
                    u3Var3.n();
                }
                u3Var3.i();
                u3Var3.h();
                break;
        }
    }
}
