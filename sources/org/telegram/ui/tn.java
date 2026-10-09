package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.cd0 b;

    public /* synthetic */ tn(org.telegram.ui.Components.cd0 cd0Var, int i10) {
        this.a = i10;
        this.b = cd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
