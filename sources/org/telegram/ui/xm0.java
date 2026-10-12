package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ un0 c;

    public /* synthetic */ xm0(un0 un0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = un0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                un0 un0Var = this.c;
                AnimatorSet animatorSet = un0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    un0Var.M = null;
                    break;
                }
                break;
            default:
                un0 un0Var2 = this.c;
                AnimatorSet animatorSet2 = un0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    un0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                un0 un0Var = this.c;
                AnimatorSet animatorSet = un0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        un0Var.N.setVisibility(4);
                        break;
                    } else {
                        un0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                un0 un0Var2 = this.c;
                AnimatorSet animatorSet2 = un0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        un0Var2.P.setVisibility(4);
                        break;
                    } else {
                        un0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
