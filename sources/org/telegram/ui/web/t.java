package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ t(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
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
                c1 c1Var = this.b;
                j7 j7Var = c1Var.F0;
                rh.q0 q0Var = c1Var.h0;
                q0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", q0Var.d());
                    if (q0Var.d()) {
                        jSONObject.put("access_requested", q0Var.d);
                        if (q0Var.d) {
                            jSONObject.put("access_granted", q0Var.e && q0Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                c1Var.z(j7Var, "location_checked", jSONObject);
                break;
            default:
                c1 c1Var2 = this.b;
                if (c1Var2.P) {
                    c1Var2.P = false;
                    g0 g0Var2 = c1Var2.c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                c1Var2.c();
                c1Var2.K = false;
                c1Var2.M = 0L;
                c1Var2.Q = false;
                y0 y0Var = c1Var2.a;
                if (y0Var != null) {
                    y0Var.onResume();
                    c1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
