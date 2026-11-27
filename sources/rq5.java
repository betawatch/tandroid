// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ rq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * qVar.getMeasuredHeight() * 0.5f;
                qVar.z0 = floatValue;
                qVar.w.setTranslationY(floatValue + qVar.y0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.B0 = floatValue2;
                jp9 jp9Var = qVar.Q;
                if (jp9Var != null) {
                    jp9Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
