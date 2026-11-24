// default package

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ure {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = lu8.a;
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
