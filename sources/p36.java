// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p36 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s36 b;
    public final /* synthetic */ r36 c;

    public /* synthetic */ p36(s36 s36Var, r36 r36Var, byte b) {
        this.a = b;
        this.b = s36Var;
        this.c = r36Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        r36 r36Var = this.c;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                r36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s36Var.invalidate();
                break;
            default:
                s36Var.getClass();
                r36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s36Var.invalidate();
                break;
        }
    }
}
