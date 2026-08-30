package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class te1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kf1 c;

    public /* synthetic */ te1(kf1 kf1Var, boolean z4, int i10) {
        this.a = i10;
        this.c = kf1Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.b;
                float f10 = z4 ? 1.0f : 0.0f;
                kf1 kf1Var = this.c;
                kf1Var.S0(f10);
                if (!z4) {
                    Activity parentActivity = kf1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) kf1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    kf1Var.o0.setVisibility(8);
                    kf1Var.Q0(true);
                    break;
                } else {
                    kf1Var.n0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.l0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
