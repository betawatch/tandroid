package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ p0 b;

    public o0(p0 p0Var, n0 n0Var) {
        this.b = p0Var;
        this.a = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.a;
        n0Var.setLayerType(0, null);
        this.b.d.removeView(n0Var);
    }
}
