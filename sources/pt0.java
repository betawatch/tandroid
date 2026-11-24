// default package

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt0 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hv0 b;
    public final /* synthetic */ ev0 c;

    public /* synthetic */ pt0(hv0 hv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = ev0Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        ku0 ku0Var;
        byte b = this.a;
        ev0 ev0Var = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                hv0Var.u(ev0Var, "emoji_status_access_requested", hv0.x(str, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (ku0Var = hv0Var.c) != null) {
                    ku0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (hv0Var.c != null && bool.booleanValue()) {
                    hv0Var.c.w(bool2.booleanValue());
                }
                hv0Var.l0.i(new qt0(hv0Var, ev0Var, (byte) 1));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    uo0 uo0Var = hv0Var.k0;
                    uo0Var.e = true;
                    uo0Var.i();
                }
                hv0Var.s(ev0Var);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                if (bool3.booleanValue()) {
                    hv0Var.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    hv0Var.u(ev0Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str3 != null) {
                    hv0Var.u(ev0Var, "emoji_status_failed", hv0.x(str3, "error"));
                    break;
                } else {
                    hv0Var.u(ev0Var, "emoji_status_set", null);
                    ku0 ku0Var2 = hv0Var.c;
                    if (ku0Var2 != null) {
                        ku0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
