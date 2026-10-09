package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;
    public final /* synthetic */ float c;

    public /* synthetic */ xv(ty tyVar, float f7, int i10) {
        this.a = i10;
        this.b = tyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ty.V(this.b, this.c, valueAnimator);
                break;
            default:
                ty.B0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
