// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class s41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u41 b;

    public /* synthetic */ s41(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                u41Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u41Var.invalidate();
                break;
            case 1:
                u41Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                break;
            case 2:
                u41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                break;
            case 3:
                u41Var.getClass();
                u41Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                break;
            default:
                u41Var.getClass();
                u41Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                break;
        }
    }
}
