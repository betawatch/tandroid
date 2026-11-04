package vg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ c1(h1 h1Var, int i3) {
        this.a = i3;
        this.b = h1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var = this.b;
                h1Var.z2 = floatValue;
                h1Var.c.invalidate();
                break;
            default:
                h1 h1Var2 = this.b;
                h1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var2.G2.getLayoutParams().height = org.telegram.messenger.g0.W1(floatValue2, h1Var2.H2[0].getHeight(), h1Var2.H2[1].getHeight());
                h1Var2.G2.requestLayout();
                break;
        }
    }
}
