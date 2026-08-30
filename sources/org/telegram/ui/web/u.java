package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                e0 e0Var = this.b.c;
                if (e0Var != null) {
                    e0Var.b();
                }
                LaunchActivity.L();
                break;
            case 1:
                a1 a1Var = this.b;
                rh.r0 r0Var = a1Var.h0;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a1Var.v("location_checked", jSONObject);
                break;
            case 2:
                a1 a1Var2 = this.b;
                if (a1Var2.P) {
                    a1Var2.P = false;
                    e0 e0Var2 = a1Var2.c;
                    if (e0Var2 != null) {
                        e0Var2.t(false);
                    }
                }
                a1Var2.c();
                a1Var2.K = false;
                a1Var2.M = 0L;
                a1Var2.Q = false;
                w0 w0Var = a1Var2.a;
                if (w0Var != null) {
                    w0Var.onResume();
                    a1Var2.a.reload();
                    break;
                }
                break;
            default:
                a1 a1Var3 = this.b;
                rh.q qVar = a1Var3.g0;
                qVar.f = true;
                qVar.k();
                a1Var3.t();
                break;
        }
    }
}
