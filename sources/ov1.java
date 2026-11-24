// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pv1 b;

    public /* synthetic */ ov1(pv1 pv1Var, byte b) {
        this.a = b;
        this.b = pv1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pv1 pv1Var = this.b;
        switch (b) {
            case 0:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pv1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = pv1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                pv1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = pv1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
