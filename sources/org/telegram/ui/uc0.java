package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ uc0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.c.setAlpha(floatValue);
                ig0Var.c.setTranslationY((1.0f - floatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                ig0 ig0Var2 = this.b;
                ig0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = (0.9f * floatValue2) + 0.1f;
                ig0Var2.V.setScaleX(f7);
                ig0Var2.V.setScaleY(f7);
                ig0Var2.V.setAlpha(floatValue2);
                break;
            default:
                ig0 ig0Var3 = this.b;
                ig0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var3.c.setAlpha(floatValue3);
                ig0Var3.c.setTranslationY((1.0f - floatValue3) * AndroidUtilities.dp(230.0f));
                break;
        }
    }
}
