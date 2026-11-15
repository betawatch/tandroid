package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y61 extends AnimatorListenerAdapter {
    public final /* synthetic */ t71 a;

    public y61(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t71 t71Var = this.a;
        t71Var.L0[t71Var.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
