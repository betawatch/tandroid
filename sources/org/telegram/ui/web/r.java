package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ x7 c;

    public /* synthetic */ r(a1 a1Var, x7 x7Var, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = x7Var;
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
                a1Var2.k0.j(new s(a1Var2, this.c, 1));
                break;
            case 2:
                a1 a1Var3 = this.b;
                a1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    hi.y yVar = a1Var3.j0;
                    yVar.e = true;
                    yVar.k();
                }
                a1Var3.v(this.c);
                break;
            case 3:
                x7 x7Var = this.c;
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
                    a1Var4.x(x7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var5 = this.b;
                x7 x7Var2 = this.c;
                if (str3 != null) {
                    a1Var5.x(x7Var2, "emoji_status_failed", a1.A(str3, "error"));
                    break;
                } else {
                    a1Var5.x(x7Var2, "emoji_status_set", null);
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
