package ph;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ w3(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c5 c5Var = this.b;
                c5Var.getClass();
                c5Var.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                c5 c5Var2 = this.b;
                c5Var2.getClass();
                c5Var2.m2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                c5 c5Var3 = this.b;
                c5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var3.Y1 = floatValue;
                c5Var3.W1.setTransitionProgress(floatValue);
                break;
        }
    }
}
