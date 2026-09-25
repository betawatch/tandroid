package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
