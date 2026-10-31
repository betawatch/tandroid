package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ xw0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.a = i10;
        this.c = profileActivity;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.f0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.d4 d4Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.c;
                boolean z10 = this.b;
                ProfileActivity.x1(profileActivity, z10);
                profileActivity.X.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                    if (p5Var.F.getWidth() != 0 && !p5Var.e.isFocused()) {
                        p5Var.e.requestFocus();
                        org.telegram.messenger.i0.J3(p5Var.e);
                    }
                }
                profileActivity.x4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.S4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).classGuid;
                    org.telegram.messenger.i0.Z2(parentActivity, i10);
                    profileActivity.O.setPreventMoving(false);
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity2 = this.c;
                if (profileActivity2.f0 != null && (d4Var = profileActivity2.g0) != null) {
                    if (!this.b) {
                        d4Var.setVisibility(4);
                    }
                    profileActivity2.f0 = null;
                    break;
                }
                break;
        }
    }
}
