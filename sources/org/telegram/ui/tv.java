package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;
    public final /* synthetic */ float c;

    public /* synthetic */ tv(qy qyVar, float f7, int i10) {
        this.a = i10;
        this.b = qyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qy.V(this.b, this.c, valueAnimator);
                break;
            default:
                qy.E0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
