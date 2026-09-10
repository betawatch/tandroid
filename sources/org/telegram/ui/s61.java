package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u61 b;

    public /* synthetic */ s61(u61 u61Var, int i10) {
        this.a = i10;
        this.b = u61Var;
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
                u61 u61Var = this.b;
                u61Var.N = 0.0f;
                u61Var.I = null;
                u61Var.M = false;
                u61Var.d(true, false);
                break;
        }
    }
}
