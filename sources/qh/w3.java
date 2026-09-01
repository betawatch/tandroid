package qh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;

    public /* synthetic */ w3(b5 b5Var, int i10) {
        this.a = i10;
        this.b = b5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b;
                b5Var.getClass();
                b5Var.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                b5 b5Var2 = this.b;
                b5Var2.getClass();
                b5Var2.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b5 b5Var3 = this.b;
                b5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var3.Y1 = floatValue;
                b5Var3.W1.setTransitionProgress(floatValue);
                break;
        }
    }
}
