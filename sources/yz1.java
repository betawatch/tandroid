// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yz1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;

    public /* synthetic */ yz1(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.M1();
                break;
            case 1:
                n12Var.A2.invalidate();
                break;
            case 2:
                f12 f12Var = n12Var.v2;
                h42 h42Var = n12Var.q2;
                if (f12Var == h42Var && h42Var != null) {
                    h42Var.invalidate();
                    break;
                }
                break;
            case 3:
                n12Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var = n12Var.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                    break;
                }
                break;
            case 4:
                n12Var.v1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n12Var.M1();
                break;
        }
    }
}
