package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t61 b;

    public /* synthetic */ r61(t61 t61Var, int i10) {
        this.a = i10;
        this.b = t61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                t61 t61Var = this.b;
                t61Var.N = 0.0f;
                t61Var.I = null;
                t61Var.M = false;
                t61Var.d(true, false);
                break;
        }
    }
}
