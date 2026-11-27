// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
