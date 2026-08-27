package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ r(m4 m4Var, int i10) {
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
