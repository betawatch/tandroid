// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zu0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qw0 b;
    public final /* synthetic */ ow0 c;

    public /* synthetic */ zu0(qw0 qw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = ow0Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ow0 ow0Var = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                qw0Var.u(ow0Var, "location_requested", (JSONObject) obj);
                break;
            case 1:
                qw0Var.u(ow0Var, "location_requested", (JSONObject) obj);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    qw0Var.u(ow0Var, "home_screen_failed", qw0.x("UNSUPPORTED", "error"));
                    break;
                } else {
                    qw0Var.u(ow0Var, "home_screen_added", null);
                    break;
                }
        }
    }
}
