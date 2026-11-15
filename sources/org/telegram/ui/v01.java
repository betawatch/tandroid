package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x01 b;

    public /* synthetic */ v01(x01 x01Var, int i7) {
        this.a = i7;
        this.b = x01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                x01 x01Var = this.b;
                x01Var.O = 0.0f;
                x01Var.J = null;
                x01Var.N = false;
                x01Var.d(true, false);
                break;
        }
    }
}
