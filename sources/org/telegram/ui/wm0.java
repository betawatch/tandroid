package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sn0 c;

    public /* synthetic */ wm0(sn0 sn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = sn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                sn0 sn0Var = this.c;
                AnimatorSet animatorSet = sn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sn0Var.M = null;
                    break;
                }
                break;
            default:
                sn0 sn0Var2 = this.c;
                AnimatorSet animatorSet2 = sn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sn0 sn0Var = this.c;
                AnimatorSet animatorSet = sn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        sn0Var.N.setVisibility(4);
                        break;
                    } else {
                        sn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                sn0 sn0Var2 = this.c;
                AnimatorSet animatorSet2 = sn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        sn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        sn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
