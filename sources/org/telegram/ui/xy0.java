package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public xy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.B(profileActivity.q2 ? 1090519039 : profileActivity.S5 != null ? 553648127 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f8, profileActivity.A0), false);
        ty0 ty0Var = profileActivity.f0;
        ImageReceiver imageReceiver = ty0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ty0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ty0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ty0Var.W = null;
        }
        ty0Var.V = 0.0f;
        ty0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
