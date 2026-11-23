package org.telegram.ui.web;

import fi.f7;
import org.json.JSONObject;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ s0 d;
    public final /* synthetic */ f7 e;

    public /* synthetic */ u(String[] strArr, int i7, s0 s0Var, f7 f7Var, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = i7;
        this.d = s0Var;
        this.e = f7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                s0 s0Var = this.d;
                f7 f7Var = this.e;
                String[] strArr = this.b;
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        v0.w(i7, s0Var, f7Var, "phone_requested", jSONObject);
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
                s0 s0Var2 = this.d;
                f7 f7Var2 = this.e;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr2[0]);
                    v0.w(i10, s0Var2, f7Var2, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
