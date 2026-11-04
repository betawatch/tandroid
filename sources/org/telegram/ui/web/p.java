package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ p7 c;

    public /* synthetic */ p(w0 w0Var, p7 p7Var, int i3) {
        this.a = i3;
        this.b = w0Var;
        this.c = p7Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        d0 d0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = w0.A(str, "status");
                w0 w0Var = this.b;
                w0Var.x(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (d0Var = w0Var.c) != null) {
                    d0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                w0 w0Var2 = this.b;
                if (w0Var2.c != null && bool.booleanValue()) {
                    w0Var2.c.w(bool2.booleanValue());
                }
                w0Var2.l0.j(new q(w0Var2, this.c, 1));
                break;
            case 2:
                w0 w0Var3 = this.b;
                w0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ii.r rVar = w0Var3.k0;
                    rVar.e = true;
                    rVar.k();
                }
                w0Var3.v(this.c);
                break;
            case 3:
                p7 p7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                w0 w0Var4 = this.b;
                if (booleanValue) {
                    w0Var4.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    w0Var4.x(p7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                w0 w0Var5 = this.b;
                p7 p7Var2 = this.c;
                if (str3 != null) {
                    w0Var5.x(p7Var2, "emoji_status_failed", w0.A(str3, "error"));
                    break;
                } else {
                    w0Var5.x(p7Var2, "emoji_status_set", null);
                    d0 d0Var2 = w0Var5.c;
                    if (d0Var2 != null) {
                        d0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
