// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class th8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xh8 b;

    public /* synthetic */ th8(xh8 xh8Var, byte b) {
        this.a = b;
        this.b = xh8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xh8 xh8Var = this.b;
        switch (b) {
            case 0:
                xh8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh8Var.c.invalidate();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh8Var.I2.getLayoutParams().height = gl.U1(floatValue, xh8Var.J2[0].getHeight(), xh8Var.J2[1].getHeight());
                xh8Var.I2.requestLayout();
                break;
        }
    }
}
