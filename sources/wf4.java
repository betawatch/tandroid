// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dg4 b;

    public /* synthetic */ wf4(dg4 dg4Var, byte b) {
        this.a = b;
        this.b = dg4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dg4 dg4Var = this.b;
        switch (b) {
            case 0:
                dg4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                break;
            default:
                dg4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg4Var.invalidate();
                break;
        }
    }
}
