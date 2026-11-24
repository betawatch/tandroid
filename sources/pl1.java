// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ uk1 c;

    public /* synthetic */ pl1(mu1 mu1Var, uk1 uk1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = uk1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uk1 uk1Var = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.X9 = gl.L(30.0f) * floatValue;
                mu1Var.E7();
                uk1Var.setAlpha(floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.X9 = gl.L(30.0f) * floatValue2;
                mu1Var.E7();
                mu1Var.G7();
                uk1Var.setAlpha(floatValue2);
                break;
        }
    }
}
