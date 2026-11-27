// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rk3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk3 b;

    public /* synthetic */ rk3(tk3 tk3Var, byte b) {
        this.a = b;
        this.b = tk3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tk3 tk3Var = this.b;
        switch (b) {
            case 0:
                tk3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tk3Var.requestLayout();
                pt2 pt2Var = tk3Var.c;
                if (pt2Var != null) {
                    pt2Var.accept(Float.valueOf(tk3Var.a));
                    break;
                }
                break;
            default:
                tk3Var.getClass();
                tk3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tk3Var.requestLayout();
                pt2 pt2Var2 = tk3Var.c;
                if (pt2Var2 != null) {
                    pt2Var2.accept(Float.valueOf(tk3Var.a));
                    break;
                }
                break;
        }
    }
}
