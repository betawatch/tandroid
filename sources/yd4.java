// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fe4 b;

    public /* synthetic */ yd4(fe4 fe4Var, byte b) {
        this.a = b;
        this.b = fe4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fe4 fe4Var = this.b;
        switch (b) {
            case 0:
                fe4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe4Var.invalidate();
                break;
            default:
                fe4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fe4Var.invalidate();
                break;
        }
    }
}
