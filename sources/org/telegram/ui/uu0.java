package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ uu0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.P5 = null;
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int i3 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i3) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.d2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                kVar.C(profileActivity.p2 ? 1090519039 : profileActivity.h6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, profileActivity.A0), false);
                qu0 qu0Var = profileActivity.f0;
                ImageReceiver imageReceiver = qu0Var.V;
                org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(qu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.cc ccVar = qu0Var.a0;
                if (ccVar != null) {
                    ccVar.a();
                    qu0Var.a0 = null;
                }
                qu0Var.W = 0.0f;
                qu0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.L5(false);
                break;
            case 1:
                if (profileActivity.P5 != null && !profileActivity.S5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.Q5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.k5, 1.0f));
                    profileActivity.Q5.setDuration(100L);
                    profileActivity.Q5.addListener(new y20(this, 21));
                    profileActivity.Q5.start();
                }
                profileActivity.L5(false);
                profileActivity.P5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.T6;
                profileActivity.y4(true);
                break;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.w = null;
                    break;
                }
                break;
            case 4:
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                profileActivity.j2.removeListener(this);
                profileActivity.d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.o0.setVisibility(0);
                profileActivity.o0.setAlpha(1.0f);
                break;
            case 5:
                profileActivity.j2.removeListener(this);
                profileActivity.o0.setVisibility(8);
                profileActivity.o0.setAlpha(1.0f);
                break;
            default:
                profileActivity.x0 = null;
                profileActivity.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.o0.setAnimatedFileMaybe(profileActivity.f0.getImageReceiver().m());
                profileActivity.o0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
