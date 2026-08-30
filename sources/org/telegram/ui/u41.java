package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u41(q61 q61Var, boolean z4, int i10) {
        this.a = i10;
        this.b = q61Var;
        this.c = z4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q61 q61Var = this.b;
                m51 m51Var = q61Var.e0;
                b51 b51Var = q61Var.f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                m51Var.setAlpha(f10);
                m51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                b51Var.setAlpha(floatValue);
                b51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                q61Var.g0.setAlpha(b51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                q61 q61Var2 = this.b;
                q61Var2.g0.setAlpha(q61Var2.f0.getAlpha() * floatValue2);
                break;
        }
    }
}
