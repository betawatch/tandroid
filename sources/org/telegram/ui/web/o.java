package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ f7 c;

    public /* synthetic */ o(v0 v0Var, f7 f7Var, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = f7Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        c0 c0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = v0.A(str, "status");
                v0 v0Var = this.b;
                v0Var.x(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (c0Var = v0Var.c) != null) {
                    c0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                v0 v0Var2 = this.b;
                if (v0Var2.c != null && bool.booleanValue()) {
                    v0Var2.c.w(bool2.booleanValue());
                }
                v0Var2.l0.j(new p(v0Var2, this.c, 1));
                break;
            case 2:
                v0 v0Var3 = this.b;
                v0Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ki.p pVar = v0Var3.k0;
                    pVar.e = true;
                    pVar.k();
                }
                v0Var3.v(this.c);
                break;
            case 3:
                f7 f7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                boolean booleanValue = bool3.booleanValue();
                v0 v0Var4 = this.b;
                if (booleanValue) {
                    v0Var4.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    v0Var4.x(f7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                v0 v0Var5 = this.b;
                f7 f7Var2 = this.c;
                if (str3 != null) {
                    v0Var5.x(f7Var2, "emoji_status_failed", v0.A(str3, "error"));
                    break;
                } else {
                    v0Var5.x(f7Var2, "emoji_status_set", null);
                    c0 c0Var2 = v0Var5.c;
                    if (c0Var2 != null) {
                        c0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
