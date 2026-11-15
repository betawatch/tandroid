package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ra0 b;

    public /* synthetic */ um(org.telegram.ui.Components.ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
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
