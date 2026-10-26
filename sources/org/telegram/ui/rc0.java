package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ rc0(gg0 gg0Var, int i10) {
        this.a = i10;
        this.b = gg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gg0 gg0Var = this.b;
                gg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var.c.setAlpha(floatValue);
                gg0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                gg0 gg0Var2 = this.b;
                gg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                gg0Var2.V.setScaleX(f7);
                gg0Var2.V.setScaleY(f7);
                gg0Var2.V.setAlpha(floatValue2);
                break;
            default:
                gg0 gg0Var3 = this.b;
                gg0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg0Var3.c.setAlpha(floatValue3);
                gg0Var3.c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                break;
        }
    }
}
