package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ s(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                m4Var.getClass();
                m4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4 m4Var2 = this.b;
                m4Var2.U0 = floatValue;
                m4Var2.m0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + m4Var2.l0);
                break;
        }
    }
}
