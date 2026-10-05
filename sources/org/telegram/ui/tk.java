package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ yn a;

    public tk(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            yn ynVar = this.a;
            if (ynVar.F6 && longValue == ynVar.R5) {
                return true;
            }
        }
        return false;
    }
}
