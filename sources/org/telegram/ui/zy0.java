package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public zy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar.A(profileActivity.q2 ? 1090519039 : profileActivity.S5 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, profileActivity.A0), false);
        vy0 vy0Var = profileActivity.f0;
        ImageReceiver imageReceiver = vy0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(vy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = vy0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            vy0Var.W = null;
        }
        vy0Var.V = 0.0f;
        vy0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.p5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
