package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ v0 d;

    public /* synthetic */ w(String[] strArr, int i9, v0 v0Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = i9;
        this.d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.c;
                v0 v0Var = this.d;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        y0.u(i9, v0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            default:
                String[] strArr2 = this.b;
                int i10 = this.c;
                v0 v0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    y0.u(i10, v0Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
