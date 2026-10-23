package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class zn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ io0 c;

    public /* synthetic */ zn0(io0 io0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = io0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                io0 io0Var = this.c;
                AnimatorSet animatorSet = io0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    io0Var.v = null;
                    break;
                }
                break;
            default:
                io0 io0Var2 = this.c;
                AnimatorSet animatorSet2 = io0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    io0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                io0 io0Var = this.c;
                AnimatorSet animatorSet = io0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        io0Var.r.setVisibility(4);
                        break;
                    } else {
                        io0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                io0 io0Var2 = this.c;
                AnimatorSet animatorSet2 = io0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        io0Var2.s.setVisibility(4);
                        break;
                    } else {
                        io0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
