package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ta0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.lj0 a;
    public final /* synthetic */ org.telegram.ui.Components.ij0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ta0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z4) {
        this.d = launchActivity;
        this.a = lj0Var;
        this.b = ij0Var;
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
        org.telegram.ui.Components.lj0 lj0Var = this.a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        py.u4 = false;
    }
}
