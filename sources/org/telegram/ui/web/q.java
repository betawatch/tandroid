package org.telegram.ui.web;

import fi.i7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ q(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c0 c0Var = this.b.c;
                if (c0Var != null) {
                    c0Var.b();
                }
                LaunchActivity.J();
                break;
            case 1:
                v0 v0Var = this.b;
                if (v0Var.T) {
                    v0Var.T = false;
                    c0 c0Var2 = v0Var.c;
                    if (c0Var2 != null) {
                        c0Var2.t(false);
                    }
                }
                v0Var.c();
                v0Var.O = false;
                v0Var.Q = 0L;
                v0Var.U = false;
                s0 s0Var = v0Var.a;
                if (s0Var != null) {
                    s0Var.onResume();
                    v0Var.a.reload();
                    break;
                }
                break;
            default:
                v0 v0Var2 = this.b;
                i7 i7Var = v0Var2.K0;
                ki.s0 s0Var2 = v0Var2.l0;
                s0Var2.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", s0Var2.d());
                    if (s0Var2.d()) {
                        jSONObject.put("access_requested", s0Var2.d);
                        if (s0Var2.d) {
                            jSONObject.put("access_granted", s0Var2.e && s0Var2.a());
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                v0Var2.x(i7Var, "location_checked", jSONObject);
                break;
        }
    }
}
