// default package

import android.animation.ValueAnimator;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class us implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ us(o oVar, byte b) {
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
                oVar.r0.setTranslationY(((1.0f - floatValue) * gl.L(51.0f)) + oVar.q0);
                break;
        }
    }
}
