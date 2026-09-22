package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ zn a;

    public wk(zn znVar) {
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
