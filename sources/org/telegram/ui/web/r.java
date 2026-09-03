package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ j7 c;

    public /* synthetic */ r(c1 c1Var, j7 j7Var, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        g0 g0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = c1.B(str, "status");
                c1 c1Var = this.b;
                c1Var.z(this.c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (g0Var = c1Var.c) != null) {
                    g0Var.a();
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
                c1Var2.h0.k(new s(c1Var2, this.c, 1));
                break;
            case 2:
                c1 c1Var3 = this.b;
                c1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    rh.p pVar = c1Var3.g0;
                    pVar.e = true;
                    pVar.k();
                }
                c1Var3.w(this.c);
                break;
            case 3:
                j7 j7Var = this.c;
                Boolean bool3 = (Boolean) obj;
                String str2 = (String) obj2;
                c1 c1Var4 = this.b;
                c1Var4.getClass();
                if (bool3.booleanValue()) {
                    c1Var4.g0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str2);
                    c1Var4.z(j7Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                c1 c1Var5 = this.b;
                j7 j7Var2 = this.c;
                if (str3 != null) {
                    c1Var5.z(j7Var2, "emoji_status_failed", c1.B(str3, "error"));
                    break;
                } else {
                    c1Var5.z(j7Var2, "emoji_status_set", null);
                    g0 g0Var2 = c1Var5.c;
                    if (g0Var2 != null) {
                        g0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
