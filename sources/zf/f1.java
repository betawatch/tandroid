package zf;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ f1(k1 k1Var, int i9) {
        this.a = i9;
        this.b = k1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                k1Var.getClass();
                k1Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.container.invalidate();
                break;
            default:
                k1 k1Var2 = this.b;
                k1Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var2.J0.getLayoutParams().height = AndroidUtilities.lerp(k1Var2.K0[0].getHeight(), k1Var2.K0[1].getHeight(), floatValue);
                k1Var2.J0.requestLayout();
                break;
        }
    }
}
