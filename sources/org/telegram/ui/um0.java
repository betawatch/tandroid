package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class um0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qn0 c;

    public /* synthetic */ um0(qn0 qn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = qn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.c;
                AnimatorSet animatorSet = qn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qn0Var.M = null;
                    break;
                }
                break;
            default:
                qn0 qn0Var2 = this.c;
                AnimatorSet animatorSet2 = qn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.c;
                AnimatorSet animatorSet = qn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        qn0Var.N.setVisibility(4);
                        break;
                    } else {
                        qn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                qn0 qn0Var2 = this.c;
                AnimatorSet animatorSet2 = qn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        qn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        qn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
