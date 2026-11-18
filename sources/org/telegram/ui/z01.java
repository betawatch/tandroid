package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b11 b;

    public /* synthetic */ z01(b11 b11Var, int i7) {
        this.a = i7;
        this.b = b11Var;
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
                b11 b11Var = this.b;
                b11Var.O = 0.0f;
                b11Var.J = null;
                b11Var.N = false;
                b11Var.d(true, false);
                break;
        }
    }
}
