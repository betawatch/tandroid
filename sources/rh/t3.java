package rh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class t3 extends org.telegram.ui.ActionBar.p2 {
    @Override // org.telegram.ui.ActionBar.p2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.D1);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.r50
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.D1 : findActivity;
    }
}
