// default package

import android.animation.ValueAnimator;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ vt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.a1 = floatValue;
                oVar.r0.setTranslationY(((1.0f - floatValue) * gm.L(51.0f)) + oVar.q0);
                break;
        }
    }
}
