package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ sn a;

    public yk(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            sn snVar = this.a;
            if (snVar.H6 && longValue == snVar.T5) {
                return true;
            }
        }
        return false;
    }
}
