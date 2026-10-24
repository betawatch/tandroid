package org.telegram.ui.web;

import android.app.Activity;
import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ y7 a;
    public final /* synthetic */ b1 b;

    public e0(b1 b1Var, y7 y7Var) {
        this.b = b1Var;
        this.a = y7Var;
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
                b1 b1Var = this.b;
                if (i13 != 0) {
                    b1Var.x(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = b1Var.W;
                    if (activity == null) {
                        return;
                    }
                    b1Var.g0 = w9.e0(activity, 3, new le.b(b1Var, 13));
                }
            }
        }
    }
}
