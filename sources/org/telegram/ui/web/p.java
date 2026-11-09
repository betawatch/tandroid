package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ p(x0 x0Var, int i7) {
        this.a = i7;
        this.b = x0Var;
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
                x0 x0Var = this.b;
                if (x0Var.S) {
                    x0Var.S = false;
                    d0 d0Var2 = x0Var.c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                x0Var.c();
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                u0 u0Var = x0Var.a;
                if (u0Var != null) {
                    u0Var.onResume();
                    x0Var.a.reload();
                    break;
                }
                break;
            default:
                x0 x0Var2 = this.b;
                p7 p7Var = x0Var2.J0;
                hi.r0 r0Var = x0Var2.k0;
                r0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", r0Var.d());
                    if (r0Var.d()) {
                        jSONObject.put("access_requested", r0Var.d);
                        if (r0Var.d) {
                            jSONObject.put("access_granted", r0Var.e && r0Var.a());
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                x0Var2.x(p7Var, "location_checked", jSONObject);
                break;
        }
    }
}
