package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ da a;
    public final /* synthetic */ d1 b;

    public e0(d1 d1Var, da daVar) {
        this.b = d1Var;
        this.a = daVar;
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
                d1 d1Var = this.b;
                if (i13 != 0) {
                    d1Var.y(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = d1Var.W;
                    if (activity == null) {
                        return;
                    }
                    d1Var.g0 = w9.e0(activity, 3, new k2.u(d1Var, 16));
                }
            }
        }
    }
}
