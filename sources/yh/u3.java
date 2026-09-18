package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ u3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.d0 = false;
                break;
            case 1:
                this.b.d0 = false;
                break;
            case 2:
                this.b.N.setVisibility(4);
                break;
            case 3:
                x3 x3Var = this.b;
                x3Var.s0 = x3Var.r0;
                x3Var.d(x3Var.U);
                break;
            default:
                x3 x3Var2 = this.b;
                x3Var2.t0 = 1.0f;
                x3Var2.b.setScaleX(1.0f);
                x3Var2.b.setScaleY(x3Var2.t0);
                x3Var2.invalidate();
                break;
        }
    }
}
