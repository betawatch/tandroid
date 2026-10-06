package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
