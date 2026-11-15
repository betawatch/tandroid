package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ d1(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1 g1Var = this.b;
                g1Var.C2 = floatValue;
                g1Var.c.invalidate();
                break;
            default:
                g1 g1Var2 = this.b;
                g1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, g1Var2.K2[0].getHeight(), g1Var2.K2[1].getHeight());
                g1Var2.J2.requestLayout();
                break;
        }
    }
}
