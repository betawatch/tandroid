package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ z4 a;

    public y4(z4 z4Var) {
        this.a = z4Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z4 z4Var = this.a;
        if (z4Var.g && i10 == z4Var.e) {
            z4Var.b(objArr);
        }
    }
}
