package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ f1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                k1Var.getClass();
                k1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.container.invalidate();
                break;
            default:
                k1 k1Var2 = this.b;
                k1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(k1Var2.O0[0].getHeight(), k1Var2.O0[1].getHeight(), floatValue);
                k1Var2.N0.requestLayout();
                break;
        }
    }
}
