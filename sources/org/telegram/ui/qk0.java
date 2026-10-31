package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ qk0(ll0 ll0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = ll0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.c;
                AnimatorSet animatorSet = ll0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ll0Var.M = null;
                    break;
                }
                break;
            default:
                ll0 ll0Var2 = this.c;
                AnimatorSet animatorSet2 = ll0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ll0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.c;
                AnimatorSet animatorSet = ll0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        ll0Var.N.setVisibility(4);
                        break;
                    } else {
                        ll0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ll0 ll0Var2 = this.c;
                AnimatorSet animatorSet2 = ll0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        ll0Var2.P.setVisibility(4);
                        break;
                    } else {
                        ll0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
