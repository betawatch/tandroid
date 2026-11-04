package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.la0 b;

    public /* synthetic */ qm(org.telegram.ui.Components.la0 la0Var, int i3) {
        this.a = i3;
        this.b = la0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
