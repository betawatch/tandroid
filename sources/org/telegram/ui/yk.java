package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ un a;

    public yk(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            un unVar = this.a;
            if (unVar.T6 && longValue == unVar.f6) {
                return true;
            }
        }
        return false;
    }
}
