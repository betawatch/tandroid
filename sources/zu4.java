// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zu4 extends c33 {
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zu4(String str) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", r2, new Bundle(), false, q34.a);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        this.e = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        u36.j("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
