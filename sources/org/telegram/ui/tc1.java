package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class tc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ od1 a;

    public tc1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        od1 od1Var = this.a;
        od1Var.J0[od1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
