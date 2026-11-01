package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ya1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nb1 c;

    public /* synthetic */ ya1(nb1 nb1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = nb1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f7 = z10 ? 1.0f : 0.0f;
                nb1 nb1Var = this.c;
                nb1Var.W0(f7);
                if (!z10) {
                    Activity parentActivity = nb1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) nb1Var).classGuid;
                    org.telegram.messenger.i0.k3(parentActivity, i10);
                    nb1Var.r0.setVisibility(8);
                    nb1Var.U0(true);
                    break;
                } else {
                    nb1Var.q0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.o0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
