// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hv0 b;
    public final /* synthetic */ ev0 c;

    public /* synthetic */ qt0(hv0 hv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = ev0Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        ev0 ev0Var = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                hv0Var.u(ev0Var, "location_requested", (JSONObject) obj);
                break;
            case 1:
                hv0Var.u(ev0Var, "location_requested", (JSONObject) obj);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    hv0Var.u(ev0Var, "home_screen_failed", hv0.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    hv0Var.u(ev0Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
