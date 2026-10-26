package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ tc1 a;

    public yb1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tc1 tc1Var = this.a;
        if (tc1Var.X0 == null) {
            tc1Var.K0[0].setVisibility(4);
        }
    }
}
