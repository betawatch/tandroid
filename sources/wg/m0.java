package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, l0 l0Var) {
        this.b = n0Var;
        this.a = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.a;
        l0Var.setLayerType(0, null);
        this.b.d.removeView(l0Var);
    }
}
