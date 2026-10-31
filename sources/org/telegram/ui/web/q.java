package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ q(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b.c;
                if (d0Var != null) {
                    d0Var.b();
                }
                LaunchActivity.J();
                break;
            case 1:
                z0 z0Var = this.b;
                if (z0Var.S) {
                    z0Var.S = false;
                    d0 d0Var2 = z0Var.c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                z0Var.c();
                z0Var.N = false;
                z0Var.P = 0L;
                z0Var.T = false;
                v0 v0Var = z0Var.a;
                if (v0Var != null) {
                    v0Var.onResume();
                    z0Var.a.reload();
                    break;
                }
                break;
            default:
                z0 z0Var2 = this.b;
                x0 x0Var = z0Var2.J0;
                xh.o0 o0Var = z0Var2.k0;
                o0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", o0Var.d());
                    if (o0Var.d()) {
                        jSONObject.put("access_requested", o0Var.d);
                        if (o0Var.d) {
                            jSONObject.put("access_granted", o0Var.e && o0Var.a());
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                z0Var2.y(x0Var, "location_checked", jSONObject);
                break;
        }
    }
}
