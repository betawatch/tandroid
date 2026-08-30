package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ud1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd1 b;

    public /* synthetic */ ud1(yd1 yd1Var, int i10) {
        this.a = i10;
        this.b = yd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yd1 yd1Var = this.b;
                yd1Var.v = 0;
                yd1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.C.setVisibility(8);
                break;
        }
    }
}
