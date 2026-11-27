// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ym9 {
    public static final kj4 a;

    static {
        vw5 vw5Var = new vw5();
        o70 o70Var = o70.a;
        vw5Var.a(ym9.class, o70Var);
        vw5Var.a(ka0.class, o70Var);
        a = new kj4((Object) vw5Var, (byte) 10);
    }

    public static ka0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new ka0(string, string2, string3, string4, j);
    }
}
