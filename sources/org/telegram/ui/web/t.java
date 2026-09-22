package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ t(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
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
                d1 d1Var = this.b;
                da daVar = d1Var.I0;
                ei.w0 w0Var = d1Var.k0;
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
                d1Var.y(daVar, "location_checked", jSONObject);
                break;
            default:
                d1 d1Var2 = this.b;
                if (d1Var2.S) {
                    d1Var2.S = false;
                    h0 h0Var2 = d1Var2.c;
                    if (h0Var2 != null) {
                        h0Var2.t(false);
                    }
                }
                d1Var2.c();
                d1Var2.N = false;
                d1Var2.P = 0L;
                d1Var2.T = false;
                z0 z0Var = d1Var2.a;
                if (z0Var != null) {
                    z0Var.onResume();
                    d1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
