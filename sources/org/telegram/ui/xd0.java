package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xd0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ zd0 a;

    public xd0(zd0 zd0Var) {
        this.a = zd0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zd0 zd0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                zd0Var.C = (GoogleSignInAccount) k7.z.b(intent).getResult(com.google.android.gms.common.api.f.class);
                zd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e6) {
                FileLog.e(e6);
            }
        }
    }
}
