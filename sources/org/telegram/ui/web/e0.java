package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    d1Var.g0 = u9.e0(activity, 3, new k2.u(d1Var, 16));
                }
            }
        }
    }
}
