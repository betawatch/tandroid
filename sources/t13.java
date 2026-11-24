// default package

import android.os.Bundle;
import android.os.ResultReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t13 {
    public static d03 a(String str, String str2) {
        return rp5.a(str, "CREATE_CANCELED") ? new b03(str2) : rp5.a(str, "CREATE_INTERRUPTED") ? new f03(str2) : new c03(str2, (byte) 2);
    }

    public static us4 b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new pj7(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new vs4(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new rs4(str2);
            }
        }
        return new ts4(str2, (byte) 2);
    }

    public static void c(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(ConnectionsManager.DEFAULT_DATACENTER_ID, bundle);
    }
}
