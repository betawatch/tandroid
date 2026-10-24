package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ p0 b;

    public o0(p0 p0Var, m0 m0Var) {
        this.b = p0Var;
        this.a = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.a;
        m0Var.setLayerType(0, null);
        this.b.d.removeView(m0Var);
    }
}
