// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x52 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b62 b;

    public /* synthetic */ x52(b62 b62Var, byte b) {
        this.a = b;
        this.b = b62Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        b62 b62Var = this.b;
        switch (b) {
            case 0:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                break;
            default:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                break;
        }
    }
}
