package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ t3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var = this.b;
                w3Var.I = floatValue;
                w3Var.c.invalidate();
                w3Var.i();
                w3Var.h();
                break;
            case 1:
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                w3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.n();
                w3Var2.i();
                w3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3 w3Var3 = this.b;
                w3Var3.x = floatValue2;
                if (!w3Var3.n) {
                    w3Var3.n();
                }
                w3Var3.i();
                w3Var3.h();
                break;
        }
    }
}
