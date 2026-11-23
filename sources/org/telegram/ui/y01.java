package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a11 b;

    public /* synthetic */ y01(a11 a11Var, int i7) {
        this.a = i7;
        this.b = a11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                a11 a11Var = this.b;
                a11Var.O = 0.0f;
                a11Var.J = null;
                a11Var.N = false;
                a11Var.d(true, false);
                break;
        }
    }
}
