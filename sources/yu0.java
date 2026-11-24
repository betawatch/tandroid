// default package

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yu0 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qw0 b;
    public final /* synthetic */ ow0 c;

    public /* synthetic */ yu0(qw0 qw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = ow0Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        uv0 uv0Var;
        byte b = this.a;
        ow0 ow0Var = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                qw0Var.u(ow0Var, "emoji_status_access_requested", qw0.x(str, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (uv0Var = qw0Var.c) != null) {
                    uv0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (qw0Var.c != null && bool.booleanValue()) {
                    qw0Var.c.w(bool2.booleanValue());
                }
                qw0Var.l0.i(new zu0(qw0Var, ow0Var, (byte) 1));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    up0 up0Var = qw0Var.k0;
                    up0Var.e = true;
                    up0Var.i();
                }
                qw0Var.s(ow0Var);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                if (bool3.booleanValue()) {
                    qw0Var.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    qw0Var.u(ow0Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str3 != null) {
                    qw0Var.u(ow0Var, "emoji_status_failed", qw0.x(str3, "error"));
                    break;
                } else {
                    qw0Var.u(ow0Var, "emoji_status_set", null);
                    uv0 uv0Var2 = qw0Var.c;
                    if (uv0Var2 != null) {
                        uv0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
