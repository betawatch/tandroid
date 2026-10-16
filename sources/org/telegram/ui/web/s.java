package org.telegram.ui.web;

import bi.n9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                LaunchActivity.K();
                break;
            case 1:
                c1 c1Var = this.b;
                n9 n9Var = c1Var.I0;
                fi.v0 v0Var = c1Var.k0;
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
                c1Var.x(n9Var, "location_checked", jSONObject);
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
