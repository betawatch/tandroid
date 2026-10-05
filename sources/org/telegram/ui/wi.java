package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wi implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.c9 b;
    public final /* synthetic */ yn c;
    public final /* synthetic */ yn d;

    public wi(yn ynVar, int i10, ai.c9 c9Var, yn ynVar2) {
        this.d = ynVar;
        this.a = i10;
        this.b = c9Var;
        this.c = ynVar2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            AndroidUtilities.runOnUIThread(new i2.a0(this.c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.n2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
