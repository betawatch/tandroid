package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class to0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cp0 c;

    public /* synthetic */ to0(cp0 cp0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = cp0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                cp0 cp0Var = this.c;
                AnimatorSet animatorSet = cp0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cp0Var.v = null;
                    break;
                }
                break;
            default:
                cp0 cp0Var2 = this.c;
                AnimatorSet animatorSet2 = cp0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    cp0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                cp0 cp0Var = this.c;
                AnimatorSet animatorSet = cp0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        cp0Var.r.setVisibility(4);
                        break;
                    } else {
                        cp0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                cp0 cp0Var2 = this.c;
                AnimatorSet animatorSet2 = cp0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        cp0Var2.s.setVisibility(4);
                        break;
                    } else {
                        cp0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
