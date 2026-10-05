package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ o(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.getClass();
                m0Var.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.getClass();
                m0Var2.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
