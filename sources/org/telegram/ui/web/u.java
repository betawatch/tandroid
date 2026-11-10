package org.telegram.ui.web;

import di.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u0 d;
    public final /* synthetic */ p7 e;

    public /* synthetic */ u(String[] strArr, int i7, u0 u0Var, p7 p7Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = i7;
        this.d = u0Var;
        this.e = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                u0 u0Var = this.d;
                p7 p7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        x0.w(i7, u0Var, p7Var, "phone_requested", jSONObject);
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
                p7 p7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    x0.w(i10, u0Var2, p7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
