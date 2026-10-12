package org.telegram.ui.web;

import android.app.Activity;
import bi.n9;
import ji.d4;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ b1 b;

    public d0(b1 b1Var, n9 n9Var) {
        this.b = b1Var;
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
                b1 b1Var = this.b;
                if (i13 != 0) {
                    b1Var.x(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = b1Var.W;
                    if (activity == null) {
                        return;
                    }
                    b1Var.g0 = z9.e0(activity, false, 3, new d4(b1Var, 16));
                }
            }
        }
    }
}
