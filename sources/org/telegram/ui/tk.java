package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class tk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ wn a;

    public tk(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            wn wnVar = this.a;
            if (wnVar.H6 && longValue == wnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
