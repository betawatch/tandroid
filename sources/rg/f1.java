package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
