package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ bo a;

    public xk(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            bo boVar = this.a;
            if (boVar.H6 && longValue == boVar.T5) {
                return true;
            }
        }
        return false;
    }
}
