package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class un0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ do0 c;

    public /* synthetic */ un0(do0 do0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = do0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                do0 do0Var = this.c;
                AnimatorSet animatorSet = do0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    do0Var.v = null;
                    break;
                }
                break;
            default:
                do0 do0Var2 = this.c;
                AnimatorSet animatorSet2 = do0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    do0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                do0 do0Var = this.c;
                AnimatorSet animatorSet = do0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        do0Var.r.setVisibility(4);
                        break;
                    } else {
                        do0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                do0 do0Var2 = this.c;
                AnimatorSet animatorSet2 = do0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        do0Var2.s.setVisibility(4);
                        break;
                    } else {
                        do0Var2.Q.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
