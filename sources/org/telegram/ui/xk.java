package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
