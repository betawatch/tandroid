package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.mc0 b;

    public /* synthetic */ qn(org.telegram.ui.Components.mc0 mc0Var, int i10) {
        this.a = i10;
        this.b = mc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
