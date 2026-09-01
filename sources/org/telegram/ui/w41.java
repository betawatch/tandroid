package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w41(r61 r61Var, boolean z4, int i10) {
        this.a = i10;
        this.b = r61Var;
        this.c = z4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r61 r61Var = this.b;
                o51 o51Var = r61Var.e0;
                d51 d51Var = r61Var.f0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f10 = 1.0f - floatValue;
                o51Var.setAlpha(f10);
                o51Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                d51Var.setAlpha(floatValue);
                d51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f10);
                r61Var.g0.setAlpha(d51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                r61 r61Var2 = this.b;
                r61Var2.g0.setAlpha(r61Var2.f0.getAlpha() * floatValue2);
                break;
        }
    }
}
