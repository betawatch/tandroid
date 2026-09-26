package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class r3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ r3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
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
                u3 u3Var = this.b;
                u3Var.s0 = u3Var.r0;
                u3Var.d(u3Var.U);
                break;
            default:
                u3 u3Var2 = this.b;
                u3Var2.t0 = 1.0f;
                u3Var2.b.setScaleX(1.0f);
                u3Var2.b.setScaleY(u3Var2.t0);
                u3Var2.invalidate();
                break;
        }
    }
}
