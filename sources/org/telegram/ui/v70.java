package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class v70 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 a;
    public final /* synthetic */ y70 b;

    public v70(y70 y70Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.b = y70Var;
        this.a = a2Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.reloadInterface) {
            this.a.dismiss();
            NotificationCenter.getGlobalInstance().removeObserver(this, i10);
            AndroidUtilities.runOnUIThread(new c10(this, 12), 100L);
        }
    }
}
