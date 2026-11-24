// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t02 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;

    public /* synthetic */ t02(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                i22Var.L1();
                break;
            case 1:
                i22Var.A2.invalidate();
                break;
            case 2:
                i22Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var = i22Var.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                    break;
                }
                break;
            case 3:
                i22Var.u1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                a22 a22Var = i22Var.v2;
                c52 c52Var = i22Var.q2;
                if (a22Var == c52Var && c52Var != null) {
                    c52Var.invalidate();
                    break;
                }
                break;
            default:
                i22Var.L1();
                break;
        }
    }
}
