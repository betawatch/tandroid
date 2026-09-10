package zh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ c7(u7 u7Var, int i10) {
        this.a = i10;
        this.b = u7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var = this.b;
                u7Var.U = floatValue;
                u7Var.o();
                i7 i7Var = u7Var.s;
                if (i7Var != null) {
                    i7Var.invalidate();
                }
                t0 t0Var = u7Var.A0;
                if (t0Var != null) {
                    t0Var.v((1.0f - u7Var.V) * u7Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var2 = this.b;
                u7Var2.U = floatValue2;
                j7 j7Var = u7Var2.v;
                if (j7Var != null && floatValue2 > 0.6f && p.c && j7Var.a) {
                    j7Var.a(false);
                }
                t0 t0Var2 = u7Var2.A0;
                if (t0Var2 != null) {
                    t0Var2.v((1.0f - u7Var2.V) * u7Var2.U);
                }
                u7Var2.o();
                i7 i7Var2 = u7Var2.s;
                if (i7Var2 != null) {
                    i7Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var3 = this.b;
                u7Var3.Z = floatValue3;
                u7Var3.d0 = Utilities.clamp(u7Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                k7 k7Var = u7Var3.n0;
                a3 currentPeerView = k7Var == null ? null : k7Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7 u7Var4 = this.b;
                u7Var4.e0 = floatValue4;
                u7Var4.v.invalidate();
                break;
        }
    }
}
