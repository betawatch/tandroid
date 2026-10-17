package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class r8 {
    public static u2.c a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = n9.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(n9.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        wc.a aVar = new wc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, n9.a(jSONObject2.optString("name")), n9.a(jSONObject2.optString("address_line1")), n9.a(jSONObject2.optString("address_line2")), n9.a(jSONObject2.optString("address_city")), n9.a(jSONObject2.optString("address_state")), n9.a(jSONObject2.optString("address_zip")), n9.a(jSONObject2.optString("address_country")), p9.a(n9.a(jSONObject2.optString("brand"))), n9.a(jSONObject2.optString("last4")), n9.a(jSONObject2.optString("fingerprint")), p9.b(n9.a(jSONObject2.optString("funding"))), n9.a(jSONObject2.optString("country")), n9.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new u2.c(a2, valueOf, aVar, str2);
    }
}
