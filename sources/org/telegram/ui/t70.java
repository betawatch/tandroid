package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t70 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ v70 b;

    public t70(v70 v70Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = v70Var;
        this.a = d2Var;
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
