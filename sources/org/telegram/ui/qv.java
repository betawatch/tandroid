package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ qv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                tyVar.getClass();
                tyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ty tyVar2 = this.b;
                tyVar2.getClass();
                tyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
