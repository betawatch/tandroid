package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ u(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
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
                a1 a1Var = this.b;
                sh.q0 q0Var = a1Var.h0;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                a1Var.v("location_checked", jSONObject);
                break;
            case 2:
                a1 a1Var2 = this.b;
                if (a1Var2.P) {
                    a1Var2.P = false;
                    f0 f0Var2 = a1Var2.c;
                    if (f0Var2 != null) {
                        f0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.K = false;
                a1Var2.M = 0L;
                a1Var2.Q = false;
                x0 x0Var = a1Var2.a;
                if (x0Var != null) {
                    x0Var.onResume();
                    a1Var2.a.reload();
                    break;
                }
                break;
            default:
                a1 a1Var3 = this.b;
                sh.p pVar = a1Var3.g0;
                pVar.f = true;
                pVar.k();
                a1Var3.t();
                break;
        }
    }
}
