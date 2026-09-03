package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            if (xnVar.E6 && longValue == xnVar.Q5) {
                return true;
            }
        }
        return false;
    }
}
