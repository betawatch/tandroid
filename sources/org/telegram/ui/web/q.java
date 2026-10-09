package org.telegram.ui.web;

import ai.ea;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ ea c;

    public /* synthetic */ q(b1 b1Var, ea eaVar, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = eaVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject A = b1.A(str, "status");
                b1 b1Var = this.b;
                b1Var.x(this.c, "emoji_status_access_requested", A);
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
                b1Var2.k0.j(new r(b1Var2, this.c, 1));
                break;
            case 2:
                b1 b1Var3 = this.b;
                b1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = b1Var3.j0;
                    rVar.e = true;
                    rVar.k();
                }
                b1Var3.v(this.c);
                break;
            case 3:
                ea eaVar = this.c;
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
                    b1Var4.x(eaVar, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                b1 b1Var5 = this.b;
                ea eaVar2 = this.c;
                if (str3 != null) {
                    b1Var5.x(eaVar2, "emoji_status_failed", b1.A(str3, "error"));
                    break;
                } else {
                    b1Var5.x(eaVar2, "emoji_status_set", null);
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
