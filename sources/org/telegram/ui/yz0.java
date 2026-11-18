package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yz0(r11 r11Var, boolean z10, int i7) {
        this.a = i7;
        this.b = r11Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r11 r11Var = this.b;
                p01 p01Var = r11Var.i0;
                f01 f01Var = r11Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                p01Var.setAlpha(f10);
                p01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                f01Var.setAlpha(floatValue);
                f01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                r11Var.k0.setAlpha(f01Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r11 r11Var2 = this.b;
                r11Var2.k0.setAlpha(r11Var2.j0.getAlpha() * floatValue2);
                break;
        }
    }
}
