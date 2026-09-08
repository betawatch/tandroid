package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                uy.V(this.b, this.c, valueAnimator);
                break;
            default:
                uy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
