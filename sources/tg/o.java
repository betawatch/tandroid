package tg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ o(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.getClass();
                g0Var.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.getClass();
                g0Var2.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
