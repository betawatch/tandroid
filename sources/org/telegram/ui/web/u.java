package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ v0 d;
    public final /* synthetic */ x0 e;

    public /* synthetic */ u(String[] strArr, int i10, v0 v0Var, x0 x0Var, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = v0Var;
        this.e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                v0 v0Var = this.d;
                x0 x0Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        z0.w(i10, v0Var, x0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                String[] strArr2 = this.b;
                int i11 = this.c;
                v0 v0Var2 = this.d;
                x0 x0Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    z0.w(i11, v0Var2, x0Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}
