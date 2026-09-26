package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ s(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b.c;
                if (g0Var != null) {
                    g0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                b1 b1Var = this.b;
                da daVar = b1Var.I0;
                ei.w0 w0Var = b1Var.k0;
                w0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", w0Var.d());
                    if (w0Var.d()) {
                        jSONObject.put("access_requested", w0Var.d);
                        if (w0Var.d) {
                            jSONObject.put("access_granted", w0Var.e && w0Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                b1Var.y(daVar, "location_checked", jSONObject);
                break;
            default:
                b1 b1Var2 = this.b;
                if (b1Var2.S) {
                    b1Var2.S = false;
                    g0 g0Var2 = b1Var2.c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
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
