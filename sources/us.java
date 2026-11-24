// default package

import android.animation.ValueAnimator;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
