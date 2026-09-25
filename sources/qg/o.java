package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ o(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                n0Var.getClass();
                n0Var.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n0 n0Var2 = this.b;
                n0Var2.getClass();
                n0Var2.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
