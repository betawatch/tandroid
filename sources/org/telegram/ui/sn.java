package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.pc0 b;

    public /* synthetic */ sn(org.telegram.ui.Components.pc0 pc0Var, int i10) {
        this.a = i10;
        this.b = pc0Var;
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
