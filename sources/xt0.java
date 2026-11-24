// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cv0 d;
    public final /* synthetic */ ev0 e;

    public /* synthetic */ xt0(String[] strArr, int i, cv0 cv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = cv0Var;
        this.e = ev0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ev0 ev0Var = this.e;
        cv0 cv0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        hv0.t(i, cv0Var, ev0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    hv0.t(i, cv0Var, ev0Var, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
