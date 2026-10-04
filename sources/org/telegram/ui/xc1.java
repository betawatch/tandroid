package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class xc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ rd1 a;

    public xc1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rd1 rd1Var = this.a;
        if (rd1Var.W0 == null) {
            rd1Var.J0[0].setVisibility(4);
        }
    }
}
