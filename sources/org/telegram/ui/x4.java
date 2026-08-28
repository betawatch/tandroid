package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ y4 a;

    public x4(y4 y4Var) {
        this.a = y4Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        y4 y4Var = this.a;
        if (y4Var.g && i9 == y4Var.e) {
            y4Var.b(objArr);
        }
    }
}
