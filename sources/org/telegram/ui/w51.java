package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w51(r71 r71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = r71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r71 r71Var = this.b;
                o61 o61Var = r71Var.h0;
                e61 e61Var = r71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                o61Var.setAlpha(f7);
                o61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                e61Var.setAlpha(floatValue);
                e61Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                r71Var.j0.setAlpha(e61Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r71 r71Var2 = this.b;
                r71Var2.j0.setAlpha(r71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
