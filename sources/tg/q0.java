package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ r0 b;

    public q0(r0 r0Var, o0 o0Var) {
        this.b = r0Var;
        this.a = o0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.a;
        o0Var.setLayerType(0, null);
        this.b.d.removeView(o0Var);
    }
}
