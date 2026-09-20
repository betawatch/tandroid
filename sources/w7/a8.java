package w7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class a8 {
    public static lf.h a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = s8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(s8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, s8.a(jSONObject2.optString("name")), s8.a(jSONObject2.optString("address_line1")), s8.a(jSONObject2.optString("address_line2")), s8.a(jSONObject2.optString("address_city")), s8.a(jSONObject2.optString("address_state")), s8.a(jSONObject2.optString("address_zip")), s8.a(jSONObject2.optString("address_country")), u8.a(s8.a(jSONObject2.optString("brand"))), s8.a(jSONObject2.optString("last4")), s8.a(jSONObject2.optString("fingerprint")), u8.b(s8.a(jSONObject2.optString("funding"))), s8.a(jSONObject2.optString("country")), s8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new lf.h(a2, valueOf, aVar, str2);
    }
}
