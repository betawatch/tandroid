package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public vy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.B(profileActivity.q2 ? 1090519039 : profileActivity.S5 != null ? 553648127 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f8, profileActivity.A0), false);
        ry0 ry0Var = profileActivity.f0;
        ImageReceiver imageReceiver = ry0Var.U;
        org.telegram.ui.Components.e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ry0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ry0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ry0Var.W = null;
        }
        ry0Var.V = 0.0f;
        ry0Var.invalidate();
        profileActivity.I0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
