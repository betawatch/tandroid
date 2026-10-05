package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ s(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
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
                c1 c1Var = this.b;
                da daVar = c1Var.I0;
                ei.x0 x0Var = c1Var.k0;
                x0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", x0Var.d());
                    if (x0Var.d()) {
                        jSONObject.put("access_requested", x0Var.d);
                        if (x0Var.d) {
                            jSONObject.put("access_granted", x0Var.e && x0Var.a());
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                c1Var.y(daVar, "location_checked", jSONObject);
                break;
            default:
                c1 c1Var2 = this.b;
                if (c1Var2.S) {
                    c1Var2.S = false;
                    h0 h0Var2 = c1Var2.c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.N = false;
                c1Var2.P = 0L;
                c1Var2.T = false;
                z0 z0Var = c1Var2.a;
                if (z0Var != null) {
                    z0Var.onResume();
                    c1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
