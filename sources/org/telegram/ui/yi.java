package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.c9 b;
    public final /* synthetic */ bo c;
    public final /* synthetic */ bo d;

    public yi(bo boVar, int i10, ai.c9 c9Var, bo boVar2) {
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
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
