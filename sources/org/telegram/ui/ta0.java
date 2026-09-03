package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ta0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.kj0 a;
    public final /* synthetic */ org.telegram.ui.Components.hj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ta0(LaunchActivity launchActivity, org.telegram.ui.Components.kj0 kj0Var, org.telegram.ui.Components.hj0 hj0Var, boolean z4) {
        this.d = launchActivity;
        this.a = kj0Var;
        this.b = hj0Var;
        this.c = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.D0 = null;
        launchActivity.w0.invalidate();
        launchActivity.l0.invalidate();
        launchActivity.l0.setImageDrawable(null);
        launchActivity.l0.setVisibility(8);
        launchActivity.m0.setVisibility(8);
        org.telegram.ui.Components.kj0 kj0Var = this.a;
        if (kj0Var != null) {
            kj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && kj0Var != null) {
            kj0Var.setVisibility(0);
        }
        py.u4 = false;
    }
}
