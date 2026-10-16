package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public yz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar.C(profileActivity.p2 ? 1090519039 : profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f8, profileActivity.z0), false);
        uz0 uz0Var = profileActivity.e0;
        ImageReceiver imageReceiver = uz0Var.U;
        org.telegram.ui.Components.f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(uz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = uz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            uz0Var.W = null;
        }
        uz0Var.V = 0.0f;
        uz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
