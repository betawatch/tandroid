package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                h0 h0Var = this.b.c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                c1 c1Var = this.b;
                a1 a1Var = c1Var.I0;
                di.z0 z0Var = c1Var.k0;
                z0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", z0Var.d());
                    if (z0Var.d()) {
                        jSONObject.put("access_requested", z0Var.d);
                        if (z0Var.d) {
                            jSONObject.put("access_granted", z0Var.e && z0Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                c1Var.z(a1Var, "location_checked", jSONObject);
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
