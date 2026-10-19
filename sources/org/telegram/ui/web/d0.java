package org.telegram.ui.web;

import android.app.Activity;
import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ z7 a;
    public final /* synthetic */ a1 b;

    public d0(a1 a1Var, z7 z7Var) {
        this.b = a1Var;
        this.a = z7Var;
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
                a1 a1Var = this.b;
                if (i13 != 0) {
                    a1Var.x(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = a1Var.W;
                    if (activity == null) {
                        return;
                    }
                    a1Var.g0 = w9.e0(activity, 3, new le.b(a1Var, 13));
                }
            }
        }
    }
}
