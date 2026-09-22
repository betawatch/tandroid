package qg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ o(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                p0Var.getClass();
                p0Var.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.getClass();
                p0Var2.f2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
