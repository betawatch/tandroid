package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ r9(x9 x9Var, int i10) {
        this.a = i10;
        this.b = x9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = this.b;
                x9Var.U = floatValue;
                x9Var.a.setAlpha(1.0f - floatValue);
                if (x9Var.S == 3) {
                    x9Var.b.setAlpha(1.0f - x9Var.U);
                }
                x9Var.r.setAlpha(1.0f - x9Var.U);
                x9Var.v = (x9Var.U * 0.25f) + 0.5f;
                x9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
