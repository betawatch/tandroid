package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yi implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.k8 b;
    public final /* synthetic */ co c;
    public final /* synthetic */ co d;

    public yi(co coVar, int i10, bi.k8 k8Var, co coVar2) {
        this.d = coVar;
        this.a = i10;
        this.b = k8Var;
        this.c = coVar2;
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
