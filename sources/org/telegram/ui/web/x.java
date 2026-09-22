package org.telegram.ui.web;

import ai.da;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 d;
    public final /* synthetic */ da e;

    public /* synthetic */ x(String[] strArr, int i10, z0 z0Var, da daVar, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = z0Var;
        this.e = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                z0 z0Var = this.d;
                da daVar = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        d1.x(i10, z0Var, daVar, "phone_requested", jSONObject);
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
                z0 z0Var2 = this.d;
                da daVar2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    d1.x(i11, z0Var2, daVar2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
