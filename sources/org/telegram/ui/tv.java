package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
