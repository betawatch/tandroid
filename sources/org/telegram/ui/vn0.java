package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ eo0 c;

    public /* synthetic */ vn0(eo0 eo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = eo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                eo0 eo0Var = this.c;
                AnimatorSet animatorSet = eo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eo0Var.v = null;
                    break;
                }
                break;
            default:
                eo0 eo0Var2 = this.c;
                AnimatorSet animatorSet2 = eo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    eo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                eo0 eo0Var = this.c;
                AnimatorSet animatorSet = eo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        eo0Var.r.setVisibility(4);
                        break;
                    } else {
                        eo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                eo0 eo0Var2 = this.c;
                AnimatorSet animatorSet2 = eo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        eo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        eo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
