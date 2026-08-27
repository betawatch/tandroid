package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ nc1 a;

    public sb1(nc1 nc1Var) {
        this.a = nc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nc1 nc1Var = this.a;
        if (nc1Var.S0 == null) {
            nc1Var.F0[0].setVisibility(4);
        }
    }
}
