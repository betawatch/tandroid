package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ui implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg.u1 b;
    public final /* synthetic */ xn c;
    public final /* synthetic */ xn d;

    public ui(xn xnVar, int i10, dg.u1 u1Var, xn xnVar2) {
        this.d = xnVar;
        this.a = i10;
        this.b = u1Var;
        this.c = xnVar2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = NotificationCenter.messagesDidLoad;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            AndroidUtilities.runOnUIThread(new j3.b0(this.c, i10, i11, objArr), 50L);
            i12 = ((org.telegram.ui.ActionBar.p2) this.d).currentAccount;
            NotificationCenter.getInstance(i12).removeObserver(this, i13);
        }
    }
}
