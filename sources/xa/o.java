package xa;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    public final String b;
    public final long c;

    public o(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    public static String a(long j10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static o b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new o(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new o(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}
