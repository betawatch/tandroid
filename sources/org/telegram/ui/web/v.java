package org.telegram.ui.web;

import ei.p7;
import org.json.JSONObject;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ t0 d;
    public final /* synthetic */ p7 e;

    public /* synthetic */ v(String[] strArr, int i3, t0 t0Var, p7 p7Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = i3;
        this.d = t0Var;
        this.e = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i3 = this.c;
                t0 t0Var = this.d;
                p7 p7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        w0.w(i3, t0Var, p7Var, "phone_requested", jSONObject);
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
                t0 t0Var2 = this.d;
                p7 p7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    w0.w(i10, t0Var2, p7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
