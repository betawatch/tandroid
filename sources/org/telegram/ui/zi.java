package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zi implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.c9 b;
    public final /* synthetic */ bo c;
    public final /* synthetic */ bo d;

    public zi(bo boVar, int i10, ai.c9 c9Var, bo boVar2) {
        this.d = boVar;
        this.a = i10;
        this.b = c9Var;
        this.c = boVar2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            AndroidUtilities.runOnUIThread(new i2.z(this.c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.o2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
