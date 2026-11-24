// default package

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xte {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = mw8.a;
        String optString = jSONObject.optString("challenge", "");
        optString.getClass();
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        decode.getClass();
        return decode;
    }
}
