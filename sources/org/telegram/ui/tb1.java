package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ oc1 a;

    public tb1(oc1 oc1Var) {
        this.a = oc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oc1 oc1Var = this.a;
        oc1Var.F0[oc1Var.S0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
