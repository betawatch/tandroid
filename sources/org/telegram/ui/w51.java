package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y51 b;

    public /* synthetic */ w51(y51 y51Var, int i10) {
        this.a = i10;
        this.b = y51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
            default:
                super.onAnimationEnd(animator);
                y51 y51Var = this.b;
                y51Var.K = 0.0f;
                y51Var.F = null;
                y51Var.J = false;
                y51Var.d(true, false);
                break;
        }
    }
}
