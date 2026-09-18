package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue1 b;

    public /* synthetic */ qe1(ue1 ue1Var, int i10) {
        this.a = i10;
        this.b = ue1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ue1 ue1Var = this.b;
                ue1Var.v = 0;
                ue1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
