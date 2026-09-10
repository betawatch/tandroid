package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class y7 {
    public static m.e3 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = q8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(q8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, q8.a(jSONObject2.optString("name")), q8.a(jSONObject2.optString("address_line1")), q8.a(jSONObject2.optString("address_line2")), q8.a(jSONObject2.optString("address_city")), q8.a(jSONObject2.optString("address_state")), q8.a(jSONObject2.optString("address_zip")), q8.a(jSONObject2.optString("address_country")), s8.a(q8.a(jSONObject2.optString("brand"))), q8.a(jSONObject2.optString("last4")), q8.a(jSONObject2.optString("fingerprint")), s8.b(q8.a(jSONObject2.optString("funding"))), q8.a(jSONObject2.optString("country")), q8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new m.e3(a2, valueOf, aVar, str2);
    }
}
