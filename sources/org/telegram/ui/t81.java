package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t81 extends AnimatorListenerAdapter {
    public final /* synthetic */ m91 a;

    public t81(m91 m91Var) {
        this.a = m91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m91 m91Var = this.a;
        if (m91Var.X0 == null) {
            m91Var.K0[0].setVisibility(4);
        }
    }
}
