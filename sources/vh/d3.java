package vh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ d3(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.getClass();
                b4Var.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                b4 b4Var2 = this.b;
                b4Var2.getClass();
                b4Var2.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b4 b4Var3 = this.b;
                b4Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var3.K1 = floatValue;
                b4Var3.I1.setTransitionProgress(floatValue);
                break;
        }
    }
}
