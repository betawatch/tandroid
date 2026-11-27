// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class smc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tmc b;

    public /* synthetic */ smc(tmc tmcVar, byte b) {
        this.a = b;
        this.b = tmcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tmc tmcVar = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                tmcVar.d = intValue;
                tmcVar.e = intValue;
                tmcVar.f = intValue;
                tmcVar.h = intValue;
                tmcVar.n = intValue;
                tmcVar.invalidate();
                break;
            default:
                tmcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tmcVar.d = hl.U1(floatValue, tmcVar.G, hl.L(56.0f));
                tmcVar.e = hl.U1(floatValue, tmcVar.G, hl.L(36.0f));
                tmcVar.f = hl.U1(floatValue, tmcVar.G, hl.L(60.0f));
                tmcVar.h = hl.U1(floatValue, tmcVar.G, hl.L(36.0f));
                tmcVar.n = hl.U1(floatValue, tmcVar.G, hl.L(64.0f));
                tmcVar.r = hl.U1(floatValue, 0, hl.L(50.0f));
                tmcVar.s = hl.U1(floatValue, 0, hl.L(20.0f));
                tmcVar.w = hl.U1(floatValue, 0, 0);
                tmcVar.x = hl.U1(floatValue, 0, hl.L(-20.0f));
                tmcVar.y = hl.U1(floatValue, 0, hl.L(-40.0f));
                tmcVar.invalidate();
                break;
        }
    }
}
