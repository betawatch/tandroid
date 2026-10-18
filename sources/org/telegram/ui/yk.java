package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
