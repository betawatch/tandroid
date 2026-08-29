package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ u(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b.c;
                if (f0Var != null) {
                    f0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                z0 z0Var = this.b;
                ph.q0 q0Var = z0Var.g0;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                z0Var.v("location_checked", jSONObject);
                break;
            case 2:
                z0 z0Var2 = this.b;
                if (z0Var2.O) {
                    z0Var2.O = false;
                    f0 f0Var2 = z0Var2.c;
                    if (f0Var2 != null) {
                        f0Var2.t(false);
                    }
                }
                z0Var2.c();
                z0Var2.J = false;
                z0Var2.L = 0L;
                z0Var2.P = false;
                w0 w0Var = z0Var2.a;
                if (w0Var != null) {
                    w0Var.onResume();
                    z0Var2.a.reload();
                    break;
                }
                break;
            default:
                z0 z0Var3 = this.b;
                ph.p pVar = z0Var3.f0;
                pVar.f = true;
                pVar.k();
                z0Var3.t();
                break;
        }
    }
}
