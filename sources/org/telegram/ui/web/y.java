package org.telegram.ui.web;

import bi.k9;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 d;
    public final /* synthetic */ k9 e;

    public /* synthetic */ y(String[] strArr, int i10, z0 z0Var, k9 k9Var, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = z0Var;
        this.e = k9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                z0 z0Var = this.d;
                k9 k9Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        d1.x(i10, z0Var, k9Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            default:
                String[] strArr2 = this.b;
                int i11 = this.c;
                z0 z0Var2 = this.d;
                k9 k9Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    d1.x(i11, z0Var2, k9Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
