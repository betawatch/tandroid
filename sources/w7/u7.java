package w7;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class u7 {
    public static v0.c a(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        try {
            int hashCode = type.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            kotlin.jvm.internal.i.b(string);
                            return new v0.f(string, data);
                        } catch (Exception unused) {
                            throw new z0.a();
                        }
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new v0.d("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
                }
                throw new z0.a();
            }
            if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    kotlin.jvm.internal.i.b(string2);
                    Bundle bundle = new Bundle();
                    bundle.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    v0.d dVar = new v0.d("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return dVar;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new z0.a();
                }
            }
            throw new z0.a();
        } catch (z0.a unused4) {
            v0.d dVar2 = new v0.d(type, data);
            if (type.length() > 0) {
                return dVar2;
            }
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
