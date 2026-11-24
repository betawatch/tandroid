// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd9 b;

    public /* synthetic */ pc9(hd9 hd9Var, byte b) {
        this.a = b;
        this.b = hd9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                hd9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hd9Var.b0();
                break;
            default:
                hd9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hd9Var.z0();
                hd9Var.Q.setTranslationX(gl.U1(hd9Var.J, hd9Var.H[0] - hd9Var.I[0], 0));
                hd9Var.Q.setTranslationY(gl.U1(hd9Var.J, hd9Var.H[1] - hd9Var.I[1], 0));
                hd9Var.P.invalidate();
                break;
        }
    }
}
