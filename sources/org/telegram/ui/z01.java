package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
