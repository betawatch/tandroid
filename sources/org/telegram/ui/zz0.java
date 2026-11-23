package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zz0(s11 s11Var, boolean z10, int i7) {
        this.a = i7;
        this.b = s11Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s11 s11Var = this.b;
                q01 q01Var = s11Var.i0;
                g01 g01Var = s11Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                q01Var.setAlpha(f10);
                q01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * floatValue);
                g01Var.setAlpha(floatValue);
                g01Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * f10);
                s11Var.k0.setAlpha(g01Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                s11 s11Var2 = this.b;
                s11Var2.k0.setAlpha(s11Var2.j0.getAlpha() * floatValue2);
                break;
        }
    }
}
