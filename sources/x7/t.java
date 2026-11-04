package x7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t {
    public static p7.d a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a10 = i0.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(i0.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        rc.a aVar = new rc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, i0.a(jSONObject2.optString("name")), i0.a(jSONObject2.optString("address_line1")), i0.a(jSONObject2.optString("address_line2")), i0.a(jSONObject2.optString("address_city")), i0.a(jSONObject2.optString("address_state")), i0.a(jSONObject2.optString("address_zip")), i0.a(jSONObject2.optString("address_country")), d5.a(i0.a(jSONObject2.optString("brand"))), i0.a(jSONObject2.optString("last4")), i0.a(jSONObject2.optString("fingerprint")), d5.b(i0.a(jSONObject2.optString("funding"))), i0.a(jSONObject2.optString("country")), i0.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new p7.d(a10, valueOf, aVar, str2);
    }
}
