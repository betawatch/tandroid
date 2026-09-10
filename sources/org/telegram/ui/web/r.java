package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ a1 c;

    public /* synthetic */ r(c1 c1Var, a1 a1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = c1.B(str, "status");
                c1 c1Var = this.b;
                c1Var.z(this.c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (h0Var = c1Var.c) != null) {
                    h0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                c1 c1Var2 = this.b;
                if (c1Var2.c != null && bool.booleanValue()) {
                    c1Var2.c.w(bool2.booleanValue());
                }
                c1Var2.k0.k(new s(c1Var2, this.c, 1));
                break;
            case 2:
                c1 c1Var3 = this.b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    di.u uVar = c1Var3.j0;
                    uVar.e = true;
                    uVar.k();
                }
                c1Var3.w(this.c);
                break;
            case 3:
                a1 a1Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                c1 c1Var4 = this.b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    c1Var4.z(a1Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.b;
                a1 a1Var2 = this.c;
                if (str3 != null) {
                    c1Var5.z(a1Var2, "emoji_status_failed", c1.B(str3, "error"));
                    break;
                } else {
                    c1Var5.z(a1Var2, "emoji_status_set", null);
                    h0 h0Var2 = c1Var5.c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
