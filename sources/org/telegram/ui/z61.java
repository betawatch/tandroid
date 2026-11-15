package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z61 extends AnimatorListenerAdapter {
    public final /* synthetic */ t71 a;

    public z61(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t71 t71Var = this.a;
        if (t71Var.Y0 == null) {
            t71Var.L0[0].setVisibility(4);
        }
    }
}
