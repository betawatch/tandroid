package v0;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends b {
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String requestJson) {
        super(r0, r7, r1);
        kotlin.jvm.internal.i.e(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
            String string = jSONObject.getString("name");
            String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            kotlin.jvm.internal.i.b(string);
            m5.e eVar = new m5.e(string, string2);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            this.d = requestJson;
            if (requestJson.length() != 0) {
                try {
                    new JSONObject(requestJson);
                    return;
                } catch (Exception unused) {
                }
            }
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        } catch (Exception unused2) {
            throw new IllegalArgumentException("user.name must be defined in requestJson");
        }
    }
}
