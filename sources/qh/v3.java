package qh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ v3(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                a5Var.getClass();
                a5Var.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                a5 a5Var2 = this.b;
                a5Var2.getClass();
                a5Var2.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                a5 a5Var3 = this.b;
                a5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var3.Y1 = floatValue;
                a5Var3.W1.setTransitionProgress(floatValue);
                break;
        }
    }
}
