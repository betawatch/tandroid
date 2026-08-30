package org.telegram.ui.web;

import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                        a1.u(i10, w0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
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
                    a1.u(i11, w0Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
