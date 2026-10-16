package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ro0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ap0 c;

    public /* synthetic */ ro0(ap0 ap0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = ap0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.c;
                AnimatorSet animatorSet = ap0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ap0Var.v = null;
                    break;
                }
                break;
            default:
                ap0 ap0Var2 = this.c;
                AnimatorSet animatorSet2 = ap0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ap0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.c;
                AnimatorSet animatorSet = ap0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ap0Var.r.setVisibility(4);
                        break;
                    } else {
                        ap0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ap0 ap0Var2 = this.c;
                AnimatorSet animatorSet2 = ap0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ap0Var2.s.setVisibility(4);
                        break;
                    } else {
                        ap0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
