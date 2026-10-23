package org.telegram.ui.web;

import ci.y7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ y7 c;

    public /* synthetic */ r(b1 b1Var, y7 y7Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = y7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = b1.A(str, "status");
                b1 b1Var = this.b;
                b1Var.x(this.c, "emoji_status_access_requested", A);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (h0Var = b1Var.c) != null) {
                    h0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                b1 b1Var2 = this.b;
                if (b1Var2.c != null && bool.booleanValue()) {
                    b1Var2.c.w(bool2.booleanValue());
                }
                b1Var2.k0.j(new s(b1Var2, this.c, 1));
                break;
            case 2:
                b1 b1Var3 = this.b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    gi.r rVar = b1Var3.j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.v(this.c);
                break;
            case 3:
                y7 y7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                b1 b1Var4 = this.b;
                b1Var4.getClass();
                if (bool3.booleanValue()) {
                    b1Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    b1Var4.x(y7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.b;
                y7 y7Var2 = this.c;
                if (str3 != null) {
                    b1Var5.x(y7Var2, "emoji_status_failed", b1.A(str3, "error"));
                    break;
                } else {
                    b1Var5.x(y7Var2, "emoji_status_set", null);
                    h0 h0Var2 = b1Var5.c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
