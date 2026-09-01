package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ s(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        f0 f0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                a1 a1Var = this.b;
                if (str != null) {
                    a1Var.v("emoji_status_failed", a1.x(str, "error"));
                    break;
                } else {
                    a1Var.v("emoji_status_set", null);
                    f0 f0Var2 = a1Var.c;
                    if (f0Var2 != null) {
                        f0Var2.d(document);
                        break;
                    }
                }
                break;
            case 1:
                String str2 = (String) obj2;
                JSONObject x10 = a1.x(str2, "status");
                a1 a1Var2 = this.b;
                a1Var2.v("emoji_status_access_requested", x10);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (f0Var = a1Var2.c) != null) {
                    f0Var.a();
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                a1 a1Var3 = this.b;
                if (a1Var3.c != null && bool.booleanValue()) {
                    a1Var3.c.w(bool2.booleanValue());
                }
                a1Var3.h0.k(new r(a1Var3, 2));
                break;
            case 3:
                a1 a1Var4 = this.b;
                a1Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    sh.p pVar = a1Var4.g0;
                    pVar.e = true;
                    pVar.k();
                }
                a1Var4.t();
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                String str3 = (String) obj2;
                a1 a1Var5 = this.b;
                a1Var5.getClass();
                if (bool3.booleanValue()) {
                    a1Var5.g0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str3);
                    a1Var5.v("biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
