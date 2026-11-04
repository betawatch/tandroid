package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d81 b;

    public /* synthetic */ z71(d81 d81Var, int i3) {
        this.a = i3;
        this.b = d81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d81 d81Var = this.b;
                d81Var.w = 0;
                d81Var.n.setVisibility(8);
                break;
            case 1:
                this.b.w = 0;
                break;
            default:
                this.b.G.setVisibility(8);
                break;
        }
    }
}
