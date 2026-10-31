package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ o(z0 z0Var, x0 x0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
        this.c = x0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = z0.A(str, "status");
                z0 z0Var = this.b;
                z0Var.y(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (d0Var = z0Var.c) != null) {
                    d0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var2 = this.b;
                if (z0Var2.c != null && bool.booleanValue()) {
                    z0Var2.c.w(bool2.booleanValue());
                }
                z0Var2.k0.j(new p(z0Var2, this.c, 1));
                break;
            case 2:
                z0 z0Var3 = this.b;
                z0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    xh.n nVar = z0Var3.j0;
                    nVar.e = true;
                    nVar.k();
                }
                z0Var3.v(this.c);
                break;
            case 3:
                x0 x0Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                z0 z0Var4 = this.b;
                if (booleanValue) {
                    z0Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    z0Var4.y(x0Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                z0 z0Var5 = this.b;
                x0 x0Var2 = this.c;
                if (str3 != null) {
                    z0Var5.y(x0Var2, "emoji_status_failed", z0.A(str3, "error"));
                    break;
                } else {
                    z0Var5.y(x0Var2, "emoji_status_set", null);
                    d0 d0Var2 = z0Var5.c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
