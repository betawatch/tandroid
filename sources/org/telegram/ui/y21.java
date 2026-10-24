package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b31 b;

    public /* synthetic */ y21(b31 b31Var, int i10) {
        this.a = i10;
        this.b = b31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b31 b31Var = this.b;
                b31Var.getClass();
                b31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var.g();
                break;
            case 1:
                b31 b31Var2 = this.b;
                b31Var2.getClass();
                b31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var2.g();
                break;
            default:
                b31 b31Var3 = this.b;
                b31Var3.getClass();
                b31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b31Var3.g();
                break;
        }
    }
}
