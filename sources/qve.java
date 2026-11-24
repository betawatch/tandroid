// default package

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qve {
    public static vk9 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a = oue.a(jSONObject.getString("id"));
        long j = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(oue.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        rc1 rc1Var = new rc1(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, oue.a(jSONObject2.optString("name")), oue.a(jSONObject2.optString("address_line1")), oue.a(jSONObject2.optString("address_line2")), oue.a(jSONObject2.optString("address_city")), oue.a(jSONObject2.optString("address_state")), oue.a(jSONObject2.optString("address_zip")), oue.a(jSONObject2.optString("address_country")), sue.a(oue.a(jSONObject2.optString("brand"))), oue.a(jSONObject2.optString("last4")), oue.a(jSONObject2.optString("fingerprint")), sue.b(oue.a(jSONObject2.optString("funding"))), oue.a(jSONObject2.optString("country")), oue.a(jSONObject2.optString("currency")));
        new Date(j * 1000);
        return new vk9(a, valueOf, rc1Var, str2);
    }
}
