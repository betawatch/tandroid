package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s51(l71 l71Var, boolean z10, int i10) {
        this.a = i10;
        this.b = l71Var;
        this.c = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l71 l71Var = this.b;
                i61 i61Var = l71Var.h0;
                y51 y51Var = l71Var.i0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue = 1.0f - floatValue;
                }
                float f7 = 1.0f - floatValue;
                i61Var.setAlpha(f7);
                i61Var.setTranslationY(AndroidUtilities.dp(8.0f) * floatValue);
                y51Var.setAlpha(floatValue);
                y51Var.setTranslationY(AndroidUtilities.dp(8.0f) * f7);
                l71Var.j0.setAlpha(y51Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!this.c) {
                    floatValue2 = 1.0f - floatValue2;
                }
                l71 l71Var2 = this.b;
                l71Var2.j0.setAlpha(l71Var2.i0.getAlpha() * floatValue2);
                break;
        }
    }
}
