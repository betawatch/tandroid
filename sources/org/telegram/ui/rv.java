package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ rv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.getClass();
                uyVar.I4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.M4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.getClass();
                uyVar2.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
