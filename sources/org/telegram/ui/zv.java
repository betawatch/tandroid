package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;
    public final /* synthetic */ float c;

    public /* synthetic */ zv(wy wyVar, float f7, int i10) {
        this.a = i10;
        this.b = wyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wy.V(this.b, this.c, valueAnimator);
                break;
            default:
                wy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
