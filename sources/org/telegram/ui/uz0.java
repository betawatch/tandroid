package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ uz0(n11 n11Var, boolean z10, int i7) {
        this.a = i7;
        this.b = n11Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n11 n11Var = this.b;
                l01 l01Var = n11Var.i0;
                b01 b01Var = n11Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                l01Var.setAlpha(f10);
                l01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                b01Var.setAlpha(floatValue);
                b01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                n11Var.k0.setAlpha(b01Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                n11 n11Var2 = this.b;
                n11Var2.k0.setAlpha(n11Var2.j0.getAlpha() * floatValue2);
                break;
        }
    }
}
