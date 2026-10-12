package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a71 b;

    public /* synthetic */ y61(a71 a71Var, int i10) {
        this.a = i10;
        this.b = a71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                a71 a71Var = this.b;
                a71Var.N = 0.0f;
                a71Var.I = null;
                a71Var.M = false;
                a71Var.d(true, false);
                break;
        }
    }
}
