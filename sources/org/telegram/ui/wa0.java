package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wa0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.lj0 a;
    public final /* synthetic */ org.telegram.ui.Components.ij0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public wa0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z10) {
        this.d = launchActivity;
        this.a = lj0Var;
        this.b = ij0Var;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.z0.invalidate();
        launchActivity.o0.invalidate();
        launchActivity.o0.setImageDrawable(null);
        launchActivity.o0.setVisibility(8);
        launchActivity.p0.setVisibility(8);
        org.telegram.ui.Components.lj0 lj0Var = this.a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        qy.w4 = false;
    }
}
