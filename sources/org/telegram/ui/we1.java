package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class we1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ af1 b;

    public /* synthetic */ we1(af1 af1Var, int i10) {
        this.a = i10;
        this.b = af1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                af1 af1Var = this.b;
                af1Var.v = 0;
                af1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
