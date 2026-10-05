package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z4 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ a5 a;

    public z4(a5 a5Var) {
        this.a = a5Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a5 a5Var = this.a;
        if (a5Var.g && i10 == a5Var.e) {
            a5Var.b(objArr);
        }
    }
}
