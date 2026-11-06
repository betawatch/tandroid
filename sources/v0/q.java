package v0;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q extends h {
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String requestJson) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r3, r4, true, hd.p.a);
        kotlin.jvm.internal.j.e(requestJson, "requestJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this.e = requestJson;
        if (requestJson.length() != 0) {
            try {
                new JSONObject(requestJson);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
