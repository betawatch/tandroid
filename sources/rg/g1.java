package rg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ g1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b;
                m1Var.getClass();
                m1Var.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.container.invalidate();
                break;
            default:
                m1 m1Var2 = this.b;
                m1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var2.N0.getLayoutParams().height = AndroidUtilities.lerp(m1Var2.O0[0].getHeight(), m1Var2.O0[1].getHeight(), floatValue);
                m1Var2.N0.requestLayout();
                break;
        }
    }
}
