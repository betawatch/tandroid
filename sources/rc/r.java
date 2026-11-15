package rc;

import java.security.SecureRandom;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class r {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            Class<?>[] clsArr = {String.class};
            SecureRandom secureRandom = k.a;
            try {
                Class.forName("javax.net.ssl.SNIHostName").getConstructor(clsArr);
            } catch (Exception unused) {
            }
            try {
                Class.forName("javax.net.ssl.SSLParameters").getMethod("setServerNames", List.class);
            } catch (Exception unused2) {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
