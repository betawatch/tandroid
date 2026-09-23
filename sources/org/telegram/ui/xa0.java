package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class xa0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.bj0 a;
    public final /* synthetic */ org.telegram.ui.Components.yi0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public xa0(LaunchActivity launchActivity, org.telegram.ui.Components.bj0 bj0Var, org.telegram.ui.Components.yi0 yi0Var, boolean z10) {
        this.d = launchActivity;
        this.a = bj0Var;
        this.b = yi0Var;
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
        org.telegram.ui.Components.bj0 bj0Var = this.a;
        if (bj0Var != null) {
            bj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && bj0Var != null) {
            bj0Var.setVisibility(0);
        }
        ry.w4 = false;
    }
}
