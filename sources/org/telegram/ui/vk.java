package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ zn a;

    public vk(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            zn znVar = this.a;
            if (znVar.E6 && longValue == znVar.Q5) {
                return true;
            }
        }
        return false;
    }
}
