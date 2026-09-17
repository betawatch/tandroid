package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
