// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xm9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ xm9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                on9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                on9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pha phaVar = on9Var.F;
                if (phaVar.getTitleTextView() != null) {
                    phaVar.getTitleTextView().invalidate();
                    break;
                }
                break;
            default:
                on9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on9Var.f.requestLayout();
                break;
        }
    }
}
