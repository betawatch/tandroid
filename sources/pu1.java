// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pu1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu1 b;

    public /* synthetic */ pu1(qu1 qu1Var, byte b) {
        this.a = b;
        this.b = qu1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qu1 qu1Var = this.b;
        switch (b) {
            case 0:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qu1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = qu1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                qu1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = qu1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
