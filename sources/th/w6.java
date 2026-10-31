package th;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ w6(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var = this.b;
                o7Var.U = floatValue;
                o7Var.B();
                c7 c7Var = o7Var.s;
                if (c7Var != null) {
                    c7Var.invalidate();
                }
                s0 s0Var = o7Var.A0;
                if (s0Var != null) {
                    s0Var.v((1.0f - o7Var.V) * o7Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var2 = this.b;
                o7Var2.U = floatValue2;
                d7 d7Var = o7Var2.w;
                if (d7Var != null && floatValue2 > 0.6f && p.c && d7Var.a) {
                    d7Var.a(false);
                }
                s0 s0Var2 = o7Var2.A0;
                if (s0Var2 != null) {
                    s0Var2.v((1.0f - o7Var2.V) * o7Var2.U);
                }
                o7Var2.B();
                c7 c7Var2 = o7Var2.s;
                if (c7Var2 != null) {
                    c7Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var3 = this.b;
                o7Var3.Z = floatValue3;
                o7Var3.d0 = Utilities.i(o7Var3.Z / org.telegram.messenger.i0.L(200.0f), 1.0f, 0.0f);
                e7 e7Var = o7Var3.n0;
                z2 currentPeerView = e7Var == null ? null : e7Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7 o7Var4 = this.b;
                o7Var4.e0 = floatValue4;
                o7Var4.w.invalidate();
                break;
        }
    }
}
