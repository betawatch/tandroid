// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
