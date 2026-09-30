package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s0Var.K = null;
                s0Var.f.f(new org.telegram.ui.web.q0(this, 10));
                break;
            default:
                this.b.f.f(new org.telegram.ui.web.q0(this, 11));
                break;
        }
    }
}
