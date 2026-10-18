package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ go0 c;

    public /* synthetic */ xn0(go0 go0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = go0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                go0 go0Var = this.c;
                AnimatorSet animatorSet = go0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    go0Var.v = null;
                    break;
                }
                break;
            default:
                go0 go0Var2 = this.c;
                AnimatorSet animatorSet2 = go0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    go0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                go0 go0Var = this.c;
                AnimatorSet animatorSet = go0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        go0Var.r.setVisibility(4);
                        break;
                    } else {
                        go0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                go0 go0Var2 = this.c;
                AnimatorSet animatorSet2 = go0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        go0Var2.s.setVisibility(4);
                        break;
                    } else {
                        go0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
