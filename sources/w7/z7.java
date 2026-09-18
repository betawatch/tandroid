package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class z7 {
    public static lf.i a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = r8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(r8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, r8.a(jSONObject2.optString("name")), r8.a(jSONObject2.optString("address_line1")), r8.a(jSONObject2.optString("address_line2")), r8.a(jSONObject2.optString("address_city")), r8.a(jSONObject2.optString("address_state")), r8.a(jSONObject2.optString("address_zip")), r8.a(jSONObject2.optString("address_country")), t8.a(r8.a(jSONObject2.optString("brand"))), r8.a(jSONObject2.optString("last4")), r8.a(jSONObject2.optString("fingerprint")), t8.b(r8.a(jSONObject2.optString("funding"))), r8.a(jSONObject2.optString("country")), r8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new lf.i(a2, valueOf, aVar, str2);
    }
}
