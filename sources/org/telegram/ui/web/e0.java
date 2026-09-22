package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                    d1Var.g0 = v9.e0(activity, 3, new l.d(d1Var, 14));
                }
            }
        }
    }
}
