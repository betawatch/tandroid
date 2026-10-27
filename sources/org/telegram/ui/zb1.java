package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ vc1 a;

    public zb1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vc1 vc1Var = this.a;
        vc1Var.K0[vc1Var.X0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
