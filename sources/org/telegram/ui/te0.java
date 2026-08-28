package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class te0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ ue0 a;

    public te0(ue0 ue0Var) {
        this.a = ue0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ue0 ue0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ue0Var.y = (GoogleSignInAccount) f7.s8.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ue0Var.h(null);
            } catch (com.google.android.gms.common.api.f e10) {
                FileLog.e(e10);
            }
        }
    }
}
