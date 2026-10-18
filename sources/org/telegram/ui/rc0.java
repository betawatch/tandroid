package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ rc0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.c.setAlpha(floatValue);
                eg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                eg0 eg0Var2 = this.b;
                eg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                eg0Var2.V.setScaleX(f7);
                eg0Var2.V.setScaleY(f7);
                eg0Var2.V.setAlpha(floatValue2);
                break;
            default:
                eg0 eg0Var3 = this.b;
                eg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var3.c.setAlpha(floatValue3);
                eg0Var3.c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                break;
        }
    }
}
