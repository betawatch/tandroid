// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ re1 b;

    public /* synthetic */ qe1(re1 re1Var, byte b) {
        this.a = b;
        this.b = re1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        re1 re1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re1Var.n = floatValue;
                re1Var.f.setTranslationX(floatValue * hl.L(16.0f));
                re1Var.d.setAlpha(re1Var.n);
                break;
            default:
                re1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = aob.z6;
                vnb vnbVar = re1Var.b;
                int f = vm2.f(re1Var.F, aob.v0(i, vnbVar), aob.v0(aob.n6, vnbVar));
                re1Var.e.b(f);
                re1Var.f.setTextColor(f);
                break;
        }
    }
}
