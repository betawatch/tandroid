package org.telegram.ui.web;

import android.app.Activity;
import bi.k9;
import ji.u4;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ k9 a;
    public final /* synthetic */ d1 b;

    public f0(d1 d1Var, k9 k9Var) {
        this.b = d1Var;
        this.a = k9Var;
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
                    d1Var.g0 = u9.e0(activity, 3, new u4(d1Var, 15));
                }
            }
        }
    }
}
