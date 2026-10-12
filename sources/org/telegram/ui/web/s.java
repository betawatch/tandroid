package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                h0 h0Var = this.b.c;
                if (h0Var != null) {
                    h0Var.b();
                }
                LaunchActivity.K();
                break;
            case 1:
                b1 b1Var = this.b;
                n9 n9Var = b1Var.I0;
                fi.v0 v0Var = b1Var.k0;
                v0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", v0Var.d());
                    if (v0Var.d()) {
                        jSONObject.put("access_requested", v0Var.d);
                        if (v0Var.d) {
                            jSONObject.put("access_granted", v0Var.e && v0Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                b1Var.x(n9Var, "location_checked", jSONObject);
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
