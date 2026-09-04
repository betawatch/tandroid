package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
