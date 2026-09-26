package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ wn a;

    public tk(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            wn wnVar = this.a;
            if (wnVar.H6 && longValue == wnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
