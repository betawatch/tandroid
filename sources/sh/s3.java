package sh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s3 extends org.telegram.ui.ActionBar.p2 {
    @Override // org.telegram.ui.ActionBar.p2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.D1);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.s50
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.D1 : findActivity;
    }
}
