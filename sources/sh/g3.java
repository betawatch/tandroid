package sh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ g3(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i3 i3Var = this.b.n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
