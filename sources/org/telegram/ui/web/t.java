package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ t(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
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
                a1 a1Var = this.b;
                z7 z7Var = a1Var.I0;
                gi.u0 u0Var = a1Var.k0;
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
                a1Var.x(z7Var, "location_checked", jSONObject);
                break;
            default:
                a1 a1Var2 = this.b;
                if (a1Var2.S) {
                    a1Var2.S = false;
                    g0 g0Var2 = a1Var2.c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.N = false;
                a1Var2.P = 0L;
                a1Var2.T = false;
                x0 x0Var = a1Var2.a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
