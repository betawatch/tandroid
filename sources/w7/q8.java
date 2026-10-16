package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class q8 {
    public static u2.c a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = m9.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(m9.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        wc.a aVar = new wc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, m9.a(jSONObject2.optString("name")), m9.a(jSONObject2.optString("address_line1")), m9.a(jSONObject2.optString("address_line2")), m9.a(jSONObject2.optString("address_city")), m9.a(jSONObject2.optString("address_state")), m9.a(jSONObject2.optString("address_zip")), m9.a(jSONObject2.optString("address_country")), o9.a(m9.a(jSONObject2.optString("brand"))), m9.a(jSONObject2.optString("last4")), m9.a(jSONObject2.optString("fingerprint")), o9.b(m9.a(jSONObject2.optString("funding"))), m9.a(jSONObject2.optString("country")), m9.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new u2.c(a2, valueOf, aVar, str2);
    }
}
