package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;
    public final /* synthetic */ float c;

    public /* synthetic */ yv(uy uyVar, float f7, int i10) {
        this.a = i10;
        this.b = uyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uy.T(this.b, this.c, valueAnimator);
                break;
            default:
                uy.F0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
