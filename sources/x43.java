// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class x43 extends e23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(String str, Bundle bundle, byte b) {
        super(str, bundle);
        switch (b) {
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                lq5.j("password should not be empty");
                throw null;
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                lq5.j("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                lq5.j("type should not be empty");
                throw null;
        }
    }
}
