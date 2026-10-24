package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ qc1 a;

    public vb1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.a;
        qc1Var.K0[qc1Var.X0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
