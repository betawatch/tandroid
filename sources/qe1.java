// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
