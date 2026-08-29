package th;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ g1(x1 x1Var, int i10) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x1 x1Var = this.b;
                x1Var.getClass();
                x1Var.M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1 x1Var2 = this.b;
                x1Var2.E = floatValue;
                x1Var2.v0();
                x1Var2.L.setTranslationX(AndroidUtilities.lerp(x1Var2.C[0] - x1Var2.D[0], 0, x1Var2.E));
                x1Var2.L.setTranslationY(AndroidUtilities.lerp(x1Var2.C[1] - x1Var2.D[1], 0, x1Var2.E));
                x1Var2.K.invalidate();
                break;
        }
    }
}
