// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sw b;

    public /* synthetic */ pw(sw swVar, byte b) {
        this.a = b;
        this.b = swVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sw swVar = this.b;
        switch (b) {
            case 0:
                swVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                swVar.c.invalidate();
                swVar.s();
                swVar.r();
                break;
            case 1:
                swVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                swVar.A();
                swVar.s();
                swVar.r();
                break;
            default:
                swVar.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!swVar.n) {
                    swVar.A();
                }
                swVar.s();
                swVar.r();
                break;
        }
    }
}
