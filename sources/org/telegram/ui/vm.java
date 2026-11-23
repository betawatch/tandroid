package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.cb0 b;

    public /* synthetic */ vm(org.telegram.ui.Components.cb0 cb0Var, int i7) {
        this.a = i7;
        this.b = cb0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
