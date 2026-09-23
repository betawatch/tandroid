package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class d0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ da a;
    public final /* synthetic */ b1 b;

    public d0(b1 b1Var, da daVar) {
        this.b = b1Var;
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
                b1 b1Var = this.b;
                if (i13 != 0) {
                    b1Var.y(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = b1Var.W;
                    if (activity == null) {
                        return;
                    }
                    b1Var.g0 = u9.e0(activity, 3, new k2.u(b1Var, 16));
                }
            }
        }
    }
}
