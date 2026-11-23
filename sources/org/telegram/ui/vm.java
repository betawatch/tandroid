package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.za0 b;

    public /* synthetic */ vm(org.telegram.ui.Components.za0 za0Var, int i7) {
        this.a = i7;
        this.b = za0Var;
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
