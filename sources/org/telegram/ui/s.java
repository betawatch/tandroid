package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ s(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                n4Var.getClass();
                n4Var.X(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4 n4Var2 = this.b;
                n4Var2.V0 = floatValue;
                n4Var2.n0.setTranslationY(((1.0f - floatValue) * AndroidUtilities.dp(51.0f)) + n4Var2.m0);
                break;
        }
    }
}
