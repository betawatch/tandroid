// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg4 b;

    public /* synthetic */ wf4(dg4 dg4Var, byte b) {
        this.a = b;
        this.b = dg4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dg4 dg4Var = this.b;
        switch (b) {
            case 0:
                dg4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                break;
            default:
                dg4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                break;
        }
    }
}
