// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0 b;

    public /* synthetic */ sw0(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                fx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var = fx0Var.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                    break;
                }
                break;
            case 1:
                fx0Var.e0();
                break;
            case 2:
                fx0Var.e0();
                break;
            case 3:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                fx0Var.w0(fx0Var.Y.intValue(), intValue, intValue);
                break;
            case 4:
                fx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var2 = fx0Var.c;
                if (ww0Var2 != null) {
                    ww0Var2.invalidate();
                    break;
                }
                break;
            case 5:
                fx0Var.e0();
                break;
            default:
                fx0Var.e0();
                break;
        }
    }
}
