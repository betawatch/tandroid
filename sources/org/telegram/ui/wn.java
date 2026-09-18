package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class wn extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.lc0 a;

    public wn(org.telegram.ui.Components.lc0 lc0Var) {
        this.a = lc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.s(1.0f);
    }
}
