package org.telegram.ui.web;

import android.app.Activity;
import di.x7;
import li.e3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ x7 a;
    public final /* synthetic */ a1 b;

    public d0(a1 a1Var, x7 x7Var) {
        this.b = a1Var;
        this.a = x7Var;
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
                    a1Var.g0 = y9.f0(activity, 3, new e3(a1Var, 13));
                }
            }
        }
    }
}
