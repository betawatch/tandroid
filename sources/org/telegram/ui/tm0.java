package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pn0 c;

    public /* synthetic */ tm0(pn0 pn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = pn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.c;
                AnimatorSet animatorSet = pn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pn0Var.M = null;
                    break;
                }
                break;
            default:
                pn0 pn0Var2 = this.c;
                AnimatorSet animatorSet2 = pn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.c;
                AnimatorSet animatorSet = pn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        pn0Var.N.setVisibility(4);
                        break;
                    } else {
                        pn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                pn0 pn0Var2 = this.c;
                AnimatorSet animatorSet2 = pn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        pn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        pn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
