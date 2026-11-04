package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r61 extends AnimatorListenerAdapter {
    public final /* synthetic */ l71 a;

    public r61(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l71 l71Var = this.a;
        l71Var.L0[l71Var.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
