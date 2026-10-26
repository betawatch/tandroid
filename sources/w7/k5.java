package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class k5 {
    public static s4.d a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = a8.r0.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(a8.r0.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        xc.a aVar = new xc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, a8.r0.a(jSONObject2.optString("name")), a8.r0.a(jSONObject2.optString("address_line1")), a8.r0.a(jSONObject2.optString("address_line2")), a8.r0.a(jSONObject2.optString("address_city")), a8.r0.a(jSONObject2.optString("address_state")), a8.r0.a(jSONObject2.optString("address_zip")), a8.r0.a(jSONObject2.optString("address_country")), a8.t0.a(a8.r0.a(jSONObject2.optString("brand"))), a8.r0.a(jSONObject2.optString("last4")), a8.r0.a(jSONObject2.optString("fingerprint")), a8.t0.b(a8.r0.a(jSONObject2.optString("funding"))), a8.r0.a(jSONObject2.optString("country")), a8.r0.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new s4.d(a2, valueOf, aVar, str2);
    }
}
