package ug;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ f1(i1 i1Var, int i7) {
        this.a = i7;
        this.b = i1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1 i1Var = this.b;
                i1Var.C2 = floatValue;
                i1Var.c.invalidate();
                break;
            default:
                i1 i1Var2 = this.b;
                i1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var2.J2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, i1Var2.K2[0].getHeight(), i1Var2.K2[1].getHeight());
                i1Var2.J2.requestLayout();
                break;
        }
    }
}
