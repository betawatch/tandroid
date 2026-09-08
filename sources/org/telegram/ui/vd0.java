package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ vd0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wg0 wg0Var = this.b;
                if (wg0Var.d == animator) {
                    wg0Var.d = null;
                    break;
                }
                break;
            default:
                wg0 wg0Var2 = this.b;
                wg0Var2.c.setVisibility(8);
                if (wg0Var2.d == animator) {
                    wg0Var2.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
