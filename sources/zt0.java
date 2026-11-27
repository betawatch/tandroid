// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zt0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv0 b;
    public final /* synthetic */ pv0 c;

    public /* synthetic */ zt0(rv0 rv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = pv0Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pv0 pv0Var = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                rv0Var.u(pv0Var, "location_requested", (JSONObject) obj);
                break;
            case 1:
                rv0Var.u(pv0Var, "location_requested", (JSONObject) obj);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    rv0Var.u(pv0Var, "home_screen_failed", rv0.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    rv0Var.u(pv0Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
