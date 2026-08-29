package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ub1 extends AnimatorListenerAdapter {
    public final /* synthetic */ qc1 a;

    public ub1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.a;
        qc1Var.F0[qc1Var.S0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
