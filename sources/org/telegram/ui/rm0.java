package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nn0 c;

    public /* synthetic */ rm0(nn0 nn0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = nn0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                nn0 nn0Var = this.c;
                AnimatorSet animatorSet = nn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nn0Var.M = null;
                    break;
                }
                break;
            default:
                nn0 nn0Var2 = this.c;
                AnimatorSet animatorSet2 = nn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nn0Var2.M = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nn0 nn0Var = this.c;
                AnimatorSet animatorSet = nn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        nn0Var.N.setVisibility(4);
                        break;
                    } else {
                        nn0Var.L.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                nn0 nn0Var2 = this.c;
                AnimatorSet animatorSet2 = nn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        nn0Var2.P.setVisibility(4);
                        break;
                    } else {
                        nn0Var2.O.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
