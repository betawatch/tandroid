package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ t(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
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
                a1 a1Var = this.b;
                x7 x7Var = a1Var.J0;
                hi.b1 b1Var = a1Var.k0;
                b1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", b1Var.d());
                    if (b1Var.d()) {
                        jSONObject.put("access_requested", b1Var.d);
                        if (b1Var.d) {
                            jSONObject.put("access_granted", b1Var.e && b1Var.a());
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a1Var.x(x7Var, "location_checked", jSONObject);
                break;
            default:
                a1 a1Var2 = this.b;
                if (a1Var2.S) {
                    a1Var2.S = false;
                    g0 g0Var2 = a1Var2.c;
                    if (g0Var2 != null) {
                        g0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.N = false;
                a1Var2.P = 0L;
                a1Var2.T = false;
                x0 x0Var = a1Var2.a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.a.reload();
                    break;
                }
                break;
        }
    }
}
