package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ p0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.K = null;
                q0Var.f.f(new org.telegram.ui.web.u0(this, 9));
                break;
            default:
                this.b.f.f(new org.telegram.ui.web.u0(this, 10));
                break;
        }
    }
}
