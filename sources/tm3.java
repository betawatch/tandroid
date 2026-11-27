// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tm3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn3 b;

    public /* synthetic */ tm3(bn3 bn3Var, byte b) {
        this.a = b;
        this.b = bn3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        bn3 bn3Var = this.b;
        switch (b) {
            case 0:
                d dVar = bn3Var.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = dVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.x2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn3Var.c0 = floatValue2;
                bn3Var.f.e(floatValue2);
                break;
            default:
                bn3Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rt1 rt1Var = bn3Var.F0;
                if (rt1Var != null && !rt1Var.e0()) {
                    bn3Var.F0.c0();
                    break;
                }
                break;
        }
    }
}
