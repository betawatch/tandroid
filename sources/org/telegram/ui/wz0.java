package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wz0(q11 q11Var, boolean z9, int i7) {
        this.a = i7;
        this.b = q11Var;
        this.c = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q11 q11Var = this.b;
                o01 o01Var = q11Var.h0;
                e01 e01Var = q11Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o01Var.setAlpha(f10);
                o01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                e01Var.setAlpha(floatValue);
                e01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                q11Var.j0.setAlpha(e01Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q11 q11Var2 = this.b;
                q11Var2.j0.setAlpha(q11Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
