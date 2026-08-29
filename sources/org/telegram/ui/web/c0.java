package org.telegram.ui.web;

import android.app.Activity;
import nh.d6;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.r9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ z0 a;

    public c0(z0 z0Var) {
        this.a = z0Var;
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
                z0 z0Var = this.a;
                if (i13 != 0) {
                    z0Var.v("scan_qr_popup_closed", new JSONObject());
                    return;
                }
                Activity activity = z0Var.S;
                if (activity == null) {
                    return;
                }
                z0Var.c0 = r9.e0(activity, 3, new d6(z0Var, 11));
            }
        }
    }
}
