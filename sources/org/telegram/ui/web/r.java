package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ r(y0 y0Var, int i9) {
        this.a = i9;
        this.b = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        e0 e0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                y0 y0Var = this.b;
                if (str != null) {
                    y0Var.v("emoji_status_failed", y0.x(str, "error"));
                    break;
                } else {
                    y0Var.v("emoji_status_set", null);
                    e0 e0Var2 = y0Var.c;
                    if (e0Var2 != null) {
                        e0Var2.d(document);
                        break;
                    }
                }
                break;
            case 1:
                String str2 = (String) obj2;
                JSONObject x10 = y0.x(str2, "status");
                y0 y0Var2 = this.b;
                y0Var2.v("emoji_status_access_requested", x10);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (e0Var = y0Var2.c) != null) {
                    e0Var.a();
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                y0 y0Var3 = this.b;
                if (y0Var3.c != null && bool.booleanValue()) {
                    y0Var3.c.w(bool2.booleanValue());
                }
                y0Var3.g0.k(new q(y0Var3, 2));
                break;
            case 3:
                y0 y0Var4 = this.b;
                y0Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    mh.r rVar = y0Var4.f0;
                    rVar.e = true;
                    rVar.k();
                }
                y0Var4.t();
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                String str3 = (String) obj2;
                y0 y0Var5 = this.b;
                y0Var5.getClass();
                if (bool3.booleanValue()) {
                    y0Var5.f0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str3);
                    y0Var5.v("biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
