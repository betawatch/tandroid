// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sib implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tib b;

    public /* synthetic */ sib(tib tibVar, byte b) {
        this.a = b;
        this.b = tibVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tib tibVar = this.b;
        switch (b) {
            case 0:
                tibVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                break;
            case 1:
                tibVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                break;
            case 2:
                tibVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                break;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.s = floatValue;
                tibVar.x = (int) ((tibVar.h * floatValue) + 0.0f);
                tibVar.invalidate();
                break;
            default:
                tibVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.y = tibVar.r + ((int) Math.ceil((tibVar.n - r0) * r4));
                tibVar.invalidate();
                break;
        }
    }
}
