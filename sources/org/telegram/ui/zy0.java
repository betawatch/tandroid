package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ zy0(ProfileActivity profileActivity, boolean z10, int i9) {
        this.a = i9;
        this.c = profileActivity;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.b0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.c;
                boolean z10 = this.b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.U.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    if (w0Var.B.getWidth() != 0 && !w0Var.e.isFocused()) {
                        w0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.R1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Q4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i9);
                    profileActivity.L.setPreventMoving(false);
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity2 = this.c;
                if (profileActivity2.b0 != null && (z3Var = profileActivity2.c0) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.b0 = null;
                    break;
                }
                break;
        }
    }
}
