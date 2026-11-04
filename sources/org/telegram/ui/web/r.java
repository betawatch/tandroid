package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ r(w0 w0Var, int i3) {
        this.a = i3;
        this.b = w0Var;
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
                w0 w0Var = this.b;
                if (w0Var.T) {
                    w0Var.T = false;
                    d0 d0Var2 = w0Var.c;
                    if (d0Var2 != null) {
                        d0Var2.t(false);
                    }
                }
                w0Var.c();
                w0Var.O = false;
                w0Var.Q = 0L;
                w0Var.U = false;
                t0 t0Var = w0Var.a;
                if (t0Var != null) {
                    t0Var.onResume();
                    w0Var.a.reload();
                    break;
                }
                break;
            default:
                w0 w0Var2 = this.b;
                p7 p7Var = w0Var2.K0;
                ii.s0 s0Var = w0Var2.l0;
                s0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", s0Var.d());
                    if (s0Var.d()) {
                        jSONObject.put("access_requested", s0Var.d);
                        if (s0Var.d) {
                            jSONObject.put("access_granted", s0Var.e && s0Var.a());
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                w0Var2.x(p7Var, "location_checked", jSONObject);
                break;
        }
    }
}
