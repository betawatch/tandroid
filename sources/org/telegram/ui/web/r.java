package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ da c;

    public /* synthetic */ r(d1 d1Var, da daVar, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = daVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        h0 h0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = d1.B(str, "status");
                d1 d1Var = this.b;
                d1Var.y(this.c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (h0Var = d1Var.c) != null) {
                    h0Var.a();
                    break;
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                d1 d1Var2 = this.b;
                if (d1Var2.c != null && bool.booleanValue()) {
                    d1Var2.c.w(bool2.booleanValue());
                }
                d1Var2.k0.k(new s(d1Var2, this.c, 1));
                break;
            case 2:
                d1 d1Var3 = this.b;
                d1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ei.r rVar = d1Var3.j0;
                    rVar.e = true;
                    rVar.k();
                }
                d1Var3.w(this.c);
                break;
            case 3:
                da daVar = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                d1 d1Var4 = this.b;
                d1Var4.getClass();
                if (bool3.booleanValue()) {
                    d1Var4.j0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    d1Var4.y(daVar, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                d1 d1Var5 = this.b;
                da daVar2 = this.c;
                if (str3 != null) {
                    d1Var5.y(daVar2, "emoji_status_failed", d1.B(str3, "error"));
                    break;
                } else {
                    d1Var5.y(daVar2, "emoji_status_set", null);
                    h0 h0Var2 = d1Var5.c;
                    if (h0Var2 != null) {
                        h0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
