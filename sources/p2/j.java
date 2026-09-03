package p2;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;
    public final h7.u g;

    public j(JSONObject jSONObject) {
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        h7.u uVar = null;
        this.d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        this.e = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                this.e.add(optJSONArray.getString(i10));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            if (optJSONObject.has("percentageDiscount")) {
                optJSONObject.optInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("discountAmount");
            if (optJSONObject2 != null) {
                optJSONObject2.optString("formattedDiscountAmount");
                optJSONObject2.optLong("discountAmountMicros");
                optJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("startTimeMillis")) {
                optJSONObject3.optLong("startTimeMillis");
            }
            if (optJSONObject3.has("endTimeMillis")) {
                optJSONObject3.optLong("endTimeMillis");
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject4 != null) {
            optJSONObject4.getInt("maximumQuantity");
            optJSONObject4.getInt("remainingQuantity");
        }
        this.f = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getLong("preorderReleaseTimeMillis");
            optJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject6 != null) {
            optJSONObject6.getString("rentalPeriod");
            optJSONObject6.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject7 != null) {
            uVar = new h7.u(18);
            optJSONObject7.getString(TeXSymbolParser.TYPE_ATTR);
        }
        this.g = uVar;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (optJSONArray2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
            JSONObject optJSONObject8 = optJSONArray2.optJSONObject(i11);
            if (optJSONObject8 != null) {
                arrayList.add(new k(optJSONObject8));
            }
        }
    }
}
