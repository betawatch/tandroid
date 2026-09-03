package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ x3(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4 a4Var = this.b;
                a4Var.F = floatValue;
                a4Var.c.invalidate();
                a4Var.i();
                a4Var.h();
                break;
            case 1:
                a4 a4Var2 = this.b;
                a4Var2.getClass();
                a4Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4Var2.n();
                a4Var2.i();
                a4Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4 a4Var3 = this.b;
                a4Var3.x = floatValue2;
                if (!a4Var3.n) {
                    a4Var3.n();
                }
                a4Var3.i();
                a4Var3.h();
                break;
        }
    }
}
