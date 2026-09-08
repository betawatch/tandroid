package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ co a;

    public wk(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            co coVar = this.a;
            if (coVar.H6 && longValue == coVar.T5) {
                return true;
            }
        }
        return false;
    }
}
