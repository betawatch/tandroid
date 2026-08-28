package org.telegram.ui.web;

import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ y0 a;

    public a0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.onRequestPermissionResultReceived;
        if (i9 == i11) {
            int intValue = ((Integer) objArr[0]).intValue();
            int[] iArr = (int[]) objArr[2];
            if (intValue == 5000) {
                NotificationCenter.getGlobalInstance().removeObserver(this, i11);
                int i12 = iArr[0];
                y0 y0Var = this.a;
                if (i12 != 0) {
                    y0Var.v("scan_qr_popup_closed", new JSONObject());
                    return;
                }
                Activity activity = y0Var.S;
                if (activity == null) {
                    return;
                }
                y0Var.c0 = s9.d0(activity, 3, new n5.a0(y0Var, 11));
            }
        }
    }
}
