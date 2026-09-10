package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ eo a;

    public yk(eo eoVar) {
        this.a = eoVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            eo eoVar = this.a;
            if (eoVar.H6 && longValue == eoVar.T5) {
                return true;
            }
        }
        return false;
    }
}
