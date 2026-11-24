// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class skc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hmc b;

    public /* synthetic */ skc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                hmcVar.P0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                hmcVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmcVar.X0();
                break;
        }
    }
}
