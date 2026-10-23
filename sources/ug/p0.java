package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ q0 b;

    public p0(q0 q0Var, n0 n0Var) {
        this.b = q0Var;
        this.a = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.a;
        n0Var.setLayerType(0, null);
        this.b.d.removeView(n0Var);
    }
}
