package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
