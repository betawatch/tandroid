package v0;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o extends h {
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(String str) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", r2, new Bundle(), false, hd.p.a);
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
        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
    }
}
