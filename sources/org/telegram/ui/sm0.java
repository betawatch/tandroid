package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ on0 c;

    public /* synthetic */ sm0(on0 on0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = on0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                on0 on0Var = this.c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    on0Var.M = null;
                    break;
                }
                break;
            default:
                on0 on0Var2 = this.c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    on0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                on0 on0Var = this.c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        on0Var.N.setVisibility(4);
                        break;
                    } else {
                        on0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                on0 on0Var2 = this.c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        on0Var2.P.setVisibility(4);
                        break;
                    } else {
                        on0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
