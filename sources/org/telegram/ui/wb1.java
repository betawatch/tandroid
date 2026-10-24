package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ qc1 a;

    public wb1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.a;
        if (qc1Var.X0 == null) {
            qc1Var.K0[0].setVisibility(4);
        }
    }
}
