package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ o0 b;

    public n0(o0 o0Var, m0 m0Var) {
        this.b = o0Var;
        this.a = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.a;
        m0Var.setLayerType(0, null);
        this.b.d.removeView(m0Var);
    }
}
