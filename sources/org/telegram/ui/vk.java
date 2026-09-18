package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
            if (znVar.H6 && longValue == znVar.T5) {
                return true;
            }
        }
        return false;
    }
}
