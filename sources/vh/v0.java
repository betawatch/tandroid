package vh;

import android.animation.ValueAnimator;
import org.telegram.messenger.q20;
import org.telegram.ui.hk;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ v0(u1 u1Var, int i10) {
        this.a = i10;
        this.b = u1Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        u1 u1Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = u1Var.c;
                boolean z10 = u1Var.r1;
                boolean z11 = u1Var.d;
                if (z10 != z11) {
                    u1Var.r1 = z11;
                    p2Var.clearAnimation();
                    float f7 = 0.0f;
                    if (u1Var.d) {
                        int i11 = org.telegram.messenger.i0.q.y;
                        int i12 = u1Var.f;
                        f7 = Math.min(0.0f, Math.max(((i11 - i12) * 0.3f) - u1Var.u1, (-i12) / 3.0f));
                    }
                    p2Var.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.w).start();
                    break;
                }
                break;
            case 1:
                hk hkVar = u1Var.m1;
                ValueAnimator valueAnimator = hkVar.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && hkVar.getCurrentPosition() != num.intValue()) {
                    hkVar.E(num.intValue());
                    t1 t1Var = u1Var.n1;
                    t1Var.F = num.intValue();
                    t1Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i13 = u1.y1;
                u1Var.M0(intValue);
                break;
        }
    }
}
