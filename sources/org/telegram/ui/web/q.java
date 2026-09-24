package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ q(b1 b1Var, da daVar, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = daVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = b1.B(str, "status");
                b1 b1Var = this.b;
                b1Var.y(this.c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (g0Var = b1Var.c) != null) {
                    g0Var.a();
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
                b1Var2.k0.k(new r(b1Var2, this.c, 1));
                break;
            case 2:
                b1 b1Var3 = this.b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = b1Var3.j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.w(this.c);
                break;
            case 3:
                da daVar = this.c;
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
                    b1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.b;
                da daVar2 = this.c;
                if (str3 != null) {
                    b1Var5.y(daVar2, "emoji_status_failed", b1.B(str3, "error"));
                    break;
                } else {
                    b1Var5.y(daVar2, "emoji_status_set", null);
                    g0 g0Var2 = b1Var5.c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
