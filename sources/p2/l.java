package p2;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final kc.d b;

    public l(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.a = jSONObject.getString("offerIdToken");
        this.b = new kc.d(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
    }
}
