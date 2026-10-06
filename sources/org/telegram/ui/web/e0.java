package org.telegram.ui.web;

import ai.da;
import android.app.Activity;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class e0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ da a;
    public final /* synthetic */ c1 b;

    public e0(c1 c1Var, da daVar) {
        this.b = c1Var;
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
                c1 c1Var = this.b;
                if (i13 != 0) {
                    c1Var.y(this.a, "scan_qr_popup_closed", new JSONObject());
                } else {
                    Activity activity = c1Var.W;
                    if (activity == null) {
                        return;
                    }
                    c1Var.g0 = w9.e0(activity, 3, new l2.g(c1Var, 11));
                }
            }
        }
    }
}
