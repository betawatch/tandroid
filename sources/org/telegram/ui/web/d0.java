package org.telegram.ui.web;

import android.app.Activity;
import bi.n9;
import ji.h5;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ c1 b;

    public d0(c1 c1Var, n9 n9Var) {
        this.b = c1Var;
        this.a = n9Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.onRequestPermissionResultReceived;
        if (i10 == i12) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == 5000) {
                NotificationCenter.getGlobalInstance().removeObserver(this, i12);
                int i13 = iArr[0];
                c1 c1Var = this.b;
                if (i13 != 0) {
                    c1Var.x(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = c1Var.W;
                    if (activity == null) {
                        return;
                    }
                    c1Var.g0 = z9.e0(activity, false, 3, new h5(c1Var, 17));
                }
            }
        }
    }
}
