// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class r40 {
    public static void a() {
        a.b.getSharedPreferences("saved_tokens_login", 0).edit().clear().apply();
        a.b.getSharedPreferences("saved_tokens", 0).edit().clear().apply();
    }

    public static ArrayList b() {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens_login", 0);
        int i = sharedPreferences.getInt("count", 0);
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_in_token_" + i2, "")));
                TLRPC.auth_Authorization TLdeserialize = TLRPC.auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize instanceof TLRPC.TL_auth_authorization) {
                    arrayList.add((TLRPC.TL_auth_authorization) TLdeserialize);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return arrayList;
    }
}
