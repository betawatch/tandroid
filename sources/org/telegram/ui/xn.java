package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.lc0 b;

    public /* synthetic */ xn(org.telegram.ui.Components.lc0 lc0Var, int i10) {
        this.a = i10;
        this.b = lc0Var;
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
