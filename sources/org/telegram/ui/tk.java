package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ xn a;

    public tk(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            xn xnVar = this.a;
            if (xnVar.H6 && longValue == xnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
