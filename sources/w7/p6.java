package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class p6 {
    public static li.k a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = k7.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(k7.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        oc.a aVar = new oc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, k7.a(jSONObject2.optString("name")), k7.a(jSONObject2.optString("address_line1")), k7.a(jSONObject2.optString("address_line2")), k7.a(jSONObject2.optString("address_city")), k7.a(jSONObject2.optString("address_state")), k7.a(jSONObject2.optString("address_zip")), k7.a(jSONObject2.optString("address_country")), m7.a(k7.a(jSONObject2.optString("brand"))), k7.a(jSONObject2.optString("last4")), k7.a(jSONObject2.optString("fingerprint")), m7.b(k7.a(jSONObject2.optString("funding"))), k7.a(jSONObject2.optString("country")), k7.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new li.k(a2, valueOf, aVar, str2);
    }
}
