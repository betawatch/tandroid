package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a61 b;

    public /* synthetic */ y51(a61 a61Var, int i10) {
        this.a = i10;
        this.b = a61Var;
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
                a61 a61Var = this.b;
                a61Var.K = 0.0f;
                a61Var.F = null;
                a61Var.J = false;
                a61Var.d(true, false);
                break;
        }
    }
}
