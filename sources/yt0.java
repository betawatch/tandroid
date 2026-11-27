// default package

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt0 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv0 b;
    public final /* synthetic */ pv0 c;

    public /* synthetic */ yt0(rv0 rv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = pv0Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        uu0 uu0Var;
        byte b = this.a;
        pv0 pv0Var = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                rv0Var.u(pv0Var, "emoji_status_access_requested", rv0.x(str, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (uu0Var = rv0Var.c) != null) {
                    uu0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (rv0Var.c != null && bool.booleanValue()) {
                    rv0Var.c.w(bool2.booleanValue());
                }
                rv0Var.l0.i(new zt0(rv0Var, pv0Var, (byte) 1));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    uo0 uo0Var = rv0Var.k0;
                    uo0Var.e = true;
                    uo0Var.i();
                }
                rv0Var.s(pv0Var);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                if (bool3.booleanValue()) {
                    rv0Var.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    rv0Var.u(pv0Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str3 != null) {
                    rv0Var.u(pv0Var, "emoji_status_failed", rv0.x(str3, "error"));
                    break;
                } else {
                    rv0Var.u(pv0Var, "emoji_status_set", null);
                    uu0 uu0Var2 = rv0Var.c;
                    if (uu0Var2 != null) {
                        uu0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
