package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.oc0 b;

    public /* synthetic */ qn(org.telegram.ui.Components.oc0 oc0Var, int i10) {
        this.a = i10;
        this.b = oc0Var;
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
