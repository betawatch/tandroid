// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class q52 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k62 b;

    public /* synthetic */ q52(k62 k62Var, byte b) {
        this.a = b;
        this.b = k62Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                k62Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
