package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ k9 c;

    public /* synthetic */ s(d1 d1Var, k9 k9Var, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = k9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        i0 i0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj2;
                JSONObject B = d1.B(str, "status");
                d1 d1Var = this.b;
                d1Var.y(this.c, "emoji_status_access_requested", B);
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str) && (i0Var = d1Var.c) != null) {
                    i0Var.a();
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
                d1Var2.k0.k(new t(d1Var2, this.c, 1));
                break;
            case 2:
                d1 d1Var3 = this.b;
                d1Var3.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fi.s sVar = d1Var3.j0;
                    sVar.e = true;
                    sVar.k();
                }
                d1Var3.w(this.c);
                break;
            case 3:
                k9 k9Var = this.c;
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
                    d1Var4.y(k9Var, "biometry_auth_requested", jSONObject);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                String str3 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                d1 d1Var5 = this.b;
                k9 k9Var2 = this.c;
                if (str3 != null) {
                    d1Var5.y(k9Var2, "emoji_status_failed", d1.B(str3, "error"));
                    break;
                } else {
                    d1Var5.y(k9Var2, "emoji_status_set", null);
                    i0 i0Var2 = d1Var5.c;
                    if (i0Var2 != null) {
                        i0Var2.d(document);
                        break;
                    }
                }
                break;
        }
    }
}
