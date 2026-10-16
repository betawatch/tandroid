package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a71 b;

    public /* synthetic */ y61(a71 a71Var, int i10) {
        this.a = i10;
        this.b = a71Var;
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
                a71 a71Var = this.b;
                a71Var.N = 0.0f;
                a71Var.I = null;
                a71Var.M = false;
                a71Var.d(true, false);
                break;
        }
    }
}
