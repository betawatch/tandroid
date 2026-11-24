// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zd8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ie8 b;

    public /* synthetic */ zd8(ie8 ie8Var, byte b) {
        this.a = b;
        this.b = ie8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ie8 ie8Var = this.b;
        switch (b) {
            case 0:
                ie8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ie8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
