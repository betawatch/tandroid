package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public abstract class a8 {
    public static la.h a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = s8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(s8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, s8.a(jSONObject2.optString("name")), s8.a(jSONObject2.optString("address_line1")), s8.a(jSONObject2.optString("address_line2")), s8.a(jSONObject2.optString("address_city")), s8.a(jSONObject2.optString("address_state")), s8.a(jSONObject2.optString("address_zip")), s8.a(jSONObject2.optString("address_country")), u8.a(s8.a(jSONObject2.optString("brand"))), s8.a(jSONObject2.optString("last4")), s8.a(jSONObject2.optString("fingerprint")), u8.b(s8.a(jSONObject2.optString("funding"))), s8.a(jSONObject2.optString("country")), s8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new la.h(a2, valueOf, aVar, str2);
    }
}
