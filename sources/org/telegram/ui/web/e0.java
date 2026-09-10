package org.telegram.ui.web;

import android.app.Activity;
import m.g3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ c1 b;

    public e0(c1 c1Var, a1 a1Var) {
        this.b = c1Var;
        this.a = a1Var;
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
                    Activity activity = c1Var.W;
                    if (activity == null) {
                        return;
                    }
                    c1Var.g0 = u9.e0(activity, 3, new g3(c1Var, 11));
                }
            }
        }
    }
}
