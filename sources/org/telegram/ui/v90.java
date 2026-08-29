package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v90 implements org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ v90(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Pattern pattern = LaunchActivity.x1;
        MessagesController.getInstance(this.a.K).performLogout(2);
    }

    @Override // org.telegram.ui.Components.md0
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        Pattern pattern = LaunchActivity.x1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.H0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.I0, launchActivity.J0, true, null, false, true);
            launchActivity.H0 = null;
        }
        launchActivity.m0.getView().setVisibility(0);
        launchActivity.m0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.m0;
        org.telegram.ui.ActionBar.o2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.C0, actionBarLayout.D0, actionBarLayout.E0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.n0.U(true, true);
            launchActivity.o0.U(true, true);
            if (launchActivity.n0.getView().getVisibility() == 4) {
                launchActivity.n0.getView().setVisibility(0);
            }
            launchActivity.o0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
