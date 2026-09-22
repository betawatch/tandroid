package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ bo a;

    public wk(bo boVar) {
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
