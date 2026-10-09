package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ g1(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                l1Var.getClass();
                l1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.container.invalidate();
                break;
            default:
                l1 l1Var2 = this.b;
                l1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(l1Var2.O0[0].getHeight(), l1Var2.O0[1].getHeight(), floatValue);
                l1Var2.N0.requestLayout();
                break;
        }
    }
}
