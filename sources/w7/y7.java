package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class y7 {
    public static m2.t a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = q8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(q8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, q8.a(jSONObject2.optString("name")), q8.a(jSONObject2.optString("address_line1")), q8.a(jSONObject2.optString("address_line2")), q8.a(jSONObject2.optString("address_city")), q8.a(jSONObject2.optString("address_state")), q8.a(jSONObject2.optString("address_zip")), q8.a(jSONObject2.optString("address_country")), s8.a(q8.a(jSONObject2.optString("brand"))), q8.a(jSONObject2.optString("last4")), q8.a(jSONObject2.optString("fingerprint")), s8.b(q8.a(jSONObject2.optString("funding"))), q8.a(jSONObject2.optString("country")), q8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new m2.t(a2, valueOf, aVar, str2);
    }
}
