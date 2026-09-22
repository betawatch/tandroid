package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
