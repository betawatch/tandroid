package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w0 d;

    public /* synthetic */ x(String[] strArr, int i10, w0 w0Var, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                w0 w0Var = this.d;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        z0.u(i10, w0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            default:
                String[] strArr2 = this.b;
                int i11 = this.c;
                w0 w0Var2 = this.d;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    z0.u(i11, w0Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
