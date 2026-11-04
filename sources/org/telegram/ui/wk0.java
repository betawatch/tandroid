package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dl0 c;

    public /* synthetic */ wk0(dl0 dl0Var, boolean z10, int i3) {
        this.a = i3;
        this.c = dl0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                dl0 dl0Var = this.c;
                AnimatorSet animatorSet = dl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dl0Var.w = null;
                    break;
                }
                break;
            default:
                dl0 dl0Var2 = this.c;
                AnimatorSet animatorSet2 = dl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dl0Var2.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dl0 dl0Var = this.c;
                AnimatorSet animatorSet = dl0Var.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        dl0Var.r.setVisibility(4);
                        break;
                    } else {
                        dl0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                dl0 dl0Var2 = this.c;
                AnimatorSet animatorSet2 = dl0Var2.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        dl0Var2.s.setVisibility(4);
                        break;
                    } else {
                        dl0Var2.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
