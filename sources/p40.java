// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class p40 {
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
                fa4.g(e, true);
            }
        }
        return arrayList;
    }
}
