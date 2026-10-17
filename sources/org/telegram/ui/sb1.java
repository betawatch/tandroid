package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class sb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ mc1 a;

    public sb1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.a;
        if (mc1Var.W0 == null) {
            mc1Var.J0[0].setVisibility(4);
        }
    }
}
