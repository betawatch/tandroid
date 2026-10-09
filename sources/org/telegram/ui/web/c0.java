package org.telegram.ui.web;

import ai.ea;
import android.app.Activity;
import m.f3;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ ea a;
    public final /* synthetic */ b1 b;

    public c0(b1 b1Var, ea eaVar) {
        this.b = b1Var;
        this.a = eaVar;
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
                    b1Var.g0 = v9.e0(activity, false, 3, new f3(b1Var, 11));
                }
            }
        }
    }
}
