package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class uc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ od1 a;

    public uc1(od1 od1Var) {
        this.a = od1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        od1 od1Var = this.a;
        if (od1Var.W0 == null) {
            od1Var.J0[0].setVisibility(4);
        }
    }
}
