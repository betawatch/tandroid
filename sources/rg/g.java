package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.g(AndroidUtilities.lerpAngle(kVar.L, kVar.i0, kVar.Q.getAnimatedFraction()));
                break;
            case 1:
                k kVar2 = this.b;
                kVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.n0 = floatValue;
                kVar2.setAlpha(floatValue);
                j jVar = kVar2.H;
                if (jVar != null) {
                    jVar.setScaleX(Utilities.clamp(kVar2.n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.j0));
                    kVar2.H.setScaleY(Utilities.clamp(kVar2.n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.j0));
                    kVar2.H.setAlpha(Math.max(0.0f, kVar2.n0 - 0.8f) * kVar2.j0 * 5.0f);
                }
                kVar2.invalidate();
                break;
            case 2:
                k kVar3 = this.b;
                kVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.j0 = floatValue2;
                j jVar2 = kVar3.H;
                if (jVar2 != null) {
                    jVar2.setScaleX(Utilities.clamp(kVar3.n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    kVar3.H.setScaleY(Utilities.clamp(kVar3.n0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar3.j0));
                    kVar3.H.setAlpha(Math.max(0.0f, kVar3.n0 - 0.8f) * kVar3.j0 * 5.0f);
                    break;
                }
                break;
            case 3:
                this.b.k();
                break;
            case 4:
                this.b.k();
                break;
            default:
                k kVar4 = this.b;
                float lerpAngle = AndroidUtilities.lerpAngle(kVar4.i0, kVar4.L, valueAnimator.getAnimatedFraction());
                kVar4.O = lerpAngle;
                kVar4.g(lerpAngle);
                break;
        }
    }
}
