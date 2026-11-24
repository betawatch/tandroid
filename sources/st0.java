// default package

import org.json.JSONObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class st0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hv0 b;

    public /* synthetic */ st0(hv0 hv0Var, byte b) {
        this.a = b;
        this.b = hv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = false;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                ku0 ku0Var = hv0Var.c;
                if (ku0Var != null) {
                    ku0Var.b();
                }
                LaunchActivity.K();
                break;
            case 1:
                if (hv0Var.T) {
                    hv0Var.T = false;
                    ku0 ku0Var2 = hv0Var.c;
                    if (ku0Var2 != null) {
                        ku0Var2.t(false);
                    }
                }
                hv0Var.a();
                hv0Var.O = false;
                hv0Var.Q = 0L;
                hv0Var.U = false;
                cv0 cv0Var = hv0Var.a;
                if (cv0Var != null) {
                    cv0Var.onResume();
                    hv0Var.a.reload();
                    break;
                }
                break;
            default:
                ev0 ev0Var = hv0Var.K0;
                tq0 tq0Var = hv0Var.l0;
                tq0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("available", tq0Var.c());
                    if (tq0Var.c()) {
                        jSONObject.put("access_requested", tq0Var.d);
                        if (tq0Var.d) {
                            if (tq0Var.e && tq0Var.a()) {
                                z = true;
                            }
                            jSONObject.put("access_granted", z);
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                hv0Var.u(ev0Var, "location_checked", jSONObject);
                break;
        }
    }
}
