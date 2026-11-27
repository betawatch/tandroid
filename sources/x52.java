// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x52 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b62 b;

    public /* synthetic */ x52(b62 b62Var, byte b) {
        this.a = b;
        this.b = b62Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        b62 b62Var = this.b;
        switch (b) {
            case 0:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                break;
            default:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                break;
        }
    }
}
