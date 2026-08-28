package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ t(y0 y0Var, int i9) {
        this.a = i9;
        this.b = y0Var;
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
                y0 y0Var = this.b;
                mh.u0 u0Var = y0Var.g0;
                u0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", u0Var.d());
                    if (u0Var.d()) {
                        jSONObject.put("access_requested", u0Var.d);
                        if (u0Var.d) {
                            jSONObject.put("access_granted", u0Var.e && u0Var.a());
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                y0Var.v("location_checked", jSONObject);
                break;
            case 2:
                y0 y0Var2 = this.b;
                if (y0Var2.O) {
                    y0Var2.O = false;
                    e0 e0Var2 = y0Var2.c;
                    if (e0Var2 != null) {
                        e0Var2.t(false);
                    }
                }
                y0Var2.c();
                y0Var2.J = false;
                y0Var2.L = 0L;
                y0Var2.P = false;
                v0 v0Var = y0Var2.a;
                if (v0Var != null) {
                    v0Var.onResume();
                    y0Var2.a.reload();
                    break;
                }
                break;
            default:
                y0 y0Var3 = this.b;
                mh.r rVar = y0Var3.f0;
                rVar.f = true;
                rVar.k();
                y0Var3.t();
                break;
        }
    }
}
