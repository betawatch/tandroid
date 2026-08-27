package zf;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.H, jVar.e0, jVar.M.getAnimatedFraction()));
                break;
            case 1:
                j jVar2 = this.b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.j0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.D;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f0));
                    jVar2.D.setScaleY(Utilities.clamp(jVar2.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f0));
                    jVar2.D.setAlpha(Math.max(0.0f, jVar2.j0 - 0.8f) * jVar2.f0 * 5.0f);
                }
                jVar2.invalidate();
                break;
            case 2:
                j jVar3 = this.b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f0 = floatValue2;
                i iVar2 = jVar3.D;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.D.setScaleY(Utilities.clamp(jVar3.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f0));
                    jVar3.D.setAlpha(Math.max(0.0f, jVar3.j0 - 0.8f) * jVar3.f0 * 5.0f);
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
                j jVar4 = this.b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.e0, jVar4.H, valueAnimator.getAnimatedFraction());
                jVar4.K = lerpAngle;
                jVar4.g(lerpAngle);
                break;
        }
    }
}
