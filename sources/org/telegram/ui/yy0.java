package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ yy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                profileActivity.K1 = false;
                profileActivity.a.J0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.k4(true);
                break;
            case 1:
                ProfileActivity profileActivity = this.b;
                AnimatorSet animatorSet = profileActivity.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.w = null;
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.K1 = false;
                profileActivity2.a.J0 = true;
                profileActivity2.f2.removeListener(this);
                profileActivity2.Z0.setBackgroundColor(-16777216);
                profileActivity2.U.setVisibility(8);
                profileActivity2.j0.setVisibility(0);
                profileActivity2.j0.setAlpha(1.0f);
                break;
            case 3:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.f2.removeListener(this);
                profileActivity3.j0.setVisibility(8);
                profileActivity3.j0.setAlpha(1.0f);
                break;
            default:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.s0 = null;
                profileActivity4.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.j0.setAnimatedFileMaybe(profileActivity.a0.getImageReceiver().getAnimation());
                profileActivity.j0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
