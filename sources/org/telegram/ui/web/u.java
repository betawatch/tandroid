package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ u(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b.c;
                if (i0Var != null) {
                    i0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                d1 d1Var = this.b;
                k9 k9Var = d1Var.I0;
                fi.w0 w0Var = d1Var.k0;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                d1Var.y(k9Var, "location_checked", jSONObject);
                break;
            default:
                d1 d1Var2 = this.b;
                if (d1Var2.S) {
                    d1Var2.S = false;
                    i0 i0Var2 = d1Var2.c;
                    if (i0Var2 != null) {
                        i0Var2.t(false);
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
