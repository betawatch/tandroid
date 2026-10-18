package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ mc1 a;

    public rb1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.a;
        mc1Var.J0[mc1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
