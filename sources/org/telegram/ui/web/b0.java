package org.telegram.ui.web;

import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ a1 a;

    public b0(a1 a1Var) {
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
                a1 a1Var = this.a;
                if (i13 != 0) {
                    a1Var.v("scan_qr_popup_closed", new JSONObject());
                    return;
                }
                Activity activity = a1Var.T;
                if (activity == null) {
                    return;
                }
                a1Var.d0 = v9.e0(activity, 3, new e0(a1Var, 0));
            }
        }
    }
}
