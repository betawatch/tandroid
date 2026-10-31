package w7;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class g8 {
    public static b2.h a(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            kotlin.jvm.internal.i.b(string);
                            v0.l lVar = new v0.l("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", data);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return lVar;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new z0.a();
                        }
                    }
                    throw new z0.a();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new w0.k("The device does not contain a restore credential.");
                        }
                        v0.l lVar2 = new v0.l("androidx.credentials.TYPE_RESTORE_CREDENTIAL", data);
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return lVar2;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new z0.a();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            kotlin.jvm.internal.i.b(string3);
                            kotlin.jvm.internal.i.b(string4);
                            return new v0.l(string4, 2, data);
                        } catch (Exception unused4) {
                            throw new z0.a();
                        }
                    }
                    throw new z0.a();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            kotlin.jvm.internal.i.b(string5);
                            return new v0.l(string5, 3, data);
                        } catch (Exception unused5) {
                            throw new z0.a();
                        }
                    }
                    throw new z0.a();
                default:
                    throw new z0.a();
            }
        } catch (z0.a unused6) {
            return new v0.l(str, 0, data);
        }
    }
}
