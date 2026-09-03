package org.telegram.ui.web;

import android.app.Activity;
import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ j7 a;
    public final /* synthetic */ c1 b;

    public d0(c1 c1Var, j7 j7Var) {
        this.b = c1Var;
        this.a = j7Var;
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
                    c1Var.z(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = c1Var.T;
                    if (activity == null) {
                        return;
                    }
                    c1Var.d0 = x9.e0(activity, 3, new o3.c(c1Var, 8));
                }
            }
        }
    }
}
