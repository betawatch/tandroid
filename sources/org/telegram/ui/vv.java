package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;
    public final /* synthetic */ float c;

    public /* synthetic */ vv(qy qyVar, float f10, int i10) {
        this.a = i10;
        this.b = qyVar;
        this.c = f10;
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
