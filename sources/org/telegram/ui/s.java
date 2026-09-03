package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ s(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                l4Var.getClass();
                l4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4 l4Var2 = this.b;
                l4Var2.V0 = floatValue;
                l4Var2.n0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + l4Var2.m0);
                break;
        }
    }
}
