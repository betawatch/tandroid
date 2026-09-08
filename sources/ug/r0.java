package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ p0 a;
    public final /* synthetic */ s0 b;

    public r0(s0 s0Var, p0 p0Var) {
        this.b = s0Var;
        this.a = p0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.a;
        p0Var.setLayerType(0, null);
        this.b.d.removeView(p0Var);
    }
}
