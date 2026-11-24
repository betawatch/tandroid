// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r5b b;

    public /* synthetic */ q5b(r5b r5bVar, byte b) {
        this.a = b;
        this.b = r5bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        r5b r5bVar = this.b;
        switch (b) {
            case 0:
                r5bVar.b(valueAnimator);
                break;
            default:
                r5bVar.getClass();
                r5bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
