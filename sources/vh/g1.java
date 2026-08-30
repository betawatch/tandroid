package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ g1(y1 y1Var, int i10) {
        this.a = i10;
        this.b = y1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y1 y1Var = this.b;
                y1Var.getClass();
                y1Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1 y1Var2 = this.b;
                y1Var2.F = floatValue;
                y1Var2.v0();
                y1Var2.M.setTranslationX(AndroidUtilities.lerp(y1Var2.D[0] - y1Var2.E[0], 0, y1Var2.F));
                y1Var2.M.setTranslationY(AndroidUtilities.lerp(y1Var2.D[1] - y1Var2.E[1], 0, y1Var2.F));
                y1Var2.L.invalidate();
                break;
        }
    }
}
