package v0;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class m extends b2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, int i10, Bundle data) {
        super(str, data);
        switch (i10) {
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("password should not be empty");
                }
                return;
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                kotlin.jvm.internal.i.e(data, "data");
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("type should not be empty");
                }
                return;
        }
    }
}
