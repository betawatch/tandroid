package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ o7 c;

    public /* synthetic */ n(x0 x0Var, o7 o7Var, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = o7Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = x0.A(str, "status");
                x0 x0Var = this.b;
                x0Var.x(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (d0Var = x0Var.c) != null) {
                    d0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                x0 x0Var2 = this.b;
                if (x0Var2.c != null && bool.booleanValue()) {
                    x0Var2.c.w(bool2.booleanValue());
                }
                x0Var2.k0.j(new o(x0Var2, this.c, 1));
                break;
            case 2:
                x0 x0Var3 = this.b;
                x0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hi.p pVar = x0Var3.j0;
                    pVar.e = true;
                    pVar.k();
                }
                x0Var3.v(this.c);
                break;
            case 3:
                o7 o7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                x0 x0Var4 = this.b;
                if (booleanValue) {
                    x0Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    x0Var4.x(o7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                x0 x0Var5 = this.b;
                o7 o7Var2 = this.c;
                if (str3 != null) {
                    x0Var5.x(o7Var2, "emoji_status_failed", x0.A(str3, "error"));
                    break;
                } else {
                    x0Var5.x(o7Var2, "emoji_status_set", null);
                    d0 d0Var2 = x0Var5.c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
