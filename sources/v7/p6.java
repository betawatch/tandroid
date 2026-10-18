package v7;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class p6 {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = d1.f.a;
        String optString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.i.b(optString);
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        kotlin.jvm.internal.i.d(decode, "decode(...)");
        return decode;
    }
}
