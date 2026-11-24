// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qjc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sjc b;

    public /* synthetic */ qjc(sjc sjcVar, byte b) {
        this.a = b;
        this.b = sjcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        byte b2 = 2;
        sjc sjcVar = this.b;
        switch (b) {
            case 0:
                sjcVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sjcVar.k.invalidate();
                if (sjcVar.n > 1.0f && sjcVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(gl.L(12.0f), 0);
                    sjcVar.r = ofInt;
                    ofInt.addUpdateListener(new qjc(sjcVar, b2));
                    sjcVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    sjcVar.r.start();
                    break;
                }
                break;
            case 1:
                sjcVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                sjcVar.k.invalidate();
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sjcVar.i <= sjcVar.o / 2) {
                    intValue = -intValue;
                }
                sjcVar.p = intValue;
                sjcVar.k.invalidate();
                break;
        }
    }
}
