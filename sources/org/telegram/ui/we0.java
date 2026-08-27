package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class we0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ xe0 a;

    public we0(xe0 xe0Var) {
        this.a = xe0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xe0 xe0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                xe0Var.y = (GoogleSignInAccount) g7.m8.b(intent).getResult(com.google.android.gms.common.api.f.class);
                xe0Var.h(null);
            } catch (com.google.android.gms.common.api.f e9) {
                FileLog.e(e9);
            }
        }
    }
}
