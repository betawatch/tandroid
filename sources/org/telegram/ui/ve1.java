package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ve1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mf1 c;

    public /* synthetic */ ve1(mf1 mf1Var, boolean z4, int i10) {
        this.a = i10;
        this.c = mf1Var;
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
                mf1 mf1Var = this.c;
                mf1Var.S0(f10);
                if (!z4) {
                    Activity parentActivity = mf1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) mf1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    mf1Var.o0.setVisibility(8);
                    mf1Var.Q0(true);
                    break;
                } else {
                    mf1Var.n0.setVisibility(8);
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
