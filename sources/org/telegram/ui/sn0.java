package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bo0 c;

    public /* synthetic */ sn0(bo0 bo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = bo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                bo0 bo0Var = this.c;
                AnimatorSet animatorSet = bo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bo0Var.v = null;
                    break;
                }
                break;
            default:
                bo0 bo0Var2 = this.c;
                AnimatorSet animatorSet2 = bo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bo0 bo0Var = this.c;
                AnimatorSet animatorSet = bo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        bo0Var.r.setVisibility(4);
                        break;
                    } else {
                        bo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                bo0 bo0Var2 = this.c;
                AnimatorSet animatorSet2 = bo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        bo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        bo0Var2.Q.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
