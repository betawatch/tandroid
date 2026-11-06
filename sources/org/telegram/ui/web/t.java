package org.telegram.ui.web;

import di.o7;
import org.json.JSONObject;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u0 d;
    public final /* synthetic */ o7 e;

    public /* synthetic */ t(String[] strArr, int i7, u0 u0Var, o7 o7Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = i7;
        this.d = u0Var;
        this.e = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                u0 u0Var = this.d;
                o7 o7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        x0.w(i7, u0Var, o7Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                String[] strArr2 = this.b;
                int i10 = this.c;
                u0 u0Var2 = this.d;
                o7 o7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    x0.w(i10, u0Var2, o7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
