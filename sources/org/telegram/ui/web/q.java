package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ q(c1 c1Var, da daVar, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = daVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = c1.B(str, "status");
                c1 c1Var = this.b;
                c1Var.y(this.c, "emoji_status_access_requested", B);
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
                c1Var2.k0.k(new r(c1Var2, this.c, 1));
                break;
            case 2:
                c1 c1Var3 = this.b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.s sVar = c1Var3.j0;
                    sVar.e = true;
                    sVar.k();
                }
                c1Var3.w(this.c);
                break;
            case 3:
                da daVar = this.c;
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
                    c1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.b;
                da daVar2 = this.c;
                if (str3 != null) {
                    c1Var5.y(daVar2, "emoji_status_failed", c1.B(str3, "error"));
                    break;
                } else {
                    c1Var5.y(daVar2, "emoji_status_set", null);
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
