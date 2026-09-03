package org.telegram.ui.web;

import nh.j7;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y0 d;
    public final /* synthetic */ j7 e;

    public /* synthetic */ x(String[] strArr, int i10, y0 y0Var, j7 j7Var, int i11) {
        this.a = i11;
        this.b = strArr;
        this.c = i10;
        this.d = y0Var;
        this.e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                y0 y0Var = this.d;
                j7 j7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        c1.x(i10, y0Var, j7Var, "phone_requested", jSONObject);
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
                y0 y0Var2 = this.d;
                j7 j7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    c1.x(i11, y0Var2, j7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
