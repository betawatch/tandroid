package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class uz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public uz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar.A(profileActivity.p2 ? 1090519039 : profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.z0), false);
        qz0 qz0Var = profileActivity.e0;
        ImageReceiver imageReceiver = qz0Var.U;
        org.telegram.ui.Components.b6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(qz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = qz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            qz0Var.W = null;
        }
        qz0Var.V = 0.0f;
        qz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
