package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ s(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        f0 f0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                z0 z0Var = this.b;
                if (str != null) {
                    z0Var.v("emoji_status_failed", z0.x(str, "error"));
                    break;
                } else {
                    z0Var.v("emoji_status_set", null);
                    f0 f0Var2 = z0Var.c;
                    if (f0Var2 != null) {
                        f0Var2.d(document);
                        break;
                    }
                }
                break;
            case 1:
                String str2 = (String) obj2;
                JSONObject x4 = z0.x(str2, "status");
                z0 z0Var2 = this.b;
                z0Var2.v("emoji_status_access_requested", x4);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (f0Var = z0Var2.c) != null) {
                    f0Var.a();
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                z0 z0Var3 = this.b;
                if (z0Var3.c != null && bool.booleanValue()) {
                    z0Var3.c.w(bool2.booleanValue());
                }
                z0Var3.g0.k(new r(z0Var3, 2));
                break;
            case 3:
                z0 z0Var4 = this.b;
                z0Var4.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ph.p pVar = z0Var4.f0;
                    pVar.e = true;
                    pVar.k();
                }
                z0Var4.t();
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                String str3 = (String) obj2;
                z0 z0Var5 = this.b;
                z0Var5.getClass();
                if (bool3.booleanValue()) {
                    z0Var5.f0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? "authorized" : "failed");
                    jSONObject.put("token", str3);
                    z0Var5.v("biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
