package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
