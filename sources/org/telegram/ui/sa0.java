package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sa0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.jj0 a;
    public final /* synthetic */ org.telegram.ui.Components.gj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public sa0(LaunchActivity launchActivity, org.telegram.ui.Components.jj0 jj0Var, org.telegram.ui.Components.gj0 gj0Var, boolean z4) {
        this.d = launchActivity;
        this.a = jj0Var;
        this.b = gj0Var;
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
        org.telegram.ui.Components.jj0 jj0Var = this.a;
        if (jj0Var != null) {
            jj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && jj0Var != null) {
            jj0Var.setVisibility(0);
        }
        oy.u4 = false;
    }
}
