// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tbe {
    public static w13 a(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new n23(string, bundle);
                        } catch (Exception unused) {
                            throw new kr4();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new x13("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                }
                throw new kr4();
            }
            if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    x13 x13Var = new x13("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle2);
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return x13Var;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new kr4();
                }
            }
            throw new kr4();
        } catch (kr4 unused4) {
            x13 x13Var2 = new x13(str, bundle);
            if (str.length() > 0) {
                return x13Var2;
            }
            u36.j("type should not be empty");
            return null;
        }
    }
}
