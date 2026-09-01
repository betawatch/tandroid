package wh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ h1(z1 z1Var, int i10) {
        this.a = i10;
        this.b = z1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z1 z1Var = this.b;
                z1Var.getClass();
                z1Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.f0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1 z1Var2 = this.b;
                z1Var2.F = floatValue;
                z1Var2.v0();
                z1Var2.M.setTranslationX(AndroidUtilities.lerp(z1Var2.D[0] - z1Var2.E[0], 0, z1Var2.F));
                z1Var2.M.setTranslationY(AndroidUtilities.lerp(z1Var2.D[1] - z1Var2.E[1], 0, z1Var2.F));
                z1Var2.L.invalidate();
                break;
        }
    }
}
