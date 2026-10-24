package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ sn a;

    public xk(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            sn snVar = this.a;
            if (snVar.T6 && longValue == snVar.f6) {
                return true;
            }
        }
        return false;
    }
}
