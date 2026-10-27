package org.telegram.ui.web;

import di.x7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x0 d;
    public final /* synthetic */ x7 e;

    public /* synthetic */ x(String[] strArr, int i10, x0 x0Var, x7 x7Var, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = x0Var;
        this.e = x7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                x0 x0Var = this.d;
                x7 x7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        a1.w(i10, x0Var, x7Var, "phone_requested", jSONObject);
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
                x0 x0Var2 = this.d;
                x7 x7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    a1.w(i11, x0Var2, x7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
