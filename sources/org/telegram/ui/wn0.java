package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fo0 c;

    public /* synthetic */ wn0(fo0 fo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = fo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                fo0 fo0Var = this.c;
                AnimatorSet animatorSet = fo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fo0Var.v = null;
                    break;
                }
                break;
            default:
                fo0 fo0Var2 = this.c;
                AnimatorSet animatorSet2 = fo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fo0 fo0Var = this.c;
                AnimatorSet animatorSet = fo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        fo0Var.r.setVisibility(4);
                        break;
                    } else {
                        fo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                fo0 fo0Var2 = this.c;
                AnimatorSet animatorSet2 = fo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        fo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        fo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
