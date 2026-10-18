package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ u(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b.c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                b1 b1Var = this.b;
                y7 y7Var = b1Var.I0;
                gi.u0 u0Var = b1Var.k0;
                u0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", u0Var.d());
                    if (u0Var.d()) {
                        jSONObject.put("access_requested", u0Var.d);
                        if (u0Var.d) {
                            jSONObject.put("access_granted", u0Var.e && u0Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                b1Var.x(y7Var, "location_checked", jSONObject);
                break;
            default:
                b1 b1Var2 = this.b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    h0 h0Var2 = b1Var2.c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                b1Var2.c();
                b1Var2.N = false;
                b1Var2.P = 0L;
                b1Var2.T = false;
                y0 y0Var = b1Var2.a;
                if (y0Var != null) {
                    y0Var.onResume();
                    b1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
