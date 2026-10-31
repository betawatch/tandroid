package vh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ h7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o8 o8Var = this.b;
                o8Var.getClass();
                o8Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.n();
                o8Var.r.invalidate();
                o8Var.n.invalidate();
                break;
        }
    }
}
