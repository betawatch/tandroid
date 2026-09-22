package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public tz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.A(profileActivity.p2 ? 1090519039 : profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f8, profileActivity.z0), false);
        pz0 pz0Var = profileActivity.e0;
        ImageReceiver imageReceiver = pz0Var.U;
        org.telegram.ui.Components.b6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(pz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = pz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            pz0Var.W = null;
        }
        pz0Var.V = 0.0f;
        pz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
