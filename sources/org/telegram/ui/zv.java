package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
