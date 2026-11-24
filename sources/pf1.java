// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qf1 b;

    public /* synthetic */ pf1(qf1 qf1Var, byte b) {
        this.a = b;
        this.b = qf1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qf1 qf1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf1Var.n = floatValue;
                qf1Var.f.setTranslationX(floatValue * gm.L(16.0f));
                qf1Var.d.setAlpha(qf1Var.n);
                break;
            default:
                qf1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = cmb.y6;
                ylb ylbVar = qf1Var.b;
                int f = on2.f(qf1Var.F, cmb.v0(i, ylbVar), cmb.v0(cmb.m6, ylbVar));
                qf1Var.e.b(f);
                qf1Var.f.setTextColor(f);
                break;
        }
    }
}
