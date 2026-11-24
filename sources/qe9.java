// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf9 b;

    public /* synthetic */ qe9(jf9 jf9Var, byte b) {
        this.a = b;
        this.b = jf9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                jf9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf9Var.c0();
                break;
            default:
                jf9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf9Var.A0();
                jf9Var.Q.setTranslationX(gm.U1(jf9Var.J, jf9Var.H[0] - jf9Var.I[0], 0));
                jf9Var.Q.setTranslationY(gm.U1(jf9Var.J, jf9Var.H[1] - jf9Var.I[1], 0));
                jf9Var.P.invalidate();
                break;
        }
    }
}
