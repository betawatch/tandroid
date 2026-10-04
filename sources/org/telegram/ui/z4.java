package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
