package rh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.q50
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.D1 : findActivity;
    }
}
