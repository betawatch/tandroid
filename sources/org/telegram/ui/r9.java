package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ r9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = this.b;
                z9Var.Z = floatValue;
                z9Var.a.setAlpha(1.0f - floatValue);
                if (z9Var.X == 3) {
                    z9Var.b.setAlpha(1.0f - z9Var.Z);
                }
                z9Var.s.setAlpha(1.0f - z9Var.Z);
                z9Var.w = (z9Var.Z * 0.25f) + 0.5f;
                z9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
