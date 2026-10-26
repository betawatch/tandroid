package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ s9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.b;
                y9Var.Y = floatValue;
                y9Var.b.setAlpha(1.0f - floatValue);
                if (y9Var.W == 3) {
                    y9Var.c.setAlpha(1.0f - y9Var.Y);
                }
                y9Var.s.setAlpha(1.0f - y9Var.Y);
                y9Var.w = (y9Var.Y * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
