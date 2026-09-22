package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class t3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ t3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
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
                w3 w3Var = this.b;
                w3Var.s0 = w3Var.r0;
                w3Var.d(w3Var.U);
                break;
            default:
                w3 w3Var2 = this.b;
                w3Var2.t0 = 1.0f;
                w3Var2.b.setScaleX(1.0f);
                w3Var2.b.setScaleY(w3Var2.t0);
                w3Var2.invalidate();
                break;
        }
    }
}
