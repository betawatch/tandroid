package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vm0 c;

    public /* synthetic */ zl0(vm0 vm0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = vm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.c;
                AnimatorSet animatorSet = vm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vm0Var.I = null;
                    break;
                }
                break;
            default:
                vm0 vm0Var2 = this.c;
                AnimatorSet animatorSet2 = vm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vm0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.c;
                AnimatorSet animatorSet = vm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        vm0Var.J.setVisibility(4);
                        break;
                    } else {
                        vm0Var.H.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                vm0 vm0Var2 = this.c;
                AnimatorSet animatorSet2 = vm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        vm0Var2.L.setVisibility(4);
                        break;
                    } else {
                        vm0Var2.K.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
