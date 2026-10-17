package org.telegram.ui.web;

import ci.z7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ z7 c;

    public /* synthetic */ q(a1 a1Var, z7 z7Var, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = z7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = a1.A(str, "status");
                a1 a1Var = this.b;
                a1Var.x(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (g0Var = a1Var.c) != null) {
                    g0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var2 = this.b;
                if (a1Var2.c != null && bool.booleanValue()) {
                    a1Var2.c.w(bool2.booleanValue());
                }
                a1Var2.k0.j(new r(a1Var2, this.c, 1));
                break;
            case 2:
                a1 a1Var3 = this.b;
                a1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi.r rVar = a1Var3.j0;
                    rVar.e = true;
                    rVar.k();
                }
                a1Var3.v(this.c);
                break;
            case 3:
                z7 z7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                a1 a1Var4 = this.b;
                a1Var4.getClass();
                if (bool3.booleanValue()) {
                    a1Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    a1Var4.x(z7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var5 = this.b;
                z7 z7Var2 = this.c;
                if (str3 != null) {
                    a1Var5.x(z7Var2, "emoji_status_failed", a1.A(str3, "error"));
                    break;
                } else {
                    a1Var5.x(z7Var2, "emoji_status_set", null);
                    g0 g0Var2 = a1Var5.c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
