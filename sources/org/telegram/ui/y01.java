package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                a11 a11Var = this.b;
                a11Var.N = 0.0f;
                a11Var.I = null;
                a11Var.M = false;
                a11Var.d(true, false);
                break;
        }
    }
}
