package v0;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends b {
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String requestJson) {
        super(r0, r7, r1);
        kotlin.jvm.internal.j.e(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
            String string = jSONObject.getString("name");
            String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            kotlin.jvm.internal.j.b(string);
            oc.i iVar = new oc.i(string, string2);
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
