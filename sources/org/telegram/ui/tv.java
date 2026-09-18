package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ tv(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                wyVar.getClass();
                wyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                wy wyVar2 = this.b;
                wyVar2.getClass();
                wyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
