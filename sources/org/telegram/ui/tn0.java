package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ co0 c;

    public /* synthetic */ tn0(co0 co0Var, boolean z10, int i9) {
        this.a = i9;
        this.c = co0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                co0 co0Var = this.c;
                AnimatorSet animatorSet = co0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    co0Var.v = null;
                    break;
                }
                break;
            default:
                co0 co0Var2 = this.c;
                AnimatorSet animatorSet2 = co0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    co0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                co0 co0Var = this.c;
                AnimatorSet animatorSet = co0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        co0Var.r.setVisibility(4);
                        break;
                    } else {
                        co0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                co0 co0Var2 = this.c;
                AnimatorSet animatorSet2 = co0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        co0Var2.s.setVisibility(4);
                        break;
                    } else {
                        co0Var2.Q.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
